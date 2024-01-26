package com.example.enseignementback.maquette.controller;

import com.example.enseignementback.maquette.model.Ec;
import com.example.enseignementback.maquette.service.EcService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/maquette/ec")
public class EcController {
    private EcService ecService;

    @PostMapping
    public void post(@RequestBody Ec ec){
        ecService.post(ec);
    }

    @GetMapping
    public Iterable<Ec> get(){
        return ecService.get();
    }

    @GetMapping("/{id}")
    public Optional<Ec> getEcById(@PathVariable long id){
        return ecService.getEcById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){
        ecService.delete(id);
    }

    @PutMapping("/{id}")
    public Ec update(@PathVariable long id, @RequestBody Ec ec){
        ec.setId(id);
        return ecService.update(ec);
    }
}
