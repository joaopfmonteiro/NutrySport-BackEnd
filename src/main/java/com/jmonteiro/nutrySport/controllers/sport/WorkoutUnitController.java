package com.jmonteiro.nutrySport.controllers.sport;

import com.jmonteiro.nutrySport.business.presistant.sport.WorkoutUnit;
import com.jmonteiro.nutrySport.business.presistant.sport.services.WorkoutUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workout_unit")
public class WorkoutUnitController {
    @Autowired
    private WorkoutUnitService workoutUnitService;
    @GetMapping()
    private List<WorkoutUnit> findAll(){
        return workoutUnitService.findAllWorkout();
    }
    @GetMapping("/{id}")
    private WorkoutUnit finAllById(@PathVariable Long id){
        return workoutUnitService.findById(id);
    }
    @PostMapping()
    private WorkoutUnit save(@RequestBody WorkoutUnit workout){
        return workoutUnitService.save(workout);
    }
}
