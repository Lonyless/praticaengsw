package Model;

public class IngredienteBEAN {

    private int id;
    private String nome;
    private String medida;
    private int id_fornecedor;
    private int status;

    public IngredienteBEAN(int id, String nome, String medida, int id_fornecedor, int status) {
        this.id = id;
        this.nome = nome;
        this.medida = medida;
        this.id_fornecedor = id_fornecedor;
        this.status = status;
    }

    public IngredienteBEAN(String nome, String medida, int id_fornecedor, int status) {
        this.id = id;
        this.nome = nome;
        this.medida = medida;
        this.id_fornecedor = id_fornecedor;
        this.status = 1;
    }

    public IngredienteBEAN(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public IngredienteBEAN(String nome) {
        this.nome = nome;
    }

    public IngredienteBEAN(int id) {
        this.id = id;
    }

    public IngredienteBEAN() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    public int getId_fornecedor() {
        return id_fornecedor;
    }

    public void setId_fornecedor(int id_fornecedor) {
        this.id_fornecedor = id_fornecedor;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}
