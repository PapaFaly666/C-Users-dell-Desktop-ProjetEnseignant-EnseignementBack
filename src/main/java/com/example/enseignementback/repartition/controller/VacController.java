package com.example.enseignementback.repartition.controller;

import com.example.enseignementback.repartition.model.Per;
import com.example.enseignementback.repartition.model.Vac;
import com.example.enseignementback.repartition.service.VacService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/repartition/vac")
public class VacController {
    private VacService vacService;

    @PostMapping
    public void post(@RequestBody Vac vac){
        vacService.post(vac);
    }

    @GetMapping
    public List<Vac> get(){
        return vacService.get();
    }

    @GetMapping("/{id}")
    public Optional<Vac> getPerById(@PathVariable long id){
        return vacService.getVacId(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){
        vacService.delete(id);
    }

    @PutMapping("/{id}")
    public Vac update(@PathVariable long id, @RequestBody Vac vac){
        vac.setId(id);
        return vacService.update(vac);
    }
}
