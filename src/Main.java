import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LivroRepository livroRepository = new LivroRepository();

        int opcao;

        do {
            System.out.println("\nBem-vindo ao Sistema de Gerenciamento de Biblioteca");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adicionar um Livro");
            System.out.println("2 - Alugar um Livro");
            System.out.println("3 - Devolver um Livro");
            System.out.println("4 - Ver Livros Alugados");
            System.out.println("5 - Ver Livros Disponíveis");
            System.out.println("6 - Sair");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Adicionar um Livro
                    System.out.println("Informe os detalhes do livro:");
                    System.out.print("ID: ");
                    int idLivro = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Título: ");
                    String tituloLivro = scanner.nextLine();
                    System.out.print("Autor: ");
                    String autorLivro = scanner.nextLine();
                    System.out.print("Ano de Publicação: ");
                    int anoPublicacaoLivro = scanner.nextInt();

                    Livro novoLivro = new Livro(idLivro, tituloLivro, autorLivro, anoPublicacaoLivro, Status.DISPONIVEL);
                    livroRepository.addLivro(novoLivro);

                    System.out.println("Livro adicionado com sucesso!");
                    break;

                case 2:
                    // Alugar um livro
                    System.out.println("Informe o ID do livro que deseja alugar:");
                    int idAlugar = scanner.nextInt();
                    livroRepository.alugarLivro(idAlugar);
                    break;

                case 3:
                    // Devolver um livro
                    System.out.println("Informe o ID do livro que deseja devolver:");
                    int idDevolver = scanner.nextInt();
                    livroRepository.devolverLivro(idDevolver);
                    break;

                case 4:
                    // Livros alugados
                    livroRepository.verLivrosAlugados();
                    break;

                case 5:
                    // Livros disponíveis
                    livroRepository.verLivrosDisponiveis();
                    break;

                case 6:
                    System.out.println("Saindo do Sistema de Gerenciamento de Biblioteca. Até mais!");
                    break;

                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }

        } while (opcao != 6);

        scanner.close();
    }
}