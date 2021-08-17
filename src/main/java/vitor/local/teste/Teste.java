package vitor.local.teste;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class Teste {
    
    @RequestMapping ("/alo")
    public String master(Model modelo){
        modelo.addAttribute("numero1", Math.random()*60);
        modelo.addAttribute("numero2", Math.random()*60);
        modelo.addAttribute("numero3", Math.random()*60);
        modelo.addAttribute("numero4", Math.random()*60);
        modelo.addAttribute("numero5", Math.random()*60);
        modelo.addAttribute("numero6", Math.random()*60);
       
        return "view1";
    }
}
