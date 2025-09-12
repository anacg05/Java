import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double valorCompra, valorRepresentante, valorImpostos, valorVenda;

        System.out.print("Informe o valor de compra da mercadoria: ");
        valorCompra = scan.nextDouble();

        valorRepresentante = valorCompra * 0.20;
        valorImpostos = valorCompra * 0.30;
        valorVenda = valorCompra + valorRepresentante + valorImpostos;

        System.out.printf("Valor do representante (20%%): %.2f%n", valorRepresentante);
        System.out.printf("Valor dos impostos (30%%): %.2f%n", valorImpostos);
        System.out.printf("Valor total de venda: %.2f%n", valorVenda);

        scan.close();

    }
}
