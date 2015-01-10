package com.ys.professor.infra.persistence;

import com.ys.professor.domain.Question;
import com.ys.professor.infra.persistence.QuestionRepository;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;


public class QuestionRepositoryTest {

    private static QuestionRepository mockedQuestionRepository;
    private static Question question1;
    private static Question question2;
    private static Question question3;

    @BeforeClass
    public static void setUp() {
        mockedQuestionRepository = mock(QuestionRepository.class);
        question1 = new Question("The original question","philosophy");
        question1.setQuestionID(new Long(1));
        question2 = new Question("The un-original question","philosophy");
        question2.setQuestionID(new Long(2));
        question3 = new Question("Why is the sky blue","science");
        question3.setQuestionID(new Long(3));

        when(mockedQuestionRepository.findAllQuestions()).thenReturn(Arrays.asList(question1, question2,question3));
        when(mockedQuestionRepository.findById(new Long(1))).thenReturn(question1);

    }

    @Test
    public void testGetAllBooks() throws Exception {

        List<Question> allQuestions = mockedQuestionRepository.findAllQuestions();
        assertEquals(3, allQuestions.size());
        Question question = allQuestions.get(0);

        assertEquals(question, question1);

    }

    @Test
    public void testGetBook() {
    Question question = mockedQuestionRepository.findById(new Long(1));

        assertNotNull(question);
        assertEquals(question1, question);


    }

}