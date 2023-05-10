package com.jmonteiro.nutrySport.business.presistant.sport.repositories;

import com.jmonteiro.nutrySport.business.presistant.sport.WorkoutUnit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface WorkoutUnitRepository extends JpaRepository<WorkoutUnit, Long> {
}
