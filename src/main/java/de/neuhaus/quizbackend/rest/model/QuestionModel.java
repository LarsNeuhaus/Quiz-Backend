package de.neuhaus.quizbackend.rest.model;

import lombok.Data;

import java.math.BigInteger;

@Data
public class QuestionModel {
    private BigInteger id;
    private String question;
    private String answer;
    private CategoryModel mainCategoryModel;
    private CategoryModel[] subCategories;
}
