package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Jeanne Moore
 */


public class WordOccurrences {
    private final String word;
    private int occurrences;

    public WordOccurrences(String word, int occurrences) {
        this.word = word;
        this.occurrences = occurrences;
    }

    public void addOccurrence() {
        this.occurrences++;
    }

    public int getOccurrences() {
        return occurrences;
    }

    public String getWord() {
        return word;
    }
}
