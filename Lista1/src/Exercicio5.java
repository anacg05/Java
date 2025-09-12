import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int horas, minutos, segundos, totalSegundos;

        System.out.print("Informe a quantidade de horas: ");
        horas = scan.nextInt();

        System.out.print("Informe a quantidade de minutos: ");
        minutos = scan.nextInt();

        System.out.print("Informe a quantidade de segundos: ");
        segundos = scan.nextInt();

        totalSegundos = (horas * 3600) + (minutos * 60) + segundos;

        System.out.printf("O horário em segundos é: %d segundos.%n", totalSegundos);

        scan.close();
    }
}
