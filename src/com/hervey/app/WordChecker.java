package com.hervey.app;

public class WordChecker {

	   /* 1. Write a print10() method that prints out the first
	    * 10 words of the dictionary array.
	    */

	   /* 2. Write a wordcheck() method that takes a word as a
	    * parameter and returns true if it is in the dictionary array.
	    * Return false if it is not found.
	    */

	   public static void main(String[] args) {
	   String[] dictionary = {"the","of","and","a","to","in","is","you","that","it","he","was","for","on","are","as","with","his","they","I","at","be","this","have","from","or","one","had","by","word","but","not","what","all","were","we","when","your","can","said","there","use","an","each","which","she","do","how","their","if","will","up","other","about","out","many","then","them","these","so","some","her","would","make","like","him","into","time","has","look","two","more","write","go","see","number","no","way","could","people","my","than","first","water","been","call","who","oil","its","now","find","long","down","day","did","get","come","made","may","cat","dog","cats","dogs"};
		   
		 System.out.println("The dictionary contains this many words:  " + dictionary.length);
		   
		   
	     WordChecker checker = new WordChecker();
	      //Uncomment to test Part 1
	      int numberWordsToPrint =10;
	     checker.printWords(numberWordsToPrint, dictionary);
	         

	     // Uncomment to test Part 2
	     String word = "was";
	     if (checker.wordcheck(word, dictionary) == true)
	         {
	         System.out.println(word + " is in dictionary!");
	     }
	     else
	         {
	         System.out.println(word + " is not in dictionary!");
	         }
	     

	     // 3. optional 
	     // checker.printStartsWith("a");
	   }

	private boolean wordcheck(String word, String[] dictionary) {
		// TODO Auto-generated method stub
		for(int i=0; i<dictionary.length ; i++) {
			if(word.equals(dictionary[i])) {
				return true;
			}
		}
		
		return false;
	}

	private void printWords(int numberWordsToPrint, String[] dictionary) {
		// TODO Auto-generated method stub
		for(int i =0; i<numberWordsToPrint; i++) {
			System.out.println("printing word " + (i+1) + ":  " + dictionary[i]);
		}
		
		
	}
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	}