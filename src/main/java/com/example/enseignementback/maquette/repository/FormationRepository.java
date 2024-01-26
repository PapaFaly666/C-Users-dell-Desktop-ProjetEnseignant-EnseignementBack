package com.example.enseignementback.maquette.repository;

import com.example.enseignementback.maquette.model.Formation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormationRepository extends JpaRepository<Formation, Long> {
}
