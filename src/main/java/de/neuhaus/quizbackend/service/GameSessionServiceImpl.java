package de.neuhaus.quizbackend.service;

import de.neuhaus.quizbackend.dto.GameSessionCreationDTO;
import de.neuhaus.quizbackend.mapper.GameSessionMapper;
import de.neuhaus.quizbackend.model.GameSessionModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
@RequiredArgsConstructor
public class GameSessionServiceImpl implements GameSessionService {

    private final GameSessionMapper gameSessionMapper;

    @Override
    public GameSessionModel save(GameSessionCreationDTO gameSessionCreationDTO) {
        GameSessionModel gameSessionModel = gameSessionMapper.mapGameSessionCreationToGameSession(gameSessionCreationDTO);
        // TODO: Save GameSessionModel into DB and let the DB generate the ID
        gameSessionModel.setId(createId());
        return gameSessionModel;
    }

    @Override
    public GameSessionModel getGameSession(BigInteger gameSessionId) {
        GameSessionModel gameSessionModel = new GameSessionModel();
        // TODO: Get GameSession from DB with the ID
        gameSessionModel.setId(gameSessionId);
        return gameSessionModel;
    }

    @Override
    public boolean deleteGameSession(BigInteger sessionId) {
        // TODO: Delete GameSessionById
        return false;
    }

    @Override
    public GameSessionModel editGameSession(BigInteger sessionId, GameSessionCreationDTO gameSessionCreationDTO) {
        // TODO: Edit a GameSession in DB
        return null;
    }

    private BigInteger createId() {
        return new BigInteger(String.valueOf(1));
    }
}
