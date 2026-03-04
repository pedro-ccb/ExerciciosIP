import java.util.Scanner;

public class Uni03Exe05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite a quantidade de frangos que irão ser marcados:");
        int frangos = teclado.nextInt();
        int total = frangos*11;
        System.out.println("O gasto total para marcar " + frangos + " é de R$" + total);
    }
}
