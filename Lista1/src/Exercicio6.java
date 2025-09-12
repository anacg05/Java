import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double nota1, nota2, media;

        System.out.print("Informe a primeira nota: ");
        nota1 = scan.nextDouble();

        System.out.print("Informe a segunda nota: ");
        nota2 = scan.nextDouble();

        media = (nota1 * 0.4) + (nota2 * 0.6);

        System.out.printf("A média ponderada é: %.2f%n", media);

        scan.close();
    }
}
