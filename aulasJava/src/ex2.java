import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        int celsius, fahrenheit;
        Scanner scan = new Scanner(System.in);

        System.out.printf("Digite a temperatura em celsius para converter em fahrenheit: ");
        celsius = scan.nextInt();

        fahrenheit = (celsius * 9/5) + 32;

        System.out.printf("A temperatura é %d°F.", fahrenheit);
        scan.close();
    }
}
