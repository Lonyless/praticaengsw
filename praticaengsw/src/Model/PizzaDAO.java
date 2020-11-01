package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

    public void insertAuxiliar(List<IngredienteBEAN> ingredienteList) throws SQLException {

        List<PizzaBEAN> listPizza = findAllPizza();

        int id = 0;
        for (PizzaBEAN pizza : listPizza) {
            id = pizza.getId();
        }

        String query = "INSERT INTO aux_pizza_ingrediente (id_pizza,id_ingrediente) VALUES (?,?)";
        for (IngredienteBEAN ingrediente : ingredienteList) {
            MySQLDAO.executeQuery(query, id, ingrediente.getId());
        }
    }

    public void updateAuxiliar(PizzaBEAN pizza, List<IngredienteBEAN> ingredienteList) {
        String query = "INSERT INTO aux_pizza_ingrediente (id_pizza,id_ingrediente) VALUES (?,?)";

        for (IngredienteBEAN ingrediente : ingredienteList) {
            MySQLDAO.executeQuery(query, pizza.getId(), ingrediente.getId());
        }
    }

    public void create(PizzaBEAN pizza, List<IngredienteBEAN> ingredienteList) throws SQLException {

        String query = "INSERT INTO pizza (nome,detalhes,status) VALUES (?,?,?)";
        MySQLDAO.executeQuery(query, pizza.getNome(), pizza.getDetalhes(), pizza.getStatus());

        insertAuxiliar(ingredienteList);
    }

    public void update(PizzaBEAN pizza, List<IngredienteBEAN> ingredienteList) {

        String query = "delete from aux_pizza_ingrediente where id_pizza=?";
        MySQLDAO.executeQuery(query, pizza.getId());
        
        
        updateAuxiliar(pizza, ingredienteList);
        System.out.println("auxiliar working");
        
        query = "UPDATE pizza SET nome=?, detalhes=?, status=? WHERE id = ?";
        MySQLDAO.executeQuery(query, pizza.getNome(), pizza.getDetalhes(), pizza.getStatus(), pizza.getId());
    }

    public void update(PizzaBEAN pizza) {
        String query = "UPDATE pizza SET nome=?, detalhes=?, status=? WHERE id = ?";
        MySQLDAO.executeQuery(query, pizza.getNome(), pizza.getDetalhes(), pizza.getStatus(), pizza.getId());
    }

    public ArrayList<IngredienteBEAN> listIngredientePizza(PizzaBEAN pizza) {

        ArrayList<IngredienteBEAN> lista = new ArrayList<IngredienteBEAN>();
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("select * from ingrediente"
                + " join aux_pizza_ingrediente on aux_pizza_ingrediente.id_ingrediente = ingrediente.id"
                + " and aux_pizza_ingrediente.id_pizza=?", pizza.getId());

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

    public void delete(PizzaBEAN pizza) {
        MySQLDAO.executeQuery("DELETE FROM pizza WHERE id = ?", pizza.getId());
    }

    public ArrayList<PizzaBEAN> findAllPizza() {
        return listaPizza("SELECT * FROM pizza ORDER BY id");
    }

    public ArrayList<PizzaBEAN> listaPizza(String query) {
        ArrayList<PizzaBEAN> lista = new ArrayList<PizzaBEAN>();
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(query);
        try {
            while (rs.next()) {
                lista.add(new PizzaBEAN(
                        rs.getInt("id"), rs.getString("nome"), rs.getString("detalhes"),
                        rs.getInt("status")));
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
        rs = MySQLDAO.getResultSet("SELECT * FROM pizza WHERE id=?", id);
        try {
            if (rs.next()) {
                result = new PizzaBEAN(rs.getInt("id"),
                        rs.getString("nome"), rs.getString("detalhes"),
                        rs.getInt("status"));
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
                "SELECT * FROM pizza WHERE nome = ? and detalhes = ?", pizza.getNome(), pizza.getDetalhes());
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
        rs = MySQLDAO.getResultSet("SELECT * FROM pizza WHERE id= ?", id);
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
