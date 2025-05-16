import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {

        double valor, quad, cubo;
        Scanner scan = new Scanner(System.in);

        System.out.printf("Digite um valor: ");
        valor = scan.nextDouble();

        quad= Math.pow(valor,2);
        cubo = Math.pow(valor,3);

        System.out.printf("%.2f² é: %.2f \n",valor, quad);
        System.out.printf("%.2f³ é: %.2f", valor, cubo);
        scan.close();
    }
}
