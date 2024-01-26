package com.example.enseignementback.maquette.controller;

import com.example.enseignementback.maquette.model.Ec;
import com.example.enseignementback.maquette.model.Filiere;
import com.example.enseignementback.maquette.service.FiliereService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/maquette/filiere")
@AllArgsConstructor

public class FiliereController {
    private FiliereService filiereService;

    @PostMapping
    public void post(@RequestBody Filiere filiere){
        filiereService.post(filiere);
    }

    @GetMapping
    public Iterable<Filiere> get(){
        return filiereService.get();
    }

    @GetMapping("/{id}")
    public Optional<Filiere> getFiliereById(@PathVariable long id){
        return filiereService.getFiliereById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){
        filiereService.delete(id);
    }

    @PutMapping("/{id}")
    public Filiere update(@PathVariable long id, @RequestBody Filiere filiere){
        filiere.setId(id);
        return filiereService.update(filiere);
    }
}
