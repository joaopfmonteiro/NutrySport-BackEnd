package com.jmonteiro.nutrySport.business.presistant.sport.services;

import com.jmonteiro.nutrySport.business.presistant.sport.ExerciceEntity;
import com.jmonteiro.nutrySport.business.presistant.sport.repositories.ExercicesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExerciceServices {
    @Autowired
    private ExercicesRepository exercicesRepository;
    public List<ExerciceEntity> getAll(){
        return exercicesRepository.findAll();
    }
    public ExerciceEntity getById(Long id){
        return exercicesRepository.getById(id);
    }
    public ExerciceEntity save(ExerciceEntity exercice){
        return exercicesRepository.save(exercice);
    }
}
