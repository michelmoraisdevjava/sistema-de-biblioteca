package entities;

public interface BibliotecaInterface {
	void cadastrarLivro(Livro livro);

	Livro consultarLivro(String titulo);

	void emprestarLivro(String titulo) throws LivroIndisponivelException, LivroNaoEncontradoException;

	void devolverLivro(String titulo) throws LivroNaoEncontradoException;
}
