import java.util.Scanner;

public class Uni03Exe06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite o peso do prato em quilos:");
        double peso = teclado.nextDouble();
        double tara = 0.75;
        double total = (peso-tara)*25;
        System.out.printf("O valor do prato do cliente é R$%.2f",total);
    }
}
