package com.example.umut.example1;

/**
 * Created by Umut on 29.5.2016.
 */
public class TrueFalse {
    private  int question;
    private boolean trueQuestion;

    public TrueFalse(int question, boolean TrueQuestion){
        this.question = question;
        this.trueQuestion = TrueQuestion;
    }

    public int getQuestion() {
        return question;
    }

    public void setQuestion(int mQuestion) {
        this.question = mQuestion;
    }

    public boolean isTrueQuestion() {
        return trueQuestion;
    }

    public void setTrueQuestion(boolean trueQuestion){
        this.trueQuestion = trueQuestion;
    }


}
