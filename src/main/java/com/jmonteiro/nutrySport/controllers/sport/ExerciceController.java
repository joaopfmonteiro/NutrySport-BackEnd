package com.jmonteiro.nutrySport.controllers.sport;

import com.jmonteiro.nutrySport.business.presistant.sport.ExerciceEntity;
import com.jmonteiro.nutrySport.business.presistant.sport.services.ExerciceServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exercice")
public class ExerciceController {
    @Autowired
    private ExerciceServices exerciceServices;
    @GetMapping
    public List<ExerciceEntity> getAll(){
        return exerciceServices.getAll();
    }
    @GetMapping("/id")
    public ExerciceEntity findById(@PathVariable Long id){
        return exerciceServices.getById(id);
    }
    @PostMapping()
    public ExerciceEntity save(@RequestBody ExerciceEntity exercice){
        return exerciceServices.save(exercice);
    }
}
