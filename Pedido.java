import java.util.ArrayList;

public class Pedido {
    private ArrayList<Item> itens;
    private String nomeCliente;
    private int numeroPedido;

    public Pedido(String nomeCliente, int numeroPedido) {
        itens = new ArrayList<>();
        this.nomeCliente = nomeCliente;
        this.numeroPedido = numeroPedido;
    }


    public String getNomeCliente() {
        return nomeCliente;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public void removerItem(Item item) {
        itens.remove(item);
    }

    public double calcularPedido() {
        double total = 0.0;

        for (Item item : itens) {
            total += item.getPrecoItem();
        }
        return total;
    }

    public void exibirItens() {
        if (itens.isEmpty()) {
            System.out.println("Nenhum item no pedido");
        }
        for (Item item : itens) {
            System.out.println("- " + item.getNomeItem() + " R$ " + item.getPrecoItem());
        }
    }

    public void exibirNotaFiscal(Pedido pedido) {
        System.out.println("\n========================================");
        System.out.println("            Restaurante IMD");
        System.out.println("========================================");
        System.out.println("Pedido Nº " + pedido.getNumeroPedido());
        System.out.println("Cliente: " + pedido.getNomeCliente());
        System.out.println("----------------------------------------");
        System.out.println("Itens:");
        pedido.exibirItens();
        System.out.println("----------------------------------------");
        System.out.println("Total: R$ " + pedido.calcularPedido());
        System.out.println("========================================");
        System.out.println("Obrigado pela preferência! :)");
        System.out.println("========================================\n");
    }
}
