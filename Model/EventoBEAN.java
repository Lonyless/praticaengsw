package Model;

public class EventoBEAN {

    private int id;
    private String nome;

    private int id_cardapio;
    private int status;

    public EventoBEAN(int id, String nome, int id_cardapio, int status) {
        this.id = id;
        this.nome = nome;
        this.id_cardapio = id_cardapio;
        this.status = status;
    }

    public EventoBEAN(String nome, int id_cardapio, int status) {
        this.id = id;
        this.nome = nome;
        this.id_cardapio = id_cardapio;
        this.status = 1;
    }

    public EventoBEAN(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public EventoBEAN(String nome) {
        this.nome = nome;
    }

    public EventoBEAN(int id) {
        this.id = id;
    }

    public EventoBEAN() {
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

    public int getId_cardapio() {
        return id_cardapio;
    }

    public void setId_cardapio(int id_cardapio) {
        this.id_cardapio = id_cardapio;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}
