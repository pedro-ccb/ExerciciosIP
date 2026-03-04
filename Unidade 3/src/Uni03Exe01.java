
// Análise: Ok;
// Entradas: Largura e comprimento;
// Saídas: Área;
// Processo:  Área = largura*comprimento.

import java.util.Scanner;
public class Uni03Exe01 {
    public static void main(String[] arg){
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite a largura:");
        float largura = teclado.nextFloat();
        System.out.println("Digite o comprimento:");
        float comprimento = teclado.nextFloat();
        float area = largura*comprimento;
        System.out.println("A área do terreno é " + area +"m²");
    }
}
