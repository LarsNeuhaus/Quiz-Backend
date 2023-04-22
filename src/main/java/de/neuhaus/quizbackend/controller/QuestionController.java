package de.neuhaus.quizbackend.controller;

import de.neuhaus.quizbackend.dto.QuestionCreationDTO;
import de.neuhaus.quizbackend.model.QuestionModel;
import de.neuhaus.quizbackend.model.UserModel;
import de.neuhaus.quizbackend.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;

@RestController
@RequiredArgsConstructor
public class QuestionController {

    private final QuestionService questionService;

    @GetMapping(value = "/question/{questionId}")
    public ResponseEntity<QuestionModel> getQuestion(@PathVariable BigInteger questionId) {
        QuestionModel questionModel = questionService.getQuestion(questionId);
        if (questionModel != null) {
            return ResponseEntity.ok(questionModel);
        }
        return ResponseEntity.internalServerError().build();
    }

    @PostMapping(value = "/question/create")
    public ResponseEntity<QuestionModel> createQuestion(@RequestBody QuestionCreationDTO questionCreationDTO) {
        QuestionModel questionModel = questionService.createQuestion(questionCreationDTO);
        if (questionModel != null) {
            return ResponseEntity.ok(questionModel);
        }
        return ResponseEntity.internalServerError().build();
    }

    @DeleteMapping(value = "/question/delete/{sessionId}")
    public ResponseEntity<?> deleteQuestion(@PathVariable BigInteger sessionId) {
        if (questionService.deleteQuestion(sessionId)) {
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.internalServerError().build();
    }

    @PutMapping(value = "/question/edit/{sessionId}")
    public ResponseEntity<QuestionModel> editQuestion(@PathVariable BigInteger sessionId, @RequestBody QuestionCreationDTO questionCreationDTO) {
        QuestionModel questionModel = questionService.editQuestion(sessionId, questionCreationDTO);
        if (questionModel != null) {
            return ResponseEntity.ok(questionModel);
        }
        return ResponseEntity.internalServerError().build();
    }


}
