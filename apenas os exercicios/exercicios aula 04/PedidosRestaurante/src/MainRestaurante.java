import java.time.LocalDate;

public class MainRestaurante {
    public static void main(String[] args) {
        System.out.println("=== Sistema de Gestão de Pedidos de um Restaurante ===");

        // Criando cliente
        Cliente cliente = new Cliente("Carlos Souza", "987.654.321-00");

        // Criando pratos
        Prato prato1 = new Prato("Pizza Margherita", "Pizza com queijo, molho de tomate e manjericão", 40.0);
        Prato prato2 = new Prato("Lasagna", "Lasanha à bolonhesa", 50.0);
        Prato prato3 = new Prato("Salada Caesar", "Salada com alface, parmesão e molho Caesar", 25.0);

        // Criando pedido
        Pedido pedido = new Pedido(cliente, LocalDate.now());

        // Adicionando itens ao pedido
        ItemPedido item1 = new ItemPedido(prato1, 2); // 2 Pizzas Margherita
        ItemPedido item2 = new ItemPedido(prato2, 1); // 1 Lasanha
        ItemPedido item3 = new ItemPedido(prato3, 3); // 3 Saladas Caesar
        pedido.adicionarItem(item1);
        pedido.adicionarItem(item2);
        pedido.adicionarItem(item3);

        // Exibindo informações do pedido
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Data do Pedido: " + pedido.getData()); // Updated method name
        System.out.println("\nItens do Pedido:");
        for (ItemPedido item : pedido.getItens()) {
            System.out.println("- " + item.getQuantidade() + "x " + item.getPrato().getNome() + " (R$ " + item.getPrato().getPreco() + " cada)");
        }

        // Exibindo valor total
        System.out.println("\nValor total do pedido: R$ " + pedido.calcularValorTotal());
    }
}