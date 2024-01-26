package com.example.enseignementback.maquette.controller;

import com.example.enseignementback.maquette.model.Ue;
import com.example.enseignementback.maquette.service.UeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@Controller
@RestController
@RequestMapping("/maquette/ue")
@AllArgsConstructor
public class UeController {
    private UeService ueService;

    @PostMapping
    public void post(@RequestBody Ue ue){
        ueService.post(ue);
    }

    @GetMapping
    public List<Ue> get(){
        return ueService.get();
    }

    @GetMapping("/{id}")
    public Optional<Ue> getUeById(@PathVariable long id){
        return ueService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){
        ueService.delete(id);
    }

    @PutMapping("/{id}")
    public Ue update(@PathVariable long id, @RequestBody Ue ue){
        ue.setId(id);
        return ueService.update(ue);
    }
}
