package de.neuhaus.quizbackend.rest.controller;

import de.neuhaus.quizbackend.rest.dto.GameSessionCreationDTO;
import de.neuhaus.quizbackend.rest.model.GameSessionModel;
import de.neuhaus.quizbackend.rest.service.GameSessionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;

@RestController
@RequiredArgsConstructor
public class GameSessionController {

    private final GameSessionService gameSessionService;


    @GetMapping(value = "/session/{sessionId}")
    public ResponseEntity<GameSessionModel> getSession(@PathVariable BigInteger sessionId) {
        GameSessionModel gameSessionModel = gameSessionService.getGameSession(sessionId);
        return ResponseEntity.ok(gameSessionModel);
    }

    @PostMapping(value = "/session/create")
    public GameSessionModel createGameSession(@RequestBody GameSessionCreationDTO gameSessionCreationDTO) {
        return gameSessionService.save(gameSessionCreationDTO);
    }

    @DeleteMapping(value = "/session/delete/{sessionId}")
    public ResponseEntity<?> deleteGameSession(@PathVariable BigInteger sessionId) {
        if (gameSessionService.deleteGameSession(sessionId)) {
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.internalServerError().build();
    }

    @PutMapping(value = "/session/edit/{sessionId}")
    public ResponseEntity<GameSessionModel> editGameSession(@PathVariable BigInteger sessionId, @RequestBody GameSessionCreationDTO gameSessionCreationDTO) {
        GameSessionModel gameSessionModel = gameSessionService.editGameSession(sessionId, gameSessionCreationDTO);
        if (gameSessionModel != null) {
            return ResponseEntity.ok(gameSessionModel);
        }
        return ResponseEntity.internalServerError().build();
    }
}
