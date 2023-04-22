package de.neuhaus.quizbackend.rest.mapper.impl;

import de.neuhaus.quizbackend.rest.dto.GameSessionCreationDTO;
import de.neuhaus.quizbackend.rest.mapper.GameSessionMapper;
import de.neuhaus.quizbackend.rest.model.GameSessionModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GameSessionMapperImpl implements GameSessionMapper {

    @Override
    public GameSessionModel mapGameSessionCreationToGameSession(GameSessionCreationDTO gameSessionCreationDTO) {
        GameSessionModel gameSessionModel = new GameSessionModel();
        gameSessionModel.setTitle(gameSessionCreationDTO.getTitle());
        gameSessionModel.setMainCategoryModel(gameSessionCreationDTO.getMainCategory());
        gameSessionModel.setSubCategories(gameSessionCreationDTO.getSubCategories());
        return gameSessionModel;
    }
}
