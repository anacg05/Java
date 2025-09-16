import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double valorUnitario = 0, valorTotal;
        int quantidade=0;

         while (valorUnitario <= 0) {
            System.out.print("Digite o valor unitário do produto (maior que 0): ");
            valorUnitario = scanner.nextDouble();

            if (valorUnitario <= 0) {
                System.out.println("Valor inválido! Tente novamente.");
            }
        }

         while (quantidade <= 0) {
            System.out.print("Digite a quantidade desejada (maior que 0): ");
            quantidade = scanner.nextInt();

            if (quantidade <= 0) {
                System.out.println("Quantidade inválida! Tente novamente.");
            }
        }

        if (quantidade <= 12) {
            valorTotal = valorUnitario * quantidade;

        } else {
            valorTotal = (valorUnitario * quantidade) * 0.9; // 10% de desconto
        }

        System.out.printf("Valor total da compra: R$ %.2f%n", valorTotal);

        scanner.close();
    }
    
}
