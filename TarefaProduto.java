import java.util.Scanner;

class Produto {
    String titulo;
    String descricao;
    double precounitario;
    int qtdEstoque;
}

public class TarefaProduto {
    public static void main(String[] args) {
        System.out.println("hello");
        Scanner sc = new Scanner(System.in);
        Produto p1 = new Produto();
        Produto p2 = new Produto();

        System.out.println("Produto 1");
        System.out.print("Digite o titulo: ");
        p1.titulo = sc.nextLine();
        System.out.print("Digite a descricao: ");
        p1.descricao = sc.nextLine();
        System.out.print("Digite o preco unitario: ");
        p1.precounitario = sc.nextDouble();
        System.out.print("Digite a quantidade em estoque: ");
        p1.qtdEstoque = sc.nextInt();

        sc.nextLine();
        System.out.println("");

        System.out.println("Produto 2");
        System.out.print("Digite o titulo: ");
        p2.titulo = sc.nextLine();
        System.out.print("Digite a descricao: ");
        p2.descricao = sc.nextLine();
        System.out.print("Digite o preco unitario: ");
        p2.precounitario = sc.nextDouble();
        System.out.print("Digite a quantidade em estoque: ");
        p2.qtdEstoque = sc.nextInt();

        System.out.println("\nProdutos Cadastrados");

        System.out.println("\nProduto 1");
        System.out.println("Titulo: " + p1.titulo);
        System.out.println("Descricao: " + p1.descricao);
        System.out.println("Preco Unitario: " + p1.precounitario);
        System.out.println("Quatidade em Estoque: " + p1.qtdEstoque);

        System.out.println("\nProduto 2");
        System.out.println("Titulo: " + p2.titulo);
        System.out.println("Descricao: " + p2.descricao);
        System.out.println("Preco Unitario: " + p2.precounitario);
        System.out.println("Quatidade em Estoque: " + p2.qtdEstoque);

    }
}