package de.neuhaus.quizbackend.service;

import de.neuhaus.quizbackend.dto.GameSessionCreationDTO;
import de.neuhaus.quizbackend.model.GameSessionModel;

import java.math.BigInteger;

public interface GameSessionService {
    GameSessionModel save(GameSessionCreationDTO gameSessionCreationDTO);
    GameSessionModel getGameSession(BigInteger gameSessionId);

    boolean deleteGameSession(BigInteger sessionId);

    GameSessionModel editGameSession(BigInteger sessionId, GameSessionCreationDTO gameSessionCreationDTO);
}
