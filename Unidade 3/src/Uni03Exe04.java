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
        double notaFinal = (nota1*5.0 + nota2*3.0 + nota3*2.0)/10.0;
        System.out.printf("A nota final do aluno é de %.2f.",  notaFinal);
    }
}
