package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Jeanne Moore
 */

/*
    Class is responsible for creating a list of WordOccurrences objects
    the program creates a ReadFromFile object to run convertList method
    the list returned is a list containing all words found in the input file.
    The program moves through the whole list of strings and compares each element
    to the list of WordOccurrences. It searches for a WordOccurrence word that is identical.
    If the word is found, then iterate wordOccurrences.occurrences by one
    If the word is not in the list yet, then it is made into a new WordOccurrences object,
    which is then added to the list.
    When the list is filled, it must then be sorted manually.
    To sort the list, compare occurrences of each word. Find the index of the largest and swap
    it with the object at the head of the list. Move forward in the list in a for loop
    doing this for each element except the last one
    the sorted list is then printed in the format of the word and a star for each occurrence
 */

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProcessList {
    public List<WordOccurrences> findOccurrences(List<String> list) {
        //  Create a list to hold word occurrences
        List<WordOccurrences> words = new ArrayList<>();
        WordOccurrences temp;
        //  Move through a for loop to get all words from list
        for (String i: list) {
            if (words.isEmpty()) {
                temp = new WordOccurrences(i,1);
                words.add(temp);
            }
            //  Move through a for each loop to compare to WordOccurrences list
            else
            {
                for (int j = 0; j< words.size(); j++) {
                    if (words.get(j).getWord().equals(i)) {
                        words.get(j).addOccurrence();
                        break;
                    }
                    //  check if the word is the end of the list, if so create a new word occurrences object
                    //  and add it to words with occurrences set to 0, list will run once more before breaking
                    else if (j == words.size()-1) {
                        temp = new WordOccurrences(i,0);
                        words.add(temp);
                    }
                }
            }
        }
        return words;
    }

    public void sortOccurrences(List<WordOccurrences> list) {
        //  use an integer the index where that is located
        int greatestIndex;
        //  start moving through a for loop with i representing the first index
        for (int i = 0; i < list.size() - 1; i++) {
            greatestIndex = i;
            //  start moving through a nested for loop with j representing the index of the list as
            //  the program searches for higher occurrences
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).getOccurrences() > list.get(greatestIndex).getOccurrences())
                    greatestIndex = j;
            }
            //  After exiting the for loop, program has new index of greatest occurrences
            //  use Collections.swap to swap the elements of list at i and greatestIndex
            Collections.swap(list, i, greatestIndex);
        }
    }

    public void printOccurrences(String fileName) throws FileNotFoundException {
        ReadFromFile reader = new ReadFromFile();
        List<String> inputList = reader.convertList(fileName);
        List<WordOccurrences> words = findOccurrences(inputList);
        sortOccurrences(words);
        //  move through a for each loop at each element in list of words
        for (WordOccurrences i: words) {
            System.out.print(i.getWord() + ": ");
            for (int j = 0; j < i.getOccurrences(); j++)
                System.out.print("*");
            System.out.print("\n");
        }
        //  The printed content is sorted from most to least occurrences
    }
}
