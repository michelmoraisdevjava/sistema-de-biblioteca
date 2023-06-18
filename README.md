# Sistema de Gerenciamento de Biblioteca

## Descrição

O projeto apresentado é um sistema simples de gerenciamento de uma biblioteca. Ele permite realizar operações básicas, como cadastrar livros, consultar informações de um livro, emprestar um livro e devolvê-lo.

## Funcionalidades

Aqui estão as principais funcionalidades do programa:

1. **Cadastrar Livro**: Permite cadastrar um novo livro na biblioteca, solicitando informações como título, autor e ano de publicação.

2. **Consultar Livro**: Permite consultar as informações de um livro específico, com base no título fornecido pelo usuário. Caso o livro seja encontrado, as informações de título, autor e ano de publicação são exibidas.

3. **Emprestar Livro**: Permite emprestar um livro da biblioteca. O usuário informa o título do livro a ser emprestado. O programa verifica se o livro está disponível para empréstimo e, caso esteja, realiza o empréstimo com sucesso. Caso contrário, são exibidas mensagens informando se o livro não foi encontrado ou está indisponível para empréstimo.

4. **Devolver Livro**: Permite devolver um livro emprestado. O usuário informa o título do livro a ser devolvido. O programa verifica se o livro está registrado como emprestado e, caso esteja, realiza a devolução com sucesso. Se o livro não for encontrado, é exibida uma mensagem informando que o livro não foi encontrado.

O programa apresenta um menu de opções numeradas, onde o usuário pode escolher a operação desejada. O loop principal mantém o programa em execução até que a opção "5 - Encerrar o programa" seja selecionada.

## Classes e Exceções

O projeto utiliza as seguintes classes e exceções:

- **Biblioteca**: Classe responsável por encapsular a lógica relacionada ao funcionamento da biblioteca.

- **Livro**: Classe que representa um livro, contendo informações como título, autor e ano de publicação.

- **LivroNaoEncontradoException**: Exceção lançada quando um livro não é encontrado na biblioteca.

- **LivroIndisponivelException**: Exceção lançada quando um livro está indisponível para empréstimo.

## Como Utilizar

Para utilizar o sistema de gerenciamento de biblioteca, siga os passos abaixo:

1. Clone o repositório em sua máquina local.

2. Abra o projeto em sua IDE preferida.

3. Execute a classe `Main` para iniciar o programa.

4. Siga as instruções exibidas no console para interagir com o sistema e realizar as operações desejadas.

## Contribuições

Contribuições para a melhoria deste sistema de gerenciamento de biblioteca são sempre bem-vindas. Se você tiver alguma sugestão, correção de bugs ou novas funcionalidades, sinta-se à vontade para abrir uma issue ou enviar um pull request.
