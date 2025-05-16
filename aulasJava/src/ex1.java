import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

        int celsius, fahrenheit;
        Scanner scan = new Scanner(System.in);

        System.out.printf("Digite a temperatura em fahrenheit para converter  em celsius: ");
        fahrenheit = scan.nextInt();

        celsius = (fahrenheit - 32) * 5/9;

        System.out.printf("A temperatura é %d°C.", celsius);
        scan.close();
    }
}
