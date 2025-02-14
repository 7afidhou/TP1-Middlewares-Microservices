package com.middleware.tp1.repositories;

import com.middleware.tp1.entities.Enseignant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface EnseignantRep extends JpaRepository<Enseignant, Long> {

}
