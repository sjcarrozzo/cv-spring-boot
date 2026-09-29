package com.scarrozzo.tu_cv_spring_boot.tuCV.service;

import com.scarrozzo.tu_cv_spring_boot.tuCV.model.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CvInitializationServiceImpl implements CvInitializationService{

    @Override
    public CvData initializeCvData() {
        return new CvData(
                new PersonalDetails("Sebastian","Carrozzo","x@gmail.com","+3444443666","Calle falsa 123","Valencia","Valencia","46015","Programador Backend"),
                List.of(new Education("UNLaM","Ingenieria de Software","2014-2022","Sin descripcion"),new Education("CoderHouse","Desarrollo Web","2022-2024","Sin descripcion")),
                List.of(new Experience("Programador Backend","Telecom","2022-2023","programador backend"),new Experience("Programador Backend Smalltalk","IBM","2020-2022","programador backend")),
                List.of(new Skill("coding","high"),new Skill("English","C1"))
                );
    }
}
