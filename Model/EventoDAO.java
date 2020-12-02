package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EventoDAO {

    private static EventoDAO instance;

    private EventoDAO() {
        MySQLDAO.getConnection();
    }

    public static EventoDAO getInstance() {
        if (instance == null) {
            instance = new EventoDAO();
        }
        return instance;
    }

    public long create(EventoBEAN evento) {
        String query = "INSERT INTO evento (nome, id_cardapio, status) VALUES (?,?,1)";
        return MySQLDAO.executeQuery(query, evento.getNome(), evento.getId_cardapio());
    }

    public void update(EventoBEAN evento) {
        String query = "UPDATE evento SET nome=?, id_cardapio=?, status=? WHERE id = ?";
        MySQLDAO.executeQuery(query, evento.getNome(), evento.getId_cardapio(), evento.getStatus(), evento.getId());
    }

    public void delete(EventoBEAN evento) {
        MySQLDAO.executeQuery("DELETE FROM evento WHERE id = ?", evento.getId());
    }

    public ArrayList<EventoBEAN> findAllEvento() {
        return listaEvento("SELECT * FROM evento ORDER BY id");
    }

    public ArrayList<EventoBEAN> listaEvento(String query) {
        ArrayList<EventoBEAN> lista = new ArrayList<EventoBEAN>();
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(query);
        try {
            while (rs.next()) {
                lista.add(new EventoBEAN(
                        rs.getInt("id"), rs.getString("nome"),
                        rs.getInt("id_cardapio"), rs.getInt("status")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public EventoBEAN findEvento(int id) {
        EventoBEAN result = null;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("SELECT * FROM evento WHERE id=?", id);
        try {
            if (rs.next()) {
                result = new EventoBEAN(rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getInt("id_cardapio"), rs.getInt("status"));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public int findId(EventoBEAN evento) {
        int result = 0;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(
                "SELECT * FROM evento WHERE nome = ? and id_cardapio = ?", evento.getNome(), evento.getId_cardapio());
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
        rs = MySQLDAO.getResultSet("SELECT * FROM evento WHERE id= ?", id);
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
