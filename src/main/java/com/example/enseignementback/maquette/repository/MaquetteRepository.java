package com.example.enseignementback.maquette.repository;

import com.example.enseignementback.maquette.model.Maquette;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaquetteRepository extends JpaRepository<Maquette, Long> {
}
