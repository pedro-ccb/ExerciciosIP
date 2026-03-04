
// Análise: Ok;
// Entradas: Nota 1, nota 2 e nota 3 de um aluno;
// Saídas: Média ponderada das três notas;
// Processo:  Média ponderada = [(Nota 1)*5 + (Nota 2)*3 + (Nota 3)*2]/10.

import java.util.Scanner;
public class Uni03Exe04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite a primeira nota do aluno:");
        double nota1 = teclado.nextDouble();
        System.out.println("Digite a segunda nota do aluno:");
        double nota2 = teclado.nextDouble();
        System.out.println("Digite a terceira nota do aluno:");
        double nota3 = teclado.nextDouble();
        double mediaPonderada = (nota1*5 + nota2*3 + nota3*2)/10.0;
        System.out.printf("A média ponderada das notas do aluno é de %.2f.",  mediaPonderada);
    }
}
