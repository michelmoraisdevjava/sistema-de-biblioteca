package entities;

public class LivroNaoEmprestadoException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public LivroNaoEmprestadoException() {
		super("Livro n�o foi emprestado anteriormente.");
	}
}
