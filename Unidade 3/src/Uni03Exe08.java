import java.util.Scanner;

public class Uni03Exe08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite a quantidade de dólares que deseja trocar:");
        double dolar = teclado.nextDouble();
        double cotacaoHoje = 5.65;
        double valorReal = dolar*cotacaoHoje;
        System.out.printf("O atendente deve devolver R$%.2f para o cliente.", valorReal);
    }
}
