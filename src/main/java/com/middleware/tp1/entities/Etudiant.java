package com.middleware.tp1.entities;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Etudiant {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant;

    @Column(nullable = false)
    private String nom;

    @Temporal(TemporalType.DATE)
    private Date dataNaissance;

    @Transient
    private int age;

   @ManyToOne
   @JoinColumn(name = "idFormation")
   @JsonIgnore
   private Formation formation;


   @ManyToMany(mappedBy = "listEtudiants")
   private List<Enseignant> lesEnseigants;



}
