import java.util.Scanner;

public class Uni03Exe10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite o valor de um cateto do triângulo:");
        double cateto1 = teclado.nextDouble();
        System.out.println("Digite o valor do outro cateto do triângulo:");
        double cateto2 = teclado.nextDouble();
        double hipotenusa = Math.sqrt(cateto1*cateto1 + cateto2*cateto2);
        System.out.printf("A hipotenusa é: %.2f", hipotenusa);
    }
}
