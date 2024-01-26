package com.example.enseignementback.maquette.controller;

import com.example.enseignementback.maquette.model.Formation;
import com.example.enseignementback.maquette.model.Semestre;
import com.example.enseignementback.maquette.service.SemestreService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/maquette/semestre")
public class SemestreController {
    private SemestreService semestreService;

    @PostMapping
    public void post(@RequestBody Semestre semestre){
        semestreService.post(semestre);
    }

    @GetMapping
    public List<Semestre> get(){
        return semestreService.get();
    }

    @GetMapping("/{id}")
    public Optional<Semestre> getSemestreById(@PathVariable long id){
        return semestreService.getSemestreById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){
        semestreService.delete(id);
    }

    @PutMapping("/{id}")
    public Semestre update(@PathVariable long id, @RequestBody Semestre semestre){
        semestre.setId(id);
        return semestreService.update(semestre);
    }
}
