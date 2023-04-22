package de.neuhaus.quizbackend.dto;

import de.neuhaus.quizbackend.model.CategoryModel;
import lombok.Data;

@Data
public class GameSessionCreationDTO {
    private String title;
    private CategoryModel mainCategory;
    private CategoryModel[] subCategories;

}
