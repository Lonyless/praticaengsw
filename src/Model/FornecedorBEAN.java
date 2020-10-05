package Model;

import java.util.Date;

public class FornecedorBEAN {

    private int id;
    private String razaoSocial;
    private String endereco;
    private int status;

    public FornecedorBEAN(int id, String nome, String endereco) {
        this.id = id;
        this.razaoSocial = nome;
        this.endereco = endereco;
        this.status = 1;
    }

    public FornecedorBEAN(int id, String nome, String endereco, int status) {
        this.id = id;
        this.razaoSocial = nome;
        this.endereco = endereco;
        this.status = status;
    }

    public FornecedorBEAN() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}
