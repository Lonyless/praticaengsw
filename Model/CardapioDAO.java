package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CardapioDAO {

    private static CardapioDAO instance;

    private CardapioDAO() {
        MySQLDAO.getConnection();
    }

    public static CardapioDAO getInstance() {
        if (instance == null) {
            instance = new CardapioDAO();
        }
        return instance;
    }

    public void insertAuxiliar(List<PizzaBEAN> pizzaList) throws SQLException {

        List<CardapioBEAN> listCardapio = findAllCardapio();

        int id = 0;
        for (CardapioBEAN cardapio : listCardapio) {
            id = cardapio.getId();
        }
        
        System.out.println(id);

        String query = "INSERT INTO aux_pizza_cardapio (id_pizza,id_cardapio) VALUES (?,?)";
        for (PizzaBEAN pizza : pizzaList) {
            MySQLDAO.executeQuery(query, pizza.getId(), id);
        }
    }

    public void updateAuxiliar(CardapioBEAN cardapio, List<PizzaBEAN> pizzaList) {
        String query = "INSERT INTO aux_pizza_ingrediente (id_pizza,id_ingrediente) VALUES (?,?)";

        for (PizzaBEAN pizza : pizzaList) {
            MySQLDAO.executeQuery(query, cardapio.getId(), pizza.getId());
        }
    }

    public void create(CardapioBEAN cardapio, List<PizzaBEAN> pizzaList) throws SQLException {

        String query = "INSERT INTO cardapio (nome,detalhes,status) VALUES (?,?,?)";
        MySQLDAO.executeQuery(query, cardapio.getNome(), cardapio.getDetalhes(), cardapio.getStatus());

        insertAuxiliar(pizzaList);
    }

    public void update(CardapioBEAN cardapio, List<PizzaBEAN> pizzaList) {

        String query = "delete from aux_pizza_cardapio where id_cardapio=?";
        MySQLDAO.executeQuery(query, cardapio.getId());

        updateAuxiliar(cardapio, pizzaList);

        query = "UPDATE cardapio SET nome=?, detalhes=?, status=? WHERE id = ?";
        MySQLDAO.executeQuery(query, cardapio.getNome(), cardapio.getDetalhes(), cardapio.getStatus(), cardapio.getId());
    }

    public void update(CardapioBEAN cardapio) {
        String query = "UPDATE cardapio SET nome=?, detalhes=?, status=? WHERE id = ?";
        MySQLDAO.executeQuery(query, cardapio.getNome(), cardapio.getDetalhes(), cardapio.getStatus(), cardapio.getId());
    }

    public ArrayList<PizzaBEAN> listCardapioPizza(CardapioBEAN cardapio) {

        ArrayList<PizzaBEAN> lista = new ArrayList<PizzaBEAN>();
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("select * from pizza"
                + " join aux_pizza_cardapio on aux_pizza_cardapio.id_pizza = pizza.id"
                + " and aux_pizza_cardapio.id_cardapio=?", cardapio.getId());

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

    public void delete(CardapioBEAN cardapio) {
        MySQLDAO.executeQuery("DELETE FROM cardapio WHERE id = ?", cardapio.getId());
    }

    public ArrayList<CardapioBEAN> findAllCardapio() {
        return listaCardapio("SELECT * FROM cardapio ORDER BY id");
    }

    public ArrayList<CardapioBEAN> listaCardapio(String query) {
        ArrayList<CardapioBEAN> lista = new ArrayList<CardapioBEAN>();
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(query);
        try {
            while (rs.next()) {
                lista.add(new CardapioBEAN(
                        rs.getInt("id"), rs.getString("nome"), rs.getString("detalhes"),
                        rs.getInt("status")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public CardapioBEAN findCardapio(int id) {
        CardapioBEAN result = null;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("SELECT * FROM cardapio WHERE id=?", id);
        try {
            if (rs.next()) {
                result = new CardapioBEAN(rs.getInt("id"),
                        rs.getString("nome"), rs.getString("detalhes"),
                        rs.getInt("status"));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public int findId(CardapioBEAN cardapio) {
        int result = 0;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(
                "SELECT * FROM cardapio WHERE nome = ? and detalhes = ?", cardapio.getNome(), cardapio.getDetalhes());
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
        rs = MySQLDAO.getResultSet("SELECT * FROM cardapio WHERE id= ?", id);
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
