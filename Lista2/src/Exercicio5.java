import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int qtdAtual = -1, qtdMax = -1, qtdMin = -1;
        double qtdMedia = 0;

        // Validação da quantidade máxima
        while (qtdMax <= 0) {
            System.out.print("Digite a quantidade máxima em estoque (maior que 0): ");
            qtdMax = scanner.nextInt();

            if (qtdMax <= 0) {
                System.out.println("Valor inválido! Tente novamente.");
            }
        }

        // Validação da quantidade mínima
        while (qtdMin < 0 || qtdMin >= qtdMax) {
            System.out.print("Digite a quantidade mínima em estoque (maior ou igual a 0): ");
            qtdMin = scanner.nextInt();

            if (qtdMin < 0 || qtdMin >= qtdMax) {
                System.out.println("Valor inválido! Tente novamente.");
            }
        }

        // Validação da quantidade atual
        while (qtdAtual < 0) {
            System.out.print("Digite a quantidade atual em estoque (maior ou igual a 0): ");
            qtdAtual = scanner.nextInt();

            if (qtdAtual < 0) {
                System.out.println("Valor inválido! Tente novamente.");
            }
        }

        qtdMedia = (qtdMax + qtdMin) / 2.0;

        if (qtdAtual >= qtdMedia) {
            System.out.println("Não efetuar compra");

        } else {
            System.out.println("Efetuar compra");
        }

        scanner.close();

    }

}
