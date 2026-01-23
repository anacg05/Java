import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;
        int incremento;

        // Leitura do número
        System.out.print("Digite um número: ");
        numero = scanner.nextInt();

        while (numero < 0) {
            System.out.print("Número inválido. Digite um número maior ou igual a zero: ");
            numero = scanner.nextInt();
        }

        // Leitura do incremento
        System.out.print("Digite o incremento: ");
        incremento = scanner.nextInt();

        while (incremento <= 0) {
            System.out.print("Incremento inválido. Digite um valor maior que zero: ");
            incremento = scanner.nextInt();
        }

        // Exibição dos valores
        System.out.print("Saída do programa: ");
        for (int i = 0; i <= numero; i += incremento) {
            System.out.print(i + ", ");
        }

        scanner.close();
    }

}
