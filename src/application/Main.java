package application;

import java.util.Scanner;

import entities.Biblioteca;
import entities.Livro;
import entities.LivroIndisponivelException;
import entities.LivroNaoEncontradoException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        int opcao;

        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    cadastrarLivro(scanner, biblioteca);
                    break;
                case 2:
                    consultarLivro(scanner, biblioteca);
                    break;
                case 3:
                    emprestarLivro(scanner, biblioteca);
                    break;
                case 4:
                    devolverLivro(scanner, biblioteca);
                    break;
                case 5:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida. Digite novamente.");
                    break;
            }

            System.out.println();
        } while (opcao != 5);
    }

    private static void exibirMenu() {
        System.out.println("----- Biblioteca -----");
        System.out.println("1 - Cadastrar livro");
        System.out.println("2 - Consultar livro");
        System.out.println("3 - Emprestar livro");
        System.out.println("4 - Devolver livro");
        System.out.println("5 - Encerrar o programa");
        System.out.println("Digite a opção desejada:");
    }

    private static void cadastrarLivro(Scanner scanner, Biblioteca biblioteca) {
        System.out.println("Digite o título do livro:");
        String titulo = scanner.nextLine();

        System.out.println("Digite o autor do livro:");
        String autor = scanner.nextLine();

        System.out.println("Digite o ano de publicação do livro:");
        int anoPublicacao = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        Livro livro = new Livro(titulo, autor, anoPublicacao);
        biblioteca.cadastrarLivro(livro);

        System.out.println("Livro cadastrado com sucesso!");
    }

    private static void consultarLivro(Scanner scanner, Biblioteca biblioteca) {
        System.out.println("Digite o título do livro a ser consultado:");
        String titulo = scanner.nextLine();

        Livro livro = biblioteca.consultarLivro(titulo);

        if (livro != null) {
            System.out.println("Título: " + livro.getTitulo());
            System.out.println("Autor: " + livro.getAutor());
            System.out.println("Ano de Publicação: " + livro.getAnoPublicacao());
        } else {
            System.out.println("Livro não encontrado.");
        }
    }

    private static void emprestarLivro(Scanner scanner, Biblioteca biblioteca) {
        System.out.println("Digite o título do livro a ser emprestado:");
        String titulo = scanner.nextLine();

        try {
            biblioteca.emprestarLivro(titulo);
            System.out.println("Livro emprestado com sucesso!");
        } catch (LivroNaoEncontradoException e) {
            System.out.println("Livro não encontrado.");
        } catch (LivroIndisponivelException e) {
            System.out.println("Livro indisponível para empréstimo.");
        }
    }

    private static void devolverLivro(Scanner scanner, Biblioteca biblioteca) {
        System.out.println("Digite o título do livro a ser devolvido:");
        String titulo = scanner.nextLine();

        try {
            biblioteca.devolverLivro(titulo);
            System.out.println("Livro devolvido com sucesso!");
        } catch (LivroNaoEncontradoException e) {
            System.out.println("Livro não encontrado.");
        }
    }
}
