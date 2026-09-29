package com.scarrozzo.tu_cv_spring_boot.tuCV.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
@Data
@AllArgsConstructor
public class CvData {
    private PersonalDetails personalDetails;
    private List<Education> educations;
    private List<Experience> experiences;
    private List<Skill> skills;
}
