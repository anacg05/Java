import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {

        double a, b, c, delta, x, x1, x2;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        a = scan.nextDouble();

        System.out.print("Digite o valor de b: ");
        b = scan.nextDouble();

        System.out.print("Digite o valor de c: ");
        c = scan.nextDouble();

        delta = b * b - 4 * a * c;

        System.out.printf("O delta é: %.2f", delta);
        scan.close();

    }
}
