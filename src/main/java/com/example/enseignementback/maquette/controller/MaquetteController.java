package com.example.enseignementback.maquette.controller;

import com.example.enseignementback.maquette.model.Maquette;
import com.example.enseignementback.maquette.model.Ue;
import com.example.enseignementback.maquette.service.MaquetteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/maquette/maquette")
public class MaquetteController {
    private MaquetteService maquetteService;

    @PostMapping
    public void post(@RequestBody Maquette maquette){
        maquetteService.post(maquette);
    }

    @GetMapping
    public List<Maquette> get(){
        return maquetteService.get();
    }

    @GetMapping("/{id}")
    public Optional<Maquette> getUeById(@PathVariable long id){
        return maquetteService.getMaquetteById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){
        maquetteService.delete(id);
    }

    @PutMapping("/{id}")
    public Maquette update(@PathVariable long id, @RequestBody Maquette maquette){
        maquette.setId(id);
        return maquetteService.update(maquette);
    }

}
