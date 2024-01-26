package com.example.enseignementback.maquette.repository;

import com.example.enseignementback.maquette.model.Module;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModuleRepository extends JpaRepository<Module, Long> {
}
