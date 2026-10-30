
import java.util.Scanner;

class Produto {
    String titulo;
    String descricao;
    double precoUnitario;
    int qtdEstoque;
}

public class TarefaProdutoI {

    public static Produto preencherValores() {
        Scanner sc = new Scanner(System.in);
        Produto p = new Produto();

        System.out.print("Digite o titulo: ");
        p.titulo = sc.nextLine();
        System.out.print("Digite a descricao: ");
        p.descricao = sc.nextLine();
        System.out.print("Digite o preco unitario: ");
        p.precoUnitario = sc.nextDouble();
        System.out.print("Digite a quantidade em estoque: ");
        p.qtdEstoque = sc.nextInt();
        return p;
    }

    public static void imprimirValores(Produto p) {
        System.out.println("Titulo: " + p.titulo);
        System.out.println("Descricao: " + p.descricao);
        System.out.println("Preco Unitario: " + p.precoUnitario);
        System.out.println("Estoque: " + p.qtdEstoque);
    }

    public static void main(String[] args) {
        System.out.println("Produto 1");
        Produto p1 = preencherValores();

        System.out.println("\nProduto 2");
        Produto p2 = preencherValores();

        System.out.println("\nProdutos Cadastrados");
        System.out.println("\nProduto 1");
        imprimirValores(p1);

        System.out.println("\nProduto 2");
        imprimirValores(p2);
    }
}
