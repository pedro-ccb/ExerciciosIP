import java.util.Scanner;

public class Uni03Exe15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite o número(inteiro) desejado:");
        int num = teclado.nextInt();
        int centena = num/100;
        int dezena = num%100/10;
        int unidade = num%10;
        System.out.printf("%d centena(s), %d dezena(s) e %d unidade(s).", centena, dezena, unidade);
    }
}
