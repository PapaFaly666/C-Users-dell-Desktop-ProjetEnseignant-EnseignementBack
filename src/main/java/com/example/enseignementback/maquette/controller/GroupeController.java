package com.example.enseignementback.maquette.controller;

import com.example.enseignementback.maquette.model.Groupe;
import com.example.enseignementback.maquette.model.Module;
import com.example.enseignementback.maquette.service.GroupeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/maquette/groupe")
public class GroupeController {
    private GroupeService groupeService;

    @PostMapping
    public void post(@RequestBody Groupe groupe){
        groupeService.post(groupe);
    }

    @GetMapping
    public List<Groupe> get(){
        return groupeService.get();
    }

    @GetMapping("/{id}")
    public Optional<Groupe> getGroupeById(@PathVariable long id){
        return groupeService.getGroupeById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){
        groupeService.delete(id);
    }

    @PutMapping("/{id}")
    public Groupe update(@PathVariable long id, @RequestBody Groupe groupe){
        groupe.setId(id);
        return groupeService.update(groupe);
    }
}
