import java.util.Scanner;


public class Exercicio2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int idade;
        double altura, peso;

        int qtdIdadeAcima50 = 0;
        int qtdAlturaAcima160 = 0;
        int qtdPesoAbaixo80 = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Pessoa " + i);

            // Validação da idade
            System.out.print("Digite a idade: ");
            idade = scan.nextInt();
            while (idade <= 0) {
                System.out.print("Idade inválida. Digite novamente: ");
                idade = scan.nextInt();
            }

            // Validação da altura
            System.out.print("Digite a altura (em metros): ");
            altura = scan.nextDouble();
            while (altura <= 0) {
                System.out.print("Altura inválida. Digite novamente: ");
                altura = scan.nextDouble();
            }

            // Validação do peso
            System.out.print("Digite o peso (em kg): ");
            peso = scan.nextDouble();
            while (peso <= 0) {
                System.out.print("Peso inválido. Digite novamente: ");
                peso = scan.nextDouble();
            }

            // Verificações
            if (idade > 50) {
                qtdIdadeAcima50++;
            }

            if (altura > 1.60) {
                qtdAlturaAcima160++;
            }

            if (peso < 80) {
                qtdPesoAbaixo80++;
            }

            System.out.println("----------------------");
        }

        // Resultados
        System.out.println("Resultados:");
        System.out.println("Pessoas com idade acima de 50 anos: " + qtdIdadeAcima50);
        System.out.println("Pessoas com altura acima de 1.60m: " + qtdAlturaAcima160);
        System.out.println("Pessoas com peso abaixo de 80kg: " + qtdPesoAbaixo80);

        scan.close();
    }
}
