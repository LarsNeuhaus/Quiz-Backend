package de.neuhaus.quizbackend.rest.dto;

import lombok.Data;

@Data
public class QuestionCreationDTO {
    private String question;
    private String answer;
    private String mainCategory;
    private String[] subCategories;
}
