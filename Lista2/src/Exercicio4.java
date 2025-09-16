import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int destino = 0, refeicao = 0;
        double valorBase = 3000, valorFinal = 0;

        // Verificação Destino
        while (destino != 1 && destino != 2) {
            System.out.print("Escolha o destino (1 - Maceió | 2 - Porto de Galinhas): ");
            destino = scanner.nextInt();

            if (destino != 1 && destino != 2) {
                System.out.println("Opção inválida! Digite 1 ou 2.");
            }
        }

        // Verificação Refeição
        while (refeicao != 1 && refeicao != 2) {
            System.out.print("Deseja almoço/janta incluso? (1 - Sim | 2 - Não): ");
            refeicao = scanner.nextInt();

            if (refeicao != 1 && refeicao != 2) {
                System.out.println("Opção inválida! Digite 1 ou 2.");
            }
        }

        switch (destino) {
            case 1: // Maceió
                if (refeicao == 1) {
                    valorFinal = valorBase * 2.0; // +100%
                } else {
                    valorFinal = valorBase * 1.85; // +85%
                }
                break;

            case 2: // Porto de Galinhas
                if (refeicao == 1) {
                    valorFinal = valorBase * 1.60; // +60%
                } else {
                    valorFinal = valorBase * 1.45; // +45%
                }
                break;
        }

        System.out.printf("Valor final da viagem: R$ %.2f%n", valorFinal);

        scanner.close();
    }

}
