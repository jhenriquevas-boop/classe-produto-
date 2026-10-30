import java.util.Scanner;
class Produto{
    String titulo;
    String descricao;
    double precounitario;
    int qtdEstoque; 
}
public class TarefaProduto{
    public static void main(String[] args){
        System.out.println("hello");
        Scanner sc = new Scanner(System.in);
        Produto p1 = new Produto();
        Produto p2 = new Produto();

        System.out.println("Produto 1");
        System.out.print("titulo: ");
        p1.titulo = sc.nextLine();
        System.out.print("descricao: ");
        p1.descricao = sc.nextLine();
        System.out.print("precounitario: ");
        p1.precounitario = sc.nextDouble();
        System.out.print("Quantidade em estoque: ");
        p1.qtdEstoque = sc.nextInt();

        System.out.println("Produto 2");
System.out.print("titulo: ");
p2.titulo = sc. nextLine();
System.out.print("descricao: ");
p2.descricao = sc.nextLine();
System.out.print("precounitario: ");
p2.precounitario = sc. nextDouble();
System.out.print("Quantidade em estoque: ");
p2.qtdEstoque = sc.nextInt();

System.out.println("Produto 1: " + p1.titulo + " | " + p1.descricao + " | R$ " + p1.precounitario + " | " + p1.qtdEstoque + "un. ");
System.out.println("Produto 2: " + p2.titulo + " | " + p2.descricao  + " | R$ " + p2.precounitario + " | " + p2.qtdEstoque + " un.");
    }
} 