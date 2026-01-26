import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int totalPessoas = 0;
        int positivos = 0;
        int negativos = 0;
        double saldo;
        char opcao;

        do {
            // Entrada do saldo
            System.out.print("Informe o saldo da pessoa: ");
            saldo = scanner.nextDouble();

            totalPessoas++;

            if (saldo >= 0) {
                positivos++;
            } else {
                negativos++;
            }

            // Pergunta se deseja continuar (validação com WHILE)
            System.out.print("Deseja informar outro saldo? (S/N): ");
            opcao = scanner.next().charAt(0);

            while (opcao != 'S' && opcao != 's' && opcao != 'N' && opcao != 'n') {
                System.out.print("Opção inválida! Digite S para continuar ou N para encerrar: ");
                opcao = scanner.next().charAt(0);
            }

        } while (opcao == 'S' || opcao == 's');

        // Cálculo da porcentagem de saldos positivos
        double percentualPositivos = (positivos * 100.0) / totalPessoas;

        System.out.println("\nTotal de pessoas: " + totalPessoas);
        System.out.println("Saldos positivos: " + positivos);
        System.out.println("Saldos negativos: " + negativos);

        if (percentualPositivos >= 50) {
            System.out.println("Nenhum risco!");
        } else {
            System.out.println("Risco ao banco!");
        }

        scanner.close();
    }
}
