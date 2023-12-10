package org.example.javaFundamentalsCoding.blok4.hw2;

public class SentenceBuilder {

    private String sentence = "";

    public void appendWord(String word) {
        if (sentence.isEmpty()) {
            sentence += word.substring(0, 1).toUpperCase() + word.substring(1);
        } else {
            sentence += word;
        }
        sentence += " ";
    }

    public void finishSentence() {
        sentence = sentence.trim();
        sentence += ".";
    }

    public String getSentence() {
        return sentence;
    }
}
