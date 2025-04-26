package com.banho.banhocronometro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/banho")
public class BanhoController {

    @GetMapping("/status")
    public String status() {
        return "Aplicação Rodando";
    }

    @GetMapping("/calcular")
    public String calcularConsumo(@RequestParam int minutos) {
        double litrosPorMinuto = 15;
        double consumo = minutos * litrosPorMinuto;
        return "Seu banho de " + minutos + " minutos gastou aproximadamente " + consumo + " litros de água.";
    }
}
