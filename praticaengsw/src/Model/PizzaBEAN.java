package Model;

public class PizzaBEAN {

    int id;
    String nome;
    String detalhes;
    int status;

    public PizzaBEAN(int id, String nome, String detalhes, int status) {
        this.id = id;
        this.nome = nome;
        this.detalhes = detalhes;
        this.status = status;
    }

    public PizzaBEAN() {
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

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}
