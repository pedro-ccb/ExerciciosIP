
// Análise: Fica implícito que devemos subtrair o peso do prato do cliente com o próprio peso do prato;
// Entradas: Peso do prato do cliente;
// Saídas: Valor do prato do cliente;
// Processo:  Valor do prato do cliente = [(Peso do prato do cliente) - (Peso do prato)]*25.

import java.util.Scanner;
public class Uni03Exe07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite a quantidade de latas de 350ml compradas:");
        double lata = teclado.nextDouble();
        System.out.println("Digite a quantidade de garrafas 600ml compradas:");
        double garrafa600 = teclado.nextDouble();
        System.out.println("Digite a quantidade de garrafas 2l compradas:");
        double garrafa2l = teclado.nextDouble();
        double totalLata = lata*0.35;
        double totalGarrafa600 = garrafa600*0.6;
        double totalGarrafa2l = garrafa2l*2;
        double total = totalLata + totalGarrafa600 + totalGarrafa2l;
        System.out.printf("O clinete comprou ao total %.2f litros.", total);
    }
}
