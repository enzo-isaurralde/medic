package com.alura.Medic.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerMedic {

    @GetMapping ("/saludo")
    public String saludo(){
        return "Hola Mundo";
    }
}
