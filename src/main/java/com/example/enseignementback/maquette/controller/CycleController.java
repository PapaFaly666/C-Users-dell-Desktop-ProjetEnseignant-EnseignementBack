package com.example.enseignementback.maquette.controller;

import com.example.enseignementback.maquette.model.Cycle;
import com.example.enseignementback.maquette.model.Formation;
import com.example.enseignementback.maquette.service.CycleService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/maquette/cycle")
public class CycleController {
    private CycleService cycleService;

    @PostMapping
    public void post(@RequestBody Cycle cycle){
        cycleService.post(cycle);
    }

    @GetMapping
    public List<Cycle> get(){
        return cycleService.get();
    }

    @GetMapping("/{id}")
    public Optional<Cycle> getCycleById(@PathVariable long id){
        return cycleService.getCycleById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){
        cycleService.delete(id);
    }

    @PutMapping("/{id}")
    public Cycle update(@PathVariable long id, @RequestBody Cycle cycle){
        cycle.setId(id);
        return cycleService.update(cycle);
    }


}
