
/**
 * Write a description of class indexmaker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
/**
 * This program takes a text file, creates an index (by line numbers)
 *  for all the words in the file and writes the index
 *  into the output file.  The program takes input and output file names
 *  from the command-line args or prompts the user for the file names.
 */

import java.util.ArrayList;

import java.util.ArrayList;

 

public class IndexEntry

{
    private String word;
    private ArrayList<Integer> numsList;

    public IndexEntry(String str)

    {
        word = str.toUpperCase();
        numsList = new ArrayList<Integer>();
    }
    public void add(int num)
    {
        Integer number = new Integer(num);
        if(!(numsList.contains(number))) 
        {
            numsList.add(number);
        }
    }
    public String getWord()
    {
        return word;
    }
    public String toString()
    {
        String output = word + numsList.toString();
        return output;
    }
}

  
    

