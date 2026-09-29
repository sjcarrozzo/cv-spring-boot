package com.scarrozzo.tu_cv_spring_boot.tuCV.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Education {
    private String institution;
    private String degree;
    private String period;
    private String description;
}
