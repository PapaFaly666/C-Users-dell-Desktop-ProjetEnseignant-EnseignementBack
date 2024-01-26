package com.example.enseignementback.maquette.controller;

import com.example.enseignementback.maquette.model.Classe;
import com.example.enseignementback.maquette.model.Groupe;
import com.example.enseignementback.maquette.service.ClasseService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/maquette/classe")
@AllArgsConstructor
public class ClasseController {
    private ClasseService classeService;

    @PostMapping
    public void post(@RequestBody Classe classe){
        classeService.post(classe);
    }

    @GetMapping
    public List<Classe> get(){
        return classeService.get();
    }

    @GetMapping("/{id}")
    public Optional<Classe> getClasseById(@PathVariable long id){
        return classeService.getClasseById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){
        classeService.delete(id);
    }

    @PutMapping("/{id}")
    public Classe update(@PathVariable long id, @RequestBody Classe classe){
        classe.setId(id);
        return classeService.update(classe);
    }
}
