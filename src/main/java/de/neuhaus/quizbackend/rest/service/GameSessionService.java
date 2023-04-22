package de.neuhaus.quizbackend.rest.service;

import de.neuhaus.quizbackend.rest.dto.GameSessionCreationDTO;
import de.neuhaus.quizbackend.rest.model.GameSessionModel;

import java.math.BigInteger;

public interface GameSessionService {
    GameSessionModel save(GameSessionCreationDTO gameSessionCreationDTO);
    GameSessionModel getGameSession(BigInteger gameSessionId);

    boolean deleteGameSession(BigInteger sessionId);

    GameSessionModel editGameSession(BigInteger sessionId, GameSessionCreationDTO gameSessionCreationDTO);
}
