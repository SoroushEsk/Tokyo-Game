package com.security.password.recovery;

public enum Question {
    FATHERS_NAME("What is your father’s name?"),
    FAVOURITE_COLOR("What is your favourite color?"),
    FIRST_PET_NAME("What was the name of your first pet?");

    private final String question;

    Question(String question) {
        this.question = question;
    }

    public String getQuestion() {
        return this.question;
    }
}
