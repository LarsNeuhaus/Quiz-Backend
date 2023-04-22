package de.neuhaus.quizbackend.rest.mapper;

import de.neuhaus.quizbackend.rest.dto.GameSessionCreationDTO;
import de.neuhaus.quizbackend.rest.model.GameSessionModel;

public interface GameSessionMapper {
    GameSessionModel mapGameSessionCreationToGameSession(GameSessionCreationDTO gameSessionCreationDTO);
}
