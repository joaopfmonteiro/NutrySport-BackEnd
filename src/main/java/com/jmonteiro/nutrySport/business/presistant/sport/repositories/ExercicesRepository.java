package com.jmonteiro.nutrySport.business.presistant.sport.repositories;

import com.jmonteiro.nutrySport.business.presistant.sport.ExerciceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExercicesRepository extends JpaRepository<ExerciceEntity, Long> {
}
