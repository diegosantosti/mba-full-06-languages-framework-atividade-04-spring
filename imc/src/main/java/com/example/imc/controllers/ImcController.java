package com.example.imc.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.imc.models.Pessoa;

@RestController
@RequestMapping("/imc")
public class ImcController {
    
    @GetMapping("/calcular")
    public Pessoa calculaImc(@RequestParam double altura , @RequestParam double peso ){
        var p = new Pessoa(altura, peso);
        p.calcularImc();
        return p;
    }
}
