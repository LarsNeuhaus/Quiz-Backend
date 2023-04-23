package de.neuhaus.quizbackend.rest.service.impl;

import de.neuhaus.quizbackend.rest.dto.QuestionCreationDTO;
import de.neuhaus.quizbackend.rest.model.QuestionModel;
import de.neuhaus.quizbackend.rest.service.QuestionService;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
public class QuestionServiceImpl implements QuestionService {
    @Override
    public QuestionModel getQuestion(BigInteger questionId) {
        return null;
    }

    @Override
    public QuestionModel createQuestion(QuestionCreationDTO questionCreationDTO) {
        return null;
    }

    @Override
    public boolean deleteQuestion(BigInteger sessionId) {
        return false;
    }

    @Override
    public QuestionModel editQuestion(BigInteger sessionId, QuestionCreationDTO questionCreationDTO) {
        return null;
    }
}
