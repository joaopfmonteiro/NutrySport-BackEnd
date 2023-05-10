package com.jmonteiro.nutrySport.business.presistant.sport;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "exercice")
public class ExerciceEntity {
    @Id
    @GeneratedValue
    public Long id;
    @NonNull
    public String name;
    @NonNull
    public String muscularGroup;
    public String equipment;
    @NonNull
    public String discription;
    public String img;
    public Long rm;
}
