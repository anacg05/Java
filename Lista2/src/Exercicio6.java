import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSorteado = random.nextInt(100) + 1; // 1 a 100
        int numeroUsuario = 0;
        int tentativas = 3;
        boolean acertou = false;

        System.out.println("Você tem 3 chances para adivinhar o número da sorte (1 a 100)!");

        // Validação
        for (int i = 1; i <= tentativas; i++) {
            numeroUsuario = 0;

            while (numeroUsuario < 1 || numeroUsuario > 100) {
                System.out.print("Tentativa " + i + ": Digite seu número: ");
                numeroUsuario = scanner.nextInt();

                if (numeroUsuario < 1 || numeroUsuario > 100) {
                    System.out.println("Número inválido! Digite um número entre 1 e 100.");
                }
            }

            // Verificação
            if (numeroUsuario == numeroSorteado) {
                System.out.println("Você acertou!");
                acertou = true;
                break;

            } else {
                 System.out.println("Você errou!");

                if (numeroUsuario < numeroSorteado) {
                    System.out.println("O número sorteado é MAIOR");

                } else {
                    System.out.println("O número sorteado é MENOR");
                }

                if (i < tentativas) {
                    System.out.println("Tente novamente...");
                }
            }

        }

        if (!acertou) {
            System.out.println("Suas tentativas acabaram! O número era: " + numeroSorteado);
        }
        scanner.close();

    }

}
