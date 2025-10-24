public class Mensalista extends Colaborador{
    double bancoDeHoras, salarioMensal;

    public Mensalista(int edv, String nome, String cargo, double salarioMensal){
        super(edv, nome, cargo);
        this.salarioMensal =  salarioMensal;

    }

    double receberSalario(){
        return this.salarioMensal;
    }

    @Override
    public String toString() {
        return "Mensalista{" +
                "salarioMensal=" + salarioMensal +
                ", edv=" + edv +
                ", nome='" + nome + '\'' +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}
