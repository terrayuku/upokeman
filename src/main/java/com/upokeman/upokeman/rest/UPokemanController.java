package com.upokeman.upokeman.rest;

import com.upokeman.upokeman.models.Pokeman;
import com.upokeman.upokeman.models.PokemanResponse;
import com.upokeman.upokeman.service.UPokemanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/all")
public class UPokemanController {

    @Autowired
    UPokemanService service;

    @GetMapping
    public PokemanResponse getAllPokeman() {
        return service.getAllPokemans();
    }
}
