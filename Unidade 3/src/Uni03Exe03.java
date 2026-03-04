import java.util.Scanner;

public class Uni03Exe03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite o preço do litro da gasolina:");
        double precoGasolina = teclado.nextDouble();
        System.out.println("Digite o valor do pagamento:");
        double valorPagamento = teclado.nextDouble();
        double litros = valorPagamento/precoGasolina;
        System.out.printf("O motorista conseguiu colocar: %.2f litros.",  litros); 
    }
}
