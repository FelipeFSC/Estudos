package br.senac.tads.dsw.exemplosspring;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

// Para que o Spring veja essa classe como controller
@Controller
public class ExemploController {
    
    // Serve para indicar a URL que iremos chamar
    @GetMapping("/ex1")
    public String exemplo1(){
        return "exemplo1";
    }

    // Exemplo breve de como adicionar atributos no HTML
    @GetMapping("/ex2")
    public String exemplo2( Model model ){
        model.addAttribute("nome", "Felipe");
        model.addAttribute("dataNascimento", LocalDate.parse("2000-12-05"));
        model.addAttribute("numero", 25);
        model.addAttribute("dataHoraAtual", LocalDateTime.now());
        return "exemplo2";
    }

    // Uma forma diferente de passar os valores
    @GetMapping("/ex2b") // Posso usar o mesmo template para controladores diferentes
    public ModelAndView exemplo2b(){
        ModelAndView mv = new ModelAndView("exemplo2"); // Setando a pagina que ele irá chamar
        mv.addObject("nome", "Mais um nome");
        mv.addObject("dataNascimento", LocalDate.parse("2020-12-25"));
        mv.addObject("numero", 50);
        mv.addObject("dataHoraAtual", LocalDateTime.now());
        return mv;
    }




    // Passando um objeto como Atributo
    @GetMapping("/ex3")
    public String exemplo3( Model model ){
        Exemplo dado = new Exemplo();
        dado.setNome("Oloko");
        dado.setDataNascimento(LocalDate.parse("2000-02-04"));
        dado.setNumero(55);
        // Adicionando um Objeto como atributo
        model.addAttribute("dados", dado);
        model.addAttribute("dataHoraAtual", LocalDateTime.now());
        return "exemplo3";
    }

    @GetMapping("/ex3b")
    public ModelAndView exemplo3b(){
        Exemplo dado = new Exemplo();
        dado.setNome("Exemplo3");
        dado.setDataNascimento(LocalDate.parse("2000-08-24"));
        dado.setNumero(22);

        ModelAndView mv = new ModelAndView("exemplo3"); // Setando a pagina que ele irá chamar
        mv.addObject("dados", dado);
        mv.addObject("dataHoraAtual", LocalDateTime.now());

        return mv;
    }

    @GetMapping("/ex4")
    public ModelAndView exemplo4(){
        List<Exemplo> lista = new ArrayList<>();
        lista.add( new Exemplo( "Fulado", LocalDate.parse("2000-12-04"), 15 ) );
        lista.add( new Exemplo( "Ciclano", LocalDate.parse("1995-01-15"), 30 ) );
        
        // Exemplo de 1 para Muitos
        // Enviar 2 listas por exemplo
        Exemplo p3 = new Exemplo("baiano", LocalDate.parse("2004-01-15"), 60);
        List<String> telefones = Arrays.asList("(11)555", "(11)666", "(11)777", "(11)888");
        p3.setTelefone(telefones);
        lista.add( p3 );

        ModelAndView mv = new ModelAndView("exemplo4");
        mv.addObject("lista", lista);
        return mv;
    }


    @GetMapping("/ex5")
    public ModelAndView exemplo5(
        /*
            required = false   --> significa que esse valor não obrigatorio
            defaultValue = "valor" --> Caso venha vazio ele sera preenchido com o valor que foi digitado
        */
        @RequestParam(value = "nome")                       String nome, 
        @RequestParam(value = "dtnasc", required=false)     String dataNascStr, 
        @RequestParam(value = "numero", defaultValue = "0") int numero){
        
        Exemplo dadosInformados = new Exemplo();
        dadosInformados.setNome(nome);
        if(dataNascStr != null){
            dadosInformados.setDataNascimento(LocalDate.parse(dataNascStr));
        }
        dadosInformados.setNumero(numero);

        ModelAndView mv = new ModelAndView("exemplo5");
        mv.addObject("dados",dadosInformados);

        return mv;
    }

                      //variavel do CAMINHO
    @GetMapping("/ex6/{apelido}")
    public ModelAndView exemplo6(
            // aqui descrevemos o nome da variavel que iremos mudar o CAMINHO
            @PathVariable("apelido") String apelido){// aqui a variável de entrada
        
        ModelAndView mv = new ModelAndView("exemplo6");
        if("fulano".equals(apelido)){
            mv.addObject("dados", new Exemplo("Fulado", LocalDate.parse("2000-12-04"), 15));
        
        } else if("ciclano".equals(apelido)){
            mv.addObject("dados", new Exemplo("Ciclano", LocalDate.parse("1995-01-15"), 30 ));
        }

        return mv;
    }

    @GetMapping("/ex7")
    public ModelAndView exemplo7(
        @RequestHeader("user-agent") String userAgent){

        ModelAndView mv = new ModelAndView("exemplo7");
        mv.addObject("ua", userAgent);
        return mv;
    }

    @GetMapping("/ex8")
    public ModelAndView exemplo8(
        @RequestHeader Map<String, String> headerHttp){

        ModelAndView mv = new ModelAndView("exemplo8");
        mv.addObject("headers", headerHttp);
        return mv;
    }
}
