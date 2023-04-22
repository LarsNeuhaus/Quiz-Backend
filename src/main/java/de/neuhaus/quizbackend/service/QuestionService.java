package de.neuhaus.quizbackend.service;

import de.neuhaus.quizbackend.dto.QuestionCreationDTO;
import de.neuhaus.quizbackend.model.QuestionModel;

import java.math.BigInteger;

public interface QuestionService {
    QuestionModel getQuestion(BigInteger questionId);

    QuestionModel createQuestion(QuestionCreationDTO questionCreationDTO);

    boolean deleteQuestion(BigInteger sessionId);

    QuestionModel editQuestion(BigInteger sessionId, QuestionCreationDTO questionCreationDTO);
}
