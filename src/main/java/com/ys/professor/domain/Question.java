package com.ys.professor.domain;
import java.util.List;

/**
 * Model class for the book details.
 */
public class Question {
    private Long questionID;
    private String description;
    private String category;


    public Question(String description, String category) {
        this.description = description;
        this.category = category;
    }

    public Long getQuestionID() {
        return questionID;
    }

    public void setQuestionID(Long questionID) {
        this.questionID = questionID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Question)) return false;

        Question question = (Question) o;

        if (!questionID.equals(question.questionID)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return questionID.hashCode();
    }
}