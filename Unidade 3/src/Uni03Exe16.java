import java.util.Scanner;

public class Uni03Exe16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite o valor total da compra:");
        int valorCompra = teclado.nextInt();
        System.out.println("Digite o valor recebido pelo cliente:");
        int valorRecebido = teclado.nextInt();
        int valorTroco = valorRecebido - valorCompra;
        int notas100= valorTroco/100;
        int notas10 = valorTroco%100/10;
        int notas1 = valorTroco%10;
        int somaNotas = notas1 + notas10 + notas100;
        System.out.printf("O número mínimo de notas de troco é: %d.\n", somaNotas);
        System.out.printf("A quantidade de notas de 100 necessárias é: %d.\n", notas100);
        System.out.printf("A quantidade de notas de 10 necessárias é: %d.\n", notas10);
        System.out.printf("A quantidade de notas de 1 necessárias é: %d.", notas1);
    }
}
