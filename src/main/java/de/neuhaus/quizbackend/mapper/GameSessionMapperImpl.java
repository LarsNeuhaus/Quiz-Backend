package de.neuhaus.quizbackend.mapper;

import de.neuhaus.quizbackend.dto.GameSessionCreationDTO;
import de.neuhaus.quizbackend.model.GameSessionModel;
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
