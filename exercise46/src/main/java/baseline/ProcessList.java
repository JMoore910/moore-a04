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

public class ProcessList {
    //  Create method: List<WordOccurrences> findOccurrences(List<String> list)
    //      Create a list to hold word occurrences
    //      List<WordOccurrences> words = new ArrayList<>();
    //      Move through a for loop to get all words from list
    //      for (String i: list)
    //          Move through a for each loop
    //          for (WordOccurrences word: words)
    //              if (word.getWord.equals(i))
    //                  word.addOccurrence();
    //              check if the word is the end of the list, if so create a new word occurrences object
    //              and add it to words with occurrences set to 1
    //              else if (words.indexOf(word) == words.size()-1)
    //                  WordOccurrences temp = new WordOccurrences(i,1);
    //                  words.add(temp);
    //      return words;


    //  Create method: void sortOccurrences(List<WordOccurrences> list)
    //      use an integer the index where that is located
    //      int greatestIndex;
    //      start moving through a for loop with i representing the first index
    //      for (int i = 0; i < list.size()-1; i ++)
    //          greatestIndex = i;
    //          start moving through a nested for loop with j representing the index of the list as
    //          the program searches for higher occurrences
    //          for (int j = i+1; j < list.size(); j ++)
    //              if (list.get(j).getOccurrences() > list.get(greatestIndex).getOccurrences())
    //                  greatestIndex = j;
    //          After exiting the for loop, program has new index of greatest occurrences
    //          use Collections.swap to swap the elements of list at i and greatestIndex
    //          Collections.swap(list,i,greatestIndex);
    //      return list;

    //  Create method: void printOccurrences(List<String> list, String fileName)
    //      List<String> inputList = convertList(fileName)
    //      List<WordOccurrences> words = findOccurrences(inputList)
    //      sortOccurrences(words)
    //      move through a for each loop at each element in list of words
    //      for (WordOccurrences i: words)
    //          print: i.getWord() + ": "
    //          for (int j = 0; j < i.getOccurrences(); j++)
    //              print: "*"
    //          print: "\n"
    //      The printed content is sorted from most to least occurrences
}
