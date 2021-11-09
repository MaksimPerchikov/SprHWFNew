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
        model.addAttribute("name", creator.allEngine().get(name).powerUp());
        return "fuel";

    }
    @GetMapping("/error")
    public String error() {
        return "error";
    }

}