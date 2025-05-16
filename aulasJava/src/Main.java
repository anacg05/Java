public class Main {
    public static void main(String[] args) {     //atalho psvm
        /*
        System.out.println("Hello world!"); // atalho sout
        System.out.println("""
                Hello
                World!
                """);

        println quebra linha automatico
        print não quebra linha automatico
        atalho comentario ctrl /



        * Tipos de mascaras

        * %d - inteiros > byte, short, int, long
        * %f - reais > float, double
        * %c - caractere > char
        * %b - lógico > boolean
        * %s - string

        */

        //Variaveis inteiras
        byte variavelByte = 127;          // Padrão Camel Case
        System.out.printf("Tamanho do byte: %d\n", variavelByte);

        short variavelShort = 32767;
        System.out.printf("Tamanho do Short: %d\n", variavelShort);

        int variavelInt = 2_147_483_647;
        System.out.printf("Tamanho do Int: %d\n", variavelInt);

        long variavelLong = 9_223_372_036_854_775_807L; // variaveis long tem que colocar o L no final
        System.out.printf("Tamanho do Long: %d\n", variavelLong);

        //Variaveis reais
        float variavelFloat = 3.14F;
        System.out.printf("Valor de Float: %.2f\n", variavelFloat);

        double variavelDouble = 1.7e+308;
        System.out.printf("Valor do Double: %f\n", variavelDouble);

        //Variaveis caractere
        char variavelCaractere = 'A';
        System.out.printf("O caracter é: %c\n", variavelCaractere);

        boolean variavelBoolean = true;
        System.out.printf("O booleano é: %b\n", variavelBoolean);

        // String
        String variavelString = "Bem vindo a Bosch!";
        System.out.println(variavelString.length()); // length() mostra quantidade de carcteres de uma string
        System.out.println(variavelString.toUpperCase()); // deixa todos caracteres em maiusculo
        System.out.println(variavelString.toLowerCase()); // deixa todos caracteres em minusculo
        System.out.println(variavelString.charAt(5)); // mostra o caractere na posição 5
        System.out.println(variavelString+ "!!!"); // concatenação

        //operaões
        int num1 = 9;
        int num2 = 2;

        System.out.println(num1+num2); // adição
        System.out.println(num1-num2); // subtração
        System.out.println(num1*num2); // multiplicação
        System.out.println(num1/num2); // divisão
        System.out.println(num1%num2); // resto da divisão
    }
}