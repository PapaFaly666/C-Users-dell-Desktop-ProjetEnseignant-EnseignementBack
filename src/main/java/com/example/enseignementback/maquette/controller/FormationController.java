package com.example.enseignementback.maquette.controller;

import com.example.enseignementback.maquette.model.Formation;
import com.example.enseignementback.maquette.model.Ue;
import com.example.enseignementback.maquette.service.FormationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/maquette/formation")
@AllArgsConstructor
public class FormationController {
    private FormationService formationService;

    @PostMapping
    public void post(@RequestBody Formation formation){
        formationService.post(formation);
    }

    @GetMapping
    public List<Formation> get(){
        return formationService.get();
    }

    @GetMapping("/{id}")
    public Optional<Formation> getFormationById(@PathVariable long id){
        return formationService.getFormationById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){
        formationService.delete(id);
    }

    @PutMapping("/{id}")
    public Formation update(@PathVariable long id, @RequestBody Formation formation){
        formation.setId(id);
        return formationService.update(formation);
    }
}
