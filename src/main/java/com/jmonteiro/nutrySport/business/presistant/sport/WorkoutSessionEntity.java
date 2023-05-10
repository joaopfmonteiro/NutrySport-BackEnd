package com.jmonteiro.nutrySport.business.presistant.sport;

import com.jmonteiro.nutrySport.business.presistant.user.UserEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "workout_session")
public class WorkoutSessionEntity {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    @JoinColumn(name = "workout_id", referencedColumnName = "id")
    private WorkoutUnit workoutId;
    @ManyToOne()
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private UserEntity userId;
}
