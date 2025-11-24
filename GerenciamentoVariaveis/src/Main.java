public class Main {
    public static void main(String[] args) {

//        CIRCULO
//        Circulo circuloVermelho = new Circulo("Vermelho", 2);
//        System.out.printf("A área do circulo %s é de %.2f\n", circuloVermelho.cor, circuloVermelho.calcularArea());
//
//        Circulo circuloAzul = new Circulo("Azul", 3);
//        System.out.printf("A área do circulo %s é de %.2f\n", circuloAzul.cor, circuloAzul.calcularArea());


//        INVESTIMENTO
//        Investimento investimentoMarcelo = new Investimento("Marcelo", 1000);
//        System.out.printf("O investimento de %s está com o saldo de R$ %.2f\n", investimentoMarcelo.nomeInvestidor, investimentoMarcelo.saldoAtual);
//
//        Investimento investimentoNick = new Investimento("Nick", 1000);
//        System.out.printf("O investimento de %s está com o saldo de R$ %.2f\n\n", investimentoNick.nomeInvestidor, investimentoNick.saldoAtual);
//
//        Investimento.taxaRentabilidade = 0.03;
//
//        investimentoMarcelo.rentabilizar();
//        System.out.printf("O investimento de %s está com o saldo de R$ %.2f\n", investimentoMarcelo.nomeInvestidor, investimentoMarcelo.saldoAtual);
//
//        investimentoNick.rentabilizar();
//        System.out.printf("O investimento de %s está com o saldo de R$ %.2f\n", investimentoNick.nomeInvestidor, investimentoNick.saldoAtual);



//        LICENCA
//        Licenca windows = new Licenca("Windows", "Cap/ETS");
//        System.out.println(windows.software);

//        System.out.println("Contagem de licenças atuais: " + Licenca.retornaLicencasAtribuidas());
//        Licenca windows = new Licenca("Windows", "Cap/ETS");
//        System.out.println("Contagem de licenças após compra do Windows: " + Licenca.retornaLicencasAtribuidas());
//
//        Licenca docker = new Licenca("Docker", "BD/XD");
//        System.out.println("Contagem de licenças após compra do Docker: " + Licenca.retornaLicencasAtribuidas());


//        INSTRUTOR
        Instrutor instrutor = new Instrutor("Francis");
        Treinamento treinamento = new Treinamento("Power BI", 4000, true, instrutor);
//        System.out.println(treinamento);

//        Treinamento treinamento1 = new Treinamento();
//        System.out.println(treinamento1);

    }
}