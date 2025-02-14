package com.middleware.tp1.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor


public class Enseignant {
    @Id @GeneratedValue
    private long idEnseignant;


    @Column(nullable = false)
    private String nom;

    @Enumerated
    private Grade grade;


    @ManyToMany
    @JoinTable(name = "enseigne",joinColumns = @JoinColumn(name = "idEtudiant"), inverseJoinColumns = @JoinColumn(name = "idEnseignant"))
    private List<Etudiant> listEtudiants;


}
