import java.util.Scanner;

public class Uni03Exe13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite o comprimento(em metros):");
        double comprimento = teclado.nextDouble();
        System.out.println("Digite a altura(em metros):");
        double altura = teclado.nextDouble();
        double precoAzu = 12.5*9;
        double valorGasto = precoAzu*altura*comprimento;
        System.out.printf("O valor final é R$%.2f.", valorGasto);
    }
}
