package com.example.learnstuffapp;

public class Term {

    private String term;
    private String content;

    public Term(String term, String content) {
        this.term = term;
        this.content = content;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
