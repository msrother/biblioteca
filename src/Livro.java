enum Status {
    DISPONIVEL, ALUGADO
}

public class Livro {
    private int id;
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private Status status;

    public Livro(int id, String titulo, String autor, int anoPublicacao, Status status) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    // Método toString()
    @Override
    public String toString() {
        return "Livro{" +
                "id = " + id +
                ", titulo = '" + titulo + '\'' +
                ", autor = '" + autor + '\'' +
                ", anoPublicacao = " + anoPublicacao +
                ", status = " + status +
                '}';
    }

}