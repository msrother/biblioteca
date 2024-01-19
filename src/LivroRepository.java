import java.util.ArrayList;
import java.util.List;

public class LivroRepository {
    private List<Livro> livros;

    public LivroRepository() {
        this.livros = new ArrayList<>();
    }

    public void addLivro(Livro livro) {
        livros.add(livro);
    }

    public void alugarLivro(int idLivro) {
        Livro livro = encontrarLivroPorId(idLivro);
        if (livro != null && livro.getStatus() == Status.DISPONIVEL) {
            livro.setStatus(Status.ALUGADO);
            System.out.println("Livro alugado com sucesso!");
        } else {
            System.out.println("Livro não disponível para aluguel.");
        }
    }

    public void devolverLivro(int idLivro) {
        Livro livro = encontrarLivroPorId(idLivro);
        if (livro != null && livro.getStatus() == Status.ALUGADO) {
            livro.setStatus(Status.DISPONIVEL);
            System.out.println("Livro devolvido com sucesso!");
        } else {
            System.out.println("Este livro não pode ser devolvido.");
        }
    }

    public void verLivrosAlugados() {
        List<Livro> livrosAlugados = livros.stream()
                .filter(livro -> livro.getStatus() == Status.ALUGADO)
                .toList();

        if (livrosAlugados.isEmpty()) {
            System.out.println("Nenhum livro alugado no momento.");
        } else {
            System.out.println("Livros Alugados:");
            livrosAlugados.forEach(System.out::println);
        }
    }

    public void verLivrosDisponiveis() {
        List<Livro> livrosDisponiveis = livros.stream()
                .filter(livro -> livro.getStatus() == Status.DISPONIVEL)
                .toList();

        if (livrosDisponiveis.isEmpty()) {
            System.out.println("Nenhum livro disponível no momento.");
        } else {
            System.out.println("Livros Disponíveis:");
            livrosDisponiveis.forEach(System.out::println);
        }
    }

    private Livro encontrarLivroPorId(int idLivro) {
        return livros.stream()
                .filter(livro -> livro.getId() == idLivro)
                .findFirst()
                .orElse(null);
    }
}