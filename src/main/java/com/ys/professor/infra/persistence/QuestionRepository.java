package com.ys.professor.infra.persistence;

import com.ys.professor.domain.Question;

import java.util.Collections;
import java.util.List;

/**
 * A simple repository created for the purpose of experimenting with JPA. junit, maven, ... educational purposes only
 *
 * Created by rob on 1/9/15.
 */
public class QuestionRepository {


    public QuestionRepository() {
    }


    public void create(Question question) {
    }


    public void update(Question question) {
    }

    public void delete(Question question) {
    }


    public List<Question> findAllQuestions() {
        return Collections.EMPTY_LIST;
    }

    public Question findById(Long questionId){
        return null;
    }


}
