public class Treinamento {
    String nome;
    double preco;
    boolean exclusivoGestores;

    Instrutor instrutor;

    public Treinamento(String nome, double preco, boolean exclusivoGestores, Instrutor instrutor) {
        this.nome = nome;
        this.preco = preco;
        this.exclusivoGestores = exclusivoGestores;
        this.instrutor = instrutor;
    }

//    @Override
//    public String toString() {
//        return String.format("O treinamento de %s está " +
//                "com o preço de R$ %.2f e " +
//                "ele %s exclusivo para gestores e ministrado pelo treinador %s.",
//                this.nome, this.preco, this.exclusivoGestores ? "é" : "não é", this.instrutor );
//    }

    public Treinamento(){

    }
}
