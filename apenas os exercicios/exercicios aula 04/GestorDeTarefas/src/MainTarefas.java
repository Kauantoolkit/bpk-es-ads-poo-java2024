import java.time.LocalDate;

public class MainTarefas {
    public static void main(String[] args) {
        System.out.println("=== Sistema de Gestão de Tarefas ===");

        // Criando usuários
        Usuario usuario1 = new Usuario("Ana Paula", "ana.paula@example.com");
        Usuario usuario2 = new Usuario("Carlos Silva", "carlos.silva@example.com");

        // Criando tarefas
        Tarefa tarefa1 = new Tarefa("Implementar API", "Desenvolver a API REST", LocalDate.now(), LocalDate.now().plusDays(3), usuario1);
        Tarefa tarefa2 = new Tarefa("Testar aplicação", "Realizar testes de integração", LocalDate.now().plusDays(1), LocalDate.now().plusDays(4), usuario2);
        Tarefa tarefa3 = new Tarefa("Escrever documentação", "Criar documentação técnica", LocalDate.now().plusDays(2), LocalDate.now().plusDays(5), usuario1);

        // Criando projeto
        Projeto projeto = new Projeto("Desenvolvimento de Software", "Projeto para criar um sistema web");
        projeto.adicionarTarefa(tarefa1);
        projeto.adicionarTarefa(tarefa2);
        projeto.adicionarTarefa(tarefa3);

        // Marcando uma tarefa como concluída
        tarefa1.marcarConcluida();

        // Exibindo progresso do projeto
        System.out.println("Progresso do projeto '" + projeto.getNome() + "': " + projeto.calcularProgresso() + "%");

        // Exibindo tarefas do projeto
        System.out.println("\nTarefas do projeto:");
        for (Tarefa tarefa : projeto.getTarefas()) {
            System.out.println("- " + tarefa.getTitulo() + " | Concluída: " + tarefa.isConcluida());
        }
    }
}
