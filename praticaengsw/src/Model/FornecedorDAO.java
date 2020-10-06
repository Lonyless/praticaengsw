package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class FornecedorDAO {

    private static FornecedorDAO instance;

    private FornecedorDAO() {
        MySQLDAO.getConnection();
    }

    public static FornecedorDAO getInstance() {
        if (instance == null) {
            instance = new FornecedorDAO();
        }
        return instance;
    }

    public long create(FornecedorBEAN fornecedor) {
        String query = "INSERT INTO fornecedor (razao_social, endereco, status) VALUES (?,?,1)";
        return MySQLDAO.executeQuery(query, fornecedor.getRazaoSocial(), fornecedor.getEndereco());
    }

    public void update(FornecedorBEAN fornecedor) {
        String query = "UPDATE fornecedor SET razao_social=?, endereco=?, status=? WHERE id = ?";
        MySQLDAO.executeQuery(query, fornecedor.getRazaoSocial(), fornecedor.getEndereco(), fornecedor.getStatus(), fornecedor.getId());
    }

    public void delete(FornecedorBEAN fornecedor) {
        MySQLDAO.executeQuery("DELETE FROM CONTATOS WHERE id = ?", fornecedor.getId());
    }

    public ArrayList<FornecedorBEAN> findAllPessoa() {
        return listaContatos("SELECT * FROM fornecedor ORDER BY id");
    }

    public ArrayList<FornecedorBEAN> listaContatos(String query) {
        ArrayList<FornecedorBEAN> lista = new ArrayList<FornecedorBEAN>();
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(query);
        try {
            while (rs.next()) {
                lista.add(new FornecedorBEAN(rs.getInt("id"), rs.getString("razao_social"), rs.getString("endereco"), rs.getInt("status")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public FornecedorBEAN findFornecedor(int id) {
        FornecedorBEAN result = null;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("SELECT * FROM fornecedor WHERE id=?", id);
        try {
            if (rs.next()) {
                result = new FornecedorBEAN(rs.getInt("id"), rs.getString("razao_social"), rs.getString("endereco"));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public int findId(FornecedorBEAN fornecedor) {
        int result = 0;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(
                "SELECT * FROM fornecedor WHERE razao_social = ? and endereco = ?", fornecedor.getRazaoSocial(), fornecedor.getEndereco());
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
        rs = MySQLDAO.getResultSet("SELECT * FROM fornecedor WHERE id= ?", id);
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
