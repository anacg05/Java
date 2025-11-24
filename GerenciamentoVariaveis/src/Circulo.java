public class Circulo {

//    Cor e Raio são variaveis dinamicas, ou seja,
//    elas mudam de acordo com o objeto instanciado

    String cor;
    double raio;

//    Pi é uma variavel estática, ela pertence a classe
//    ou seja, a cada vez que uma instancia se referir ao pi,
//    ele sempre usará o mesmo espaço de memória que foi alocado.

    static final double pi = 3.14;

    public Circulo(String cor, double raio){
        this.cor = cor;
        this.raio = raio;
    }

    double calcularArea(){
        return pi*raio*raio;
    }
}
