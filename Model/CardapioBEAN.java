package Model;

public class CardapioBEAN {

    int id;
    String nome;
    String detalhes;
    int status;

    public CardapioBEAN(int id, String nome, String detalhes, int status) {
        this.id = id;
        this.nome = nome;
        this.detalhes = detalhes;
        this.status = status;
    }

    public CardapioBEAN(String nome, String detalhes, int status) {
        this.id = id;
        this.nome = nome;
        this.detalhes = detalhes;
        this.status = status;
    }

    public CardapioBEAN(int id) {
        this.id = id;
    }

    public CardapioBEAN() {
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
