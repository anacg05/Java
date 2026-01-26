import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nome;
        String nomeMaisPesada = "";
        String nomeMaisAlta = "";

        double peso;
        double altura;

        double maiorPeso = 0;
        double maiorAltura = 0;

        for (int i = 1; i <= 6; i++) {
            System.out.println("\nPessoa " + i);

            System.out.print("Nome: ");
            nome = scanner.next();

            System.out.print("Peso (kg): ");
            peso = scanner.nextDouble();

            System.out.print("Altura (m): ");
            altura = scanner.nextDouble();

            if (i == 1 || peso > maiorPeso) {
                maiorPeso = peso;
                nomeMaisPesada = nome;
            }

            if (i == 1 || altura > maiorAltura) {
                maiorAltura = altura;
                nomeMaisAlta = nome;
            }
        }

        System.out.println("\nPessoa mais pesada:");
        System.out.println("Nome: " + nomeMaisPesada + " | Peso: " + maiorPeso + " kg");

        System.out.println("\nPessoa mais alta:");
        System.out.println("Nome: " + nomeMaisAlta + " | Altura: " + maiorAltura + " m");

        scanner.close();
    }
}
