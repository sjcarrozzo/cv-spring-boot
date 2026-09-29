package com.scarrozzo.tu_cv_spring_boot.tuCV.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Experience {
    private String jobTitle;
    private String company;
    private String period;
    private String description;
}
