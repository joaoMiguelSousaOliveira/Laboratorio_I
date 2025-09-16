import java.util.ArrayList;
import java.util.Scanner;

public class Restaurante {
    private ArrayList<Pedido> pedidos;
    private Scanner scanner;
    private int proximoNUmeroPedido;

    public Restaurante() {
        pedidos = new ArrayList<>();
        scanner = new Scanner(System.in);
        proximoNUmeroPedido  = 1;
    }

    public void iniciar() {
        int opcao;
        do {
            System.out.println("\n=== SISTEMA DO RESTAURANTE ===");
            System.out.println("1. Criar novo pedido");
            System.out.println("2. Listar pedidos");
            System.out.println("3. Remover pedido");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            System.out.println("------------------------------");

            switch (opcao) {
                case 1 -> criarPedido();
                case 2 -> listarPedidos();
                case 3 -> removerPedido();
                case 4 -> System.out.println("Encerrando sistema...........\n" +
                        "==============================");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 4);
    }


    private void criarPedido() {
        System.out.println("---- Criando novo pedido ----");

        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        Pedido pedido = new Pedido(nomeCliente, proximoNUmeroPedido++);

        String desejaContinuar;

        do {
            System.out.print("Digite o nome do item que deseja: ");
            String nomeItem = scanner.nextLine();

            System.out.print("Digite o preço do item: ");
            double precoItem = scanner.nextDouble();
            scanner.nextLine();

            Item item = new Item(nomeItem, precoItem);
            pedido.adicionarItem(item);

            System.out.print("Deseja adicionar outro item? (s/n) ");
            desejaContinuar = scanner.nextLine();

        } while (desejaContinuar.equalsIgnoreCase("s"));

        pedidos.add(pedido);
        pedido.exibirNotaFiscal(pedido);
        System.out.println("------------------------------");
    }

    private void listarPedidos() {
        if (pedidos.isEmpty()) {
            System.out.println("Nenhum pedido registrado");
            System.out.println("------------------------------");
            return;
        }

        System.out.println("---- Pedidos Registrados ----");
        for (Pedido pedido : pedidos) {
            pedido.exibirNotaFiscal(pedido);
        }
    }

    private void removerPedido() {
        System.out.print("Digite o número do pedido que deseja remover: ");
        int numeroParaRemover = scanner.nextInt();
        scanner.nextLine();

        boolean removido = false;

        for (int i = 0; i < pedidos.size(); i++) {
            if (pedidos.get(i).getNumeroPedido() == numeroParaRemover) {
                pedidos.remove(i);
                System.out.println("----------------------------------------");
                System.out.println("Pedido #" + numeroParaRemover + " removido com sucesso.......");
                System.out.println("----------------------------------------");
                removido = true;
                break;
            }
        }
        if (!removido) {
            System.out.println("Pedido com o número " + numeroParaRemover + " não encontrado");
        }

    }

    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();
        restaurante.iniciar();
    }
}