package com.example.enseignementback.maquette.controller;

import com.example.enseignementback.maquette.model.Filiere;
import com.example.enseignementback.maquette.model.Niveau;
import com.example.enseignementback.maquette.service.NiveauService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/maquette/niveau")
@AllArgsConstructor
public class NiveauController {
    private NiveauService niveauService;

    @PostMapping
    public void post(@RequestBody Niveau niveau){
        niveauService.post(niveau);
    }

    @GetMapping
    public Iterable<Niveau> get(){
        return niveauService.get();
    }

    @GetMapping("/{id}")
    public Optional<Niveau> getNiveauById(@PathVariable long id){
        return niveauService.getNiveauById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){
        niveauService.delete(id);
    }

    @PutMapping("/{id}")
    public Niveau update(@PathVariable long id, @RequestBody Niveau niveau){
        niveau.setId(id);
        return niveauService.update(niveau);
    }
}
