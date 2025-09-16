import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        // Lê 10 números
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }

        // Menu de opções
        char opcao = ' ';
        while (true) {
            System.out.println("\nO que deseja saber?");
            System.out.println("a) Quantos números pares");
            System.out.println("b) Quantos números ímpares");
            System.out.println("c) Quantos negativos");
            System.out.println("d) Quantos positivos");
            System.out.println("e) Sair do programa");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.next().toLowerCase().charAt(0); // permite 'A' ou 'a'

            int count = 0;

            switch (opcao) {
                case 'a': // pares
                    for (int n : numeros) {
                        if (n % 2 == 0)
                            count++;
                    }
                    System.out.println("Quantidade de números pares: " + count);
                    break;

                case 'b': // ímpares
                    for (int n : numeros) {
                        if (n % 2 != 0)
                            count++;
                    }
                    System.out.println("Quantidade de números ímpares: " + count);
                    break;

                case 'c': // negativos
                    for (int n : numeros) {
                        if (n < 0)
                            count++;
                    }
                    System.out.println("Quantidade de números negativos: " + count);
                    break;

                case 'd': // positivos
                    for (int n : numeros) {
                        if (n > 0)
                            count++;
                    }
                    System.out.println("Quantidade de números positivos: " + count);
                    break;

                case 'e': // sair
                    System.out.println("Saindo do programa...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida! Escolha entre a, b, c, d ou e.");
            }
        }
    }

}
