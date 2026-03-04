import java.util.Scanner;

public class Uni03Exe02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite o preço do produto desejado:");
        double produto = teclado.nextDouble();
        double desconto = produto*0.12;
        double preco = produto*0.88;
        System.out.println("O valor do desconto é de R$" + desconto);
        System.out.println("O preço do par de sapatos com desconto é R$" + preco);
    }
}
