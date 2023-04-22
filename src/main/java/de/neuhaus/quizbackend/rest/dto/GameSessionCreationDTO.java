package de.neuhaus.quizbackend.rest.dto;

import de.neuhaus.quizbackend.rest.model.CategoryModel;
import lombok.Data;

@Data
public class GameSessionCreationDTO {
    private String title;
    private CategoryModel mainCategory;
    private CategoryModel[] subCategories;

}
