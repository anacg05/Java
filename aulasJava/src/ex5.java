import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {

        double base, altura, area;
        Scanner scan = new Scanner(System.in);

        System.out.printf("Digite a base do triangulo: ");
        base = scan.nextDouble();

        System.out.printf("Digite a altura do trangulo: ");
        altura = scan.nextDouble();

        area= (base * altura) / 2;

        System.out.printf("A area do triangulo é: %.2f", area);
        scan.close();
    }
}
