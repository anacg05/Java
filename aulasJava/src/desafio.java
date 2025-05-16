public class desafio {
    public static void main(String[] args) {
        double mult1, mult2, elevado, elevado2, elevado3, elevado4, divisao, result;

        elevado = Math.pow(-3.0/4.0,-2);            //tem que ser .0 porque está declarado como double
        elevado2 = Math.pow(3,-1)/4;
        elevado3 = Math.pow(-3.0/4.0,-1);

        mult1 = 3 * elevado + 6 * elevado2 - 4;
        mult2 = 7 * elevado3 + 2;

        divisao = mult1 / mult2;
        elevado4 = Math.pow(divisao,-1);

        result = elevado4 + 4;

        System.out.println(result);
    }
}
