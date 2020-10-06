package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PizzaDAO {

    private static PizzaDAO instance;

    private PizzaDAO() {
        MySQLDAO.getConnection();
    }

    public static PizzaDAO getInstance() {
        if (instance == null) {
            instance = new PizzaDAO();
        }
        return instance;
    }

    public long create(PizzaBEAN pizza) {
        String query = "INSERT INTO ingrediente (nome, medida, id_fornecedor, status) VALUES (?,?,?,1)";
        return MySQLDAO.executeQuery(query, ingrediente.getNome(), ingrediente.getMedida(), ingrediente.getId_fornecedor());
    }

    public void update(PizzaBEAN pizza) {
        String query = "UPDATE ingrediente SET nome=?, medida=?, id_fornecedor=?, status=? WHERE id = ?";
        MySQLDAO.executeQuery(query, ingrediente.getNome(), ingrediente.getMedida(), ingrediente.getId_fornecedor(), ingrediente.getStatus(), ingrediente.getId());
    }

    public void delete(PizzaBEAN pizza) {
        MySQLDAO.executeQuery("DELETE FROM ingrediente WHERE id = ?", ingrediente.getId());
    }

    public ArrayList<PizzaBEAN> findAllIngrediente() {
        return listaPizza("SELECT * FROM ingrediente ORDER BY id");
    }

    public ArrayList<PizzaBEAN> listaPizza(String query) {
        ArrayList<PizzaBEAN> lista = new ArrayList<PizzaBEAN>();
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(query);
        try {
            while (rs.next()) {
                lista.add(new PizzaBEAN(
                        rs.getInt("id"), rs.getString("nome"), rs.getString("medida"),
                        rs.getInt("id_fornecedor"), rs.getInt("status")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public PizzaBEAN findPizza(int id) {
        PizzaBEAN result = null;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("SELECT * FROM ingrediente WHERE id=?", id);
        try {
            if (rs.next()) {
                result = new PizzaBEAN(rs.getInt("id"),
                        rs.getString("nome"), rs.getString("medida"),
                        rs.getInt("id_fornecedor"), rs.getInt("status"));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public int findId(PizzaBEAN pizza) {
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
