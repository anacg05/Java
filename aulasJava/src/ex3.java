import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {

        double peso, altura, imc;
        Scanner scan = new Scanner(System.in);

        System.out.printf("Digite sua altura (m): ");
        altura = scan.nextDouble();

        System.out.printf("Digite seu peso (kg): ");
        peso = scan.nextDouble();

        imc = peso / (altura * altura);

        System.out.printf("O seu IMC é: %.2f", imc);
        scan.close();
    }
}
