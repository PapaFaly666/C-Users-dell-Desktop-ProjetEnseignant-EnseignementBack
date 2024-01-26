package com.example.enseignementback.maquette.controller;

import com.example.enseignementback.maquette.model.Module;
import com.example.enseignementback.maquette.model.Semestre;
import com.example.enseignementback.maquette.service.ModuleService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/maquette/module")
public class ModuleController {
    private ModuleService moduleService;

    @PostMapping
    public void post(@RequestBody Module module){
        moduleService.post(module);
    }

    @GetMapping
    public List<Module> get(){
        return moduleService.get();
    }

    @GetMapping("/{id}")
    public Optional<Module> getModuleById(@PathVariable long id){
        return moduleService.getModuleById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){
        moduleService.delete(id);
    }

    @PutMapping("/{id}")
    public Module update(@PathVariable long id, @RequestBody Module module){
        module.setId(id);
        return moduleService.update(module);
    }
}
