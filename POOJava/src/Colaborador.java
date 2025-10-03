public class Colaborador {
        int edv;
        String nome;
        String cargo;

//        Colaborador(){
//            System.out.println("O construtor sem parametros foi executado");
//        }

        Colaborador(String nome){
            this.nome = nome;
            System.out.println("Construtor com parametro foi chamado");

        }

        Colaborador(String nome, int edv){
            this.nome = nome;
            this.edv = edv;
            System.out.println("Construtor com 2 parametros foi chamado");

        }

        Colaborador(String nome, int edv, String cargo){
            this.nome = nome;
            this.edv = edv;
            this.cargo = cargo;
            System.out.println("Construtor com 3 parametros foi chamado");

        }
    }
