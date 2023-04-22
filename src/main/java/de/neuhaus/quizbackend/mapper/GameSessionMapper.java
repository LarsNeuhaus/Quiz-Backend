package de.neuhaus.quizbackend.mapper;

import de.neuhaus.quizbackend.dto.GameSessionCreationDTO;
import de.neuhaus.quizbackend.model.GameSessionModel;

public interface GameSessionMapper {
    GameSessionModel mapGameSessionCreationToGameSession(GameSessionCreationDTO gameSessionCreationDTO);
}
