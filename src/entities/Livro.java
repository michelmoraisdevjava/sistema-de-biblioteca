package entities;

public class Livro {
    private String titulo;
    private String autor;
    private String ISBN;
    private boolean disponivel;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
	}

	public Livro(String titulo, String autor, String ISBN, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.anoPublicacao = anoPublicacao;
        this.disponivel = true;
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

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    
    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void emprestar() throws LivroIndisponivelException {
        if (!disponivel) {
            throw new LivroIndisponivelException("Livro indisponível para empréstimo: " + titulo);
        }
        disponivel = false;
    }

    public void devolver() {
        disponivel = true;
    }
    
}
