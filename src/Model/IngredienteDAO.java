package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class IngredienteDAO {

    private static IngredienteDAO instance;

    private IngredienteDAO() {
        MySQLDAO.getConnection();
    }

    public static IngredienteDAO getInstance() {
        if (instance == null) {
            instance = new IngredienteDAO();
        }
        return instance;
    }

    public long create(IngredienteBEAN ingrediente) {
        String query = "INSERT INTO ingrediente (nome, medida, id_fornecedor, status) VALUES (?,?,?,1)";
        return MySQLDAO.executeQuery(query, ingrediente.getNome(), ingrediente.getMedida(), ingrediente.getId_fornecedor());
    }

    public void update(IngredienteBEAN ingrediente) {
        String query = "UPDATE ingrediente SET nome=?, medida=?, id_fornecedor=?, status=? WHERE id = ?";
        MySQLDAO.executeQuery(query, ingrediente.getNome(), ingrediente.getMedida(), ingrediente.getId_fornecedor(), ingrediente.getStatus(), ingrediente.getId());
    }

    public void delete(IngredienteBEAN ingrediente) {
        MySQLDAO.executeQuery("DELETE FROM ingrediente WHERE id = ?", ingrediente.getId());
    }

    public ArrayList<IngredienteBEAN> findAllIngrediente() {
        return listaIngrediente("SELECT * FROM ingrediente ORDER BY id");
    }

    public ArrayList<IngredienteBEAN> listaIngrediente(String query) {
        ArrayList<IngredienteBEAN> lista = new ArrayList<IngredienteBEAN>();
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(query);
        try {
            while (rs.next()) {
                lista.add(new IngredienteBEAN(
                        rs.getInt("id"), rs.getString("nome"), rs.getString("medida"),
                        rs.getInt("id_fornecedor"), rs.getInt("status")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public IngredienteBEAN findIngrediente(int id) {
        IngredienteBEAN result = null;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("SELECT * FROM ingrediente WHERE id=?", id);
        try {
            if (rs.next()) {
                result = new IngredienteBEAN(rs.getInt("id"),
                        rs.getString("nome"), rs.getString("medida"),
                        rs.getInt("id_fornecedor"), rs.getInt("status"));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public int findId(IngredienteBEAN ingrediente) {
        int result = 0;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(
                "SELECT * FROM fornecedor WHERE nome = ? and id_fornecedor = ?", ingrediente.getNome(), ingrediente.getId_fornecedor());
        try {
            if (rs.next()) {
                result = rs.getInt("id");
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

    public Boolean isExist(int id) {
        Boolean result = false;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("SELECT * FROM ingrediente WHERE id= ?", id);
        try {
            if (rs.next()) {
                result = true;
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}
