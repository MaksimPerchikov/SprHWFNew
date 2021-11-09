package ru.ibs.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

@Controller
@RequestMapping("/mvc")
public class MyController {
    private final static String CONST_PETROL = "petrol";
    private final static String CONST_DIESEL = "diesel";
    HashMap<String,Engine> stringEngineHashMap;
    @GetMapping("/fuel")
    @AnnotFuelExceptionHandle
    public String fuel(
            @RequestParam(name="name", required=false, defaultValue="Какой-то") String name,
            Model model,
            Creator creator
    ) {

       model.addAttribute("name",creator.allEngine().get(name).powerUp());

       return "fuel";


        //укороченная версия
        /*String str = null;
        if(CONST_PETROL.equals(name)){
            str = "petrol";
        }else if(CONST_DIESEL.equals(name)){
            str = "diesel";
        }
        String type = beansCla.allEngine().get(str).powerUp();
        model.addAttribute("name",type);
        return "fuel";*/


        //изначальная версия
       /* if(CONST_PETROL.equals(name)) {
            String petrol = beansCla.allEngine().get(name).powerUp();
            model.addAttribute("name", petrol);
        }
        else if(CONST_DIESEL.equals(name)) {
        String diesel = beansCla.allEngine().get(name).powerUp();
        model.addAttribute("name",diesel);
        }
        return "fuel";*/
    }
    /*@GetMapping
    public String main(Map<String, Object> model) {
        model.put("some", "User");
        return "main";
    }
*/
    @GetMapping("/error")
    public String error() {
        return "error";
    }

}