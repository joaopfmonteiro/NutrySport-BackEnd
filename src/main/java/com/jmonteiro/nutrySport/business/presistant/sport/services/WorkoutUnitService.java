package com.jmonteiro.nutrySport.business.presistant.sport.services;

import com.jmonteiro.nutrySport.business.presistant.sport.WorkoutUnit;
import com.jmonteiro.nutrySport.business.presistant.sport.repositories.WorkoutUnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkoutUnitService {
    @Autowired
    private WorkoutUnitRepository workoutUnitRepository;
    public List<WorkoutUnit> findAllWorkout(){
        return workoutUnitRepository.findAll();
    }
    public WorkoutUnit findById(Long id){
        return workoutUnitRepository.getById(id);
    }
    public WorkoutUnit save(WorkoutUnit workout){
        return workoutUnitRepository.save(workout);
    }
    public void deleteById(Long id){
        workoutUnitRepository.deleteById(id);
    }
    public void  update(WorkoutUnit workout){
        workoutUnitRepository.save(workout);
    }

}
