package com.example.enseignementback.maquette.service;

import com.example.enseignementback.maquette.model.Cycle;
import com.example.enseignementback.maquette.model.Module;
import com.example.enseignementback.maquette.repository.ModuleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ModuleService {
    private ModuleRepository moduleRepository;

    public void post(Module module){
        moduleRepository.save(module);
    }

    public List<Module> get(){
        return moduleRepository.findAll();
    }

    public Optional<Module> getModuleById(long id){
        return moduleRepository.findById(id);
    }

    public void delete(long id){
        moduleRepository.deleteById(id);
    }

    public Module update(Module module){
        return moduleRepository.save(module);
    }
}
