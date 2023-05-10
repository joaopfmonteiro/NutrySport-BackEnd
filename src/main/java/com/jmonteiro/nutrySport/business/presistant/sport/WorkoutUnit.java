package com.jmonteiro.nutrySport.business.presistant.sport;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "workout_unit")
public class WorkoutUnit {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    @JoinColumn(name = "exercice_id", referencedColumnName = "id")
    private ExerciceEntity exerciceId;
    private Long repetitions;
    private Long wheight;
    private Long set;
    private Long rest;

}
