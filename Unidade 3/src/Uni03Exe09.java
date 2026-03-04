import java.util.Scanner;

public class Uni03Exe09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite o raio da lata de óleo:");
        double raio = teclado.nextDouble();
        System.out.println("Digite a altura da lata de óleo:");
        double altura = teclado.nextDouble();
        double volume = Math.PI*raio*raio*altura;
        System.out.printf("O volume da lata de óleo é: %.2f", volume);
    }
}