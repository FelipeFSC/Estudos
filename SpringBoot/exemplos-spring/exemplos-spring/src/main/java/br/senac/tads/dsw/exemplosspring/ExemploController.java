package br.senac.tads.dsw.exemplosspring;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
    @GetMapping("/ex2B") // Posso usar o mesmo template para controladores diferentes
    public ModelAndView exemplo2B(){
        ModelAndView mv = new ModelAndView("exemplo2");
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

}
