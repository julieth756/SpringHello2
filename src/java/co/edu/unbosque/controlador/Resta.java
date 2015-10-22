/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unbosque.controlador;

import co.edu.unbsoque.modelo.Operacion;
import java.util.Locale;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

/**
 *
 * @author Julieth
 */
@Controller
public class Resta {
     @RequestMapping("/irRestar")
   public ModelAndView redireccion(){
        return new ModelAndView("Resta", "command",new Operacion());
    }

   @RequestMapping(value = "/resta", method = RequestMethod.GET)
   public String index(Operacion oper, ModelMap model) {
       model.addAttribute("numero1", oper.getNum1());
       model.addAttribute("numero2", oper.getNum2());
       return "index";
   }
   
   @RequestMapping(value = "/irRespuesta", method = RequestMethod.GET)
   public ModelAndView irRespuesta(){
       return new ModelAndView("respuesta","command", new Operacion());
   }
}