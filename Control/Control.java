package Control;

import Model.CardapioBEAN;
import Model.CardapioDAO;
import Model.EventoBEAN;
import Model.EventoDAO;
import java.util.ArrayList;
import java.util.Date;

import Model.FornecedorBEAN;
import Model.FornecedorDAO;
import Model.IngredienteBEAN;
import Model.IngredienteDAO;
import Model.PizzaBEAN;
import Model.PizzaDAO;
import java.sql.SQLException;

public class Control {

    public Control() {
    }

    public void addFornecedor(FornecedorBEAN fornecedor) {
        FornecedorDAO.getInstance().create(fornecedor);
    }

    public void updateFornecedor(FornecedorBEAN fornecedor) {

        FornecedorDAO.getInstance().update(fornecedor);
    }

    public void deleteFornecedor(FornecedorBEAN fornecedor) {
        FornecedorDAO.getInstance().delete(fornecedor);
    }

    public FornecedorBEAN findFornecedor(int id) {
        return FornecedorDAO.getInstance().findFornecedor(id);
    }

    public int findIdFornecedor(FornecedorBEAN fornecedor) {
        return FornecedorDAO.getInstance().findId(fornecedor);
    }

    public Boolean isExist(int id) {
        return FornecedorDAO.getInstance().isExist(id);
    }

    public ArrayList<FornecedorBEAN> listaFornecedor() {
        return FornecedorDAO.getInstance().findAllPessoa();
    }

    public void addIngrediente(IngredienteBEAN ingrediente) {
        IngredienteDAO.getInstance().create(ingrediente);
    }

    public void updateIngrediente(IngredienteBEAN ingrediente) {
        IngredienteDAO.getInstance().update(ingrediente);
    }

    public void deleteIngrediente(IngredienteBEAN ingrediente) {
        IngredienteDAO.getInstance().delete(ingrediente);
    }

    public IngredienteBEAN findIngrediente(int id) {
        return IngredienteDAO.getInstance().findIngrediente(id);
    }

    public int findIdIngrediente(IngredienteBEAN ingrediente) {
        return IngredienteDAO.getInstance().findId(ingrediente);
    }

    public Boolean isExistIngrediente(int id) {
        return IngredienteDAO.getInstance().isExist(id);
    }

    public ArrayList<IngredienteBEAN> listaIngrediente() {
        return IngredienteDAO.getInstance().findAllIngrediente();
    }
//------------------------------------------------------------------------------

    public void addEvento(EventoBEAN evento) {
        EventoDAO.getInstance().create(evento);
    }

    public void updateEvento(EventoBEAN evento) {
        EventoDAO.getInstance().update(evento);
    }

    public void deleteEvento(EventoBEAN evento) {
        EventoDAO.getInstance().delete(evento);
    }

    public EventoBEAN findEvento(int id) {
        return EventoDAO.getInstance().findEvento(id);
    }

    public int findIdEvento(EventoBEAN evento) {
        return EventoDAO.getInstance().findId(evento);
    }

    public Boolean isExistEvento(int id) {
        return EventoDAO.getInstance().isExist(id);
    }

    public ArrayList<EventoBEAN> listaEvento() {
        return EventoDAO.getInstance().findAllEvento();
    }

//----------------------------------------------------------------------------------------------
    public ArrayList<IngredienteBEAN> listIngredientePizza(PizzaBEAN pizza) {
        return PizzaDAO.getInstance().listIngredientePizza(pizza);
    }

    public void addPizza(PizzaBEAN pizza, ArrayList<IngredienteBEAN> ingredienteList) throws SQLException {
        PizzaDAO.getInstance().create(pizza, ingredienteList);
    }

    public void updatePizza(PizzaBEAN pizza, ArrayList<IngredienteBEAN> ingredienteList) {
        PizzaDAO.getInstance().update(pizza, ingredienteList);
    }

    public void updatePizza(PizzaBEAN pizza) {
        PizzaDAO.getInstance().update(pizza);
    }

    public PizzaBEAN findPizza(int id) {
        return PizzaDAO.getInstance().findPizza(id);
    }

    public ArrayList<PizzaBEAN> listaPizza() {
        return PizzaDAO.getInstance().findAllPizza();
    }

    //--------------------------------------------------------------------------------------------------------------------
    public ArrayList<PizzaBEAN> listCardapioPizza(CardapioBEAN cardapio) {
        return CardapioDAO.getInstance().listCardapioPizza(cardapio);
    }

    public void addCardapio(CardapioBEAN cardapio, ArrayList<PizzaBEAN> pizzaList) throws SQLException {
        CardapioDAO.getInstance().create(cardapio, pizzaList);
    }

    public void updateCardapio(CardapioBEAN cardapio, ArrayList<PizzaBEAN> pizzaList) {
        CardapioDAO.getInstance().update(cardapio, pizzaList);
    }

    public void updateCardapio(CardapioBEAN cardapio) {
        CardapioDAO.getInstance().update(cardapio);
    }

    public CardapioBEAN findCardapio(int id) {
        return CardapioDAO.getInstance().findCardapio(id);
    }

    public ArrayList<CardapioBEAN> listaCardapio() {
        return CardapioDAO.getInstance().findAllCardapio();
    }
}
