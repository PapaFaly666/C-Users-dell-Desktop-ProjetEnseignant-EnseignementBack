package com.example.enseignementback.repartition.controller;

import com.example.enseignementback.maquette.model.Classe;
import com.example.enseignementback.repartition.model.Per;
import com.example.enseignementback.repartition.service.PerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/repartition/per")
@AllArgsConstructor
public class PerController {
    private PerService perService;

    @PostMapping
    public void post(@RequestBody Per per){
        perService.post(per);
    }

    @GetMapping
    public List<Per> get(){
        return perService.get();
    }

    @GetMapping("/{id}")
    public Optional<Per> getPerById(@PathVariable long id){
        return perService.getPerId(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){
        perService.delete(id);
    }

    @PutMapping("/{id}")
    public Per update(@PathVariable long id, @RequestBody Per per){
        per.setId(id);
        return perService.update(per);
    }
}
