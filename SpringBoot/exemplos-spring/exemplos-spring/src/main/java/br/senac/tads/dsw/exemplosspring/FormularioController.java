package br.senac.tads.dsw.exemplosspring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
// Uma forma de configurar um prefixo de URL que vai ser usado por todos os metodos dentro dele
/*
    ex:

    se tiver um metodo com o Mapping "/salvar"
    para chamar ele na nossa URL temos que colocar

    /formulario/salvar
*/
@RequestMapping("/formulario")
public class FormularioController{

    @GetMapping
    public ModelAndView mostrarForm(){
        ModelAndView mv = new ModelAndView("formulario");
        return mv;
    }

    /*
        A diferença entre enviar usando GET e o POST

        GET 
            ele envia os dados por meio da URL

        POST
            o navegador pega a mensagem, ele envelopa a mensagem
            e manda dentro do corpo da mensagem


        Usando um exemplo de carta de correio

        GET
            Você escreve do lado de fora da carta.

        POST
            Você escreve dentro da carta, como deve ser no caso.
    */
    @PostMapping("/salvar")
    public ModelAndView receberDados(@ModelAttribute Dados dados){
        ModelAndView mv = new ModelAndView("resultado");
        mv.addObject("dados", dados);
        return mv;
    }
}