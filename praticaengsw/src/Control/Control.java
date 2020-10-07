package Control;

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
}
