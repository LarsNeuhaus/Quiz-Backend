package de.neuhaus.quizbackend.rest.service;

import de.neuhaus.quizbackend.rest.dto.QuestionCreationDTO;
import de.neuhaus.quizbackend.rest.model.QuestionModel;

import java.math.BigInteger;

public interface QuestionService {
    QuestionModel getQuestion(BigInteger questionId);

    QuestionModel createQuestion(QuestionCreationDTO questionCreationDTO);

    boolean deleteQuestion(BigInteger sessionId);

    QuestionModel editQuestion(BigInteger sessionId, QuestionCreationDTO questionCreationDTO);
}
