package br.ETS.feedback.controller;

import br.ETS.feedback.DadosCadastroInstrutor;
import br.ETS.feedback.DadosInformacoes;
import br.ETS.feedback.Instrutor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/instrutor")
public class InstrutorController {

    @PostMapping // define que esse metodo é do tipo POST
    public void cadastrar(@RequestBody DadosCadastroInstrutor dadosCadastroInstrutor){ //Essa anotation serve para mostrar que o metodo tem corpo na requisição
        Instrutor instrutor = new Instrutor(dadosCadastroInstrutor);
        System.out.println(instrutor.getNome());

    }
}
