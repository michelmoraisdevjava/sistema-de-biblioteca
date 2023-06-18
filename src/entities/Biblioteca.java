package entities;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca implements BibliotecaInterface {
    private List<Livro> catalogo;

    public Biblioteca() {
        this.catalogo = new ArrayList<>();
    }

    @Override
    public void cadastrarLivro(Livro livro) {
        catalogo.add(livro);
    }

    @Override
    public Livro consultarLivro(String titulo) {
        for (Livro livro : catalogo) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null;
    }

    @Override
    public void emprestarLivro(String titulo) throws LivroIndisponivelException, LivroNaoEncontradoException {
        Livro livro = consultarLivro(titulo);
        if (livro == null) {
            throw new LivroNaoEncontradoException("Livro não encontrado no catálogo.");
        }
        if (livro.isDisponivel()) {
            livro.setDisponivel(false);
            System.out.println("Livro emprestado com sucesso: " + livro.getTitulo());
        } else {
            throw new LivroIndisponivelException("Livro indisponível para empréstimo.");
        }
    }

    @Override
    public void devolverLivro(String titulo) throws LivroNaoEncontradoException {
        Livro livro = consultarLivro(titulo);
        if (livro == null) {
            throw new LivroNaoEncontradoException("Livro não encontrado no catálogo.");
        }
        livro.setDisponivel(true);
        System.out.println("Livro devolvido: " + livro.getTitulo());
    }
}
