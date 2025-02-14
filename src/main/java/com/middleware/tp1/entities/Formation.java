package com.middleware.tp1.entities;
import java.util.List;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Formation {

        @Id
        @GeneratedValue(strategy =GenerationType.IDENTITY)
        private Long idFormation;

        @Column(nullable = false)
        private String nom;


    @ToString.Exclude
    @OneToMany(mappedBy = "formation")
    private List<Etudiant> etudiantList;
}
