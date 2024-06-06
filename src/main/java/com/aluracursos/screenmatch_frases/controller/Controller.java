package com.aluracursos.screenmatch_frases.controller;


import com.aluracursos.screenmatch_frases.dto.FrasesDTO;
import com.aluracursos.screenmatch_frases.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
   private FraseService service;
    @GetMapping("/series/frases")
    public FrasesDTO obtenerFrase() {
        return service.obtenerFraseAleatoria();

    }
}