import java.util.Scanner;

public class Uni03Exe11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite a temperatura em °C:");
        double temperaturaC = teclado.nextDouble();
        double temperaturaF = (1.8)*temperaturaC + 32;
        System.out.printf("A temperatura em °F é: %.2f",temperaturaF);
    }
}
