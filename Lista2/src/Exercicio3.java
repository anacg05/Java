import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int golsTimeA = -1, golsTimeB = -1;

        while (golsTimeA < 0 || golsTimeB < 0) {
            if (golsTimeA < 0) {
                System.out.print("Digite a quantidade de gols do Time A: ");
                golsTimeA = scanner.nextInt();

                if (golsTimeA < 0) {
                    System.out.println("Valor inválido. Número de gols não pode ser negativo.");
                }
            }

            if (golsTimeB < 0) {
                System.out.print("Digite a quantidade de gols do Time B: ");
                golsTimeB = scanner.nextInt();

                if (golsTimeB < 0) {
                    System.out.println("Valor inválido. Número de gols não pode ser negativo.");
                }
            }
        }

        if (golsTimeA > golsTimeB) {
            System.out.println("Vitória do Time A!");

        } else if (golsTimeB > golsTimeA) {
            System.out.println("Vitória do Time B!");

        } else {
            System.out.println("Empate!");
        }

        scanner.close();

    }
}
