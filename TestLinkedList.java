/**
* C202 Program 4
* TestLinkedList.java
* Purpose: Read two text files and count the number of words found and not found from the dictionary in the book.
* To find the average comparisons of words found and not found.
* @author Tyler Goodwin
* @version 1.0 11/7/16
*/
import java.util.*;
import java.io.*;
import java.lang.*;

public class TestLinkedList{
    MyLinkedList[] list = new MyLinkedList[26];
    String word;
    //Removes all special characters for each string.
    public String remover(String l){
        String fixed = "";
        for(int i=0; i < l.length(); i++){
            if(l.charAt(i) > 96 && l.charAt(i) < 123){
                fixed += l.charAt(i);
            }//if
        }//for
        if(fixed == ""){
            fixed = "t";
        }//if
        return fixed;
    }//method
    //Reads the dictionary.txt file and populates each of the 26 LinkedList for each letter of the alphabet.
    public void dictionary(){
        for(int i = 0; i < list.length; i++){
            list[i] = new MyLinkedList<String>();
        }//for
        File d = new File("random_dictionary.txt");
        try{
            Scanner input = new Scanner(d);
            while(input.hasNext()){
                word = input.next();
                word = word.toLowerCase();
                int i = (word.charAt(0)-97);
                list[i].addLast(word);
            }//while
        input.close();
        }//try
        catch(IOException e){}
    }//method
    //Reads the file oliver, compares each word to words found in dictionary,
    //counts the amount of words found and not found, 
    //counts the average amount of string comparisons for words found and not found.
    public void oliver(){
        float found = 0;
        float nFound = 0;
        float cFound = 0;
        float cNFound = 0;
        File o = new File ("oliver.txt");
        try{
            Scanner input = new Scanner(o);
            while(input.hasNext()){
                word = input.next();
                word = word.toLowerCase();
                word = remover(word);
                int i = (word.charAt(0)-97);
                int[] counter = new int[1];
                counter[0] = 0;
                if (list[i].contains(word, counter)){
                    found++;
                    cFound += counter[0];
                }//if
                else{
                    nFound++;
                    cNFound += counter[0];
                }//else
            }//while
            float avgFound = cFound / found;
            float avgNFound = cNFound / nFound;
            System.out.print("Here is the number of words found: " + found + "\n" + 
            "Here is the number of words not found: " + nFound + "\n" + 
            "Here is the average number of comparisons for words found: " + avgFound + "\n" +
            "Here is the average number of comparisons for words not found: " + avgNFound);
            System.out.println("");
            input.close();
        }//try
        catch(IOException e){}
    }//method
    //Used to run each method listed above.
    public static void main(String[] args) {
        TestLinkedList bob = new TestLinkedList();
        bob.dictionary();
        bob.oliver();
    }
}