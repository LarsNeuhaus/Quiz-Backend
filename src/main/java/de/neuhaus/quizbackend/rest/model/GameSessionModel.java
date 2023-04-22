package de.neuhaus.quizbackend.rest.model;

import lombok.Data;

import java.math.BigInteger;

@Data
public class GameSessionModel {
    private BigInteger id;
    private String title;
    private CategoryModel mainCategoryModel;
    private CategoryModel[] subCategories;
    private QuestionModel[] questions;
    private UserModel[] users;
}
