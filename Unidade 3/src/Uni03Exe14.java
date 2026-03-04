import java.util.Scanner;

public class Uni03Exe14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite a distância percorrida(em quilômetros):");
        double distancia = teclado.nextDouble();
        System.out.println("Digite o tempo gasto(em horas):");
        double tempo = teclado.nextDouble();
        double velocidadeMedia = distancia/tempo;
        double autonomia = 12.0;
        double combustivel = distancia/autonomia;
        System.out.printf("A velocidade média foi de %.2f km/h e a quantidade de combustível usado foi %.2f litros.", velocidadeMedia, combustivel);
    }
}
