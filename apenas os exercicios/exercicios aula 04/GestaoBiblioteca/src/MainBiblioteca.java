import java.time.LocalDate;

public class MainBiblioteca {
    public static void main(String[] args) {
        System.out.println("=== Sistema de Gestão de Biblioteca ===");
        Livro livro = new Livro("Dom Casmurro", "Machado de Assis", "123-456789", 3);
        Leitor leitor = new Leitor("Maria Oliveira", "2023001", LocalDate.of(1995, 8, 20));
        Emprestimo emprestimo = new Emprestimo(livro, leitor, LocalDate.now(), LocalDate.now().plusDays(7));

        System.out.println("Livro disponível antes do empréstimo? " + livro.isDisponivel());
        emprestimo.devolverLivro();
        System.out.println("Livro disponível após devolução? " + livro.isDisponivel());
    }
}
