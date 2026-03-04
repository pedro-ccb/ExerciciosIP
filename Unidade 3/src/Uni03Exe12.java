import java.util.Scanner;

public class Uni03Exe12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite o seu nome:");
        String nome = teclado.nextLine();
         System.out.println("Digite a quantidade de horas trabalhadas nesse mês:");
        int horas = teclado.nextInt();
        System.out.println("Digite a quantidade de pessoas dependentes da sua família:");
        int dependentes = teclado.nextInt();
        double salarioBruto = 60*dependentes + 10*horas;
        double salarioLiquido = (salarioBruto - 60*dependentes)*0.865;
        System.out.printf("O funcionário %s possui um salário bruto de R$%.2f e um salário líquido de R$%.2f", nome, salarioBruto, salarioLiquido);
    }
}
