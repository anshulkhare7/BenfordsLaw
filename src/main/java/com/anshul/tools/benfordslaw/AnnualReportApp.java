package com.anshul.tools.benfordslaw;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;

/**
 * Main application class for performing Benford's Law analysis on a given dataset.
 * This class reads numbers from a file, counts the occurrences of leading digits,
 * and prints the distribution.
 */
public class AnnualReportApp {

    /**
     * The main entry point for the application.
     * It reads data from a specified file, processes it to extract numbers,
     * counts the frequency of leading digits, and prints the results.
     *
     * @param args Command line arguments (not currently used).
     */
    public static void main( String[] args ){
		String content = "";
		String filePath = "/Users/data/reliance-AR.txt";	
		
		try{
	        content = new String (Files.readAllBytes(Paths.get(filePath)));
	        List<String> rawWordList = getWords(content);
	        
	        
	        Long zeroDigitwordsCount = rawWordList.stream().filter(word -> word.startsWith("0")).count();
	        Long oneDigitwordsCount = rawWordList.stream().filter(word -> word.startsWith("1")).count();
	        Long twoDigitwordsCount = rawWordList.stream().filter(word -> word.startsWith("2")).count();
	        Long threeDigitwordsCount = rawWordList.stream().filter(word -> word.startsWith("3")).count();
	        Long fourDigitwordsCount = rawWordList.stream().filter(word -> word.startsWith("4")).count();
	        Long fiveDigitwordsCount = rawWordList.stream().filter(word -> word.startsWith("5")).count();
	        Long sixDigitwordsCount = rawWordList.stream().filter(word -> word.startsWith("6")).count();
	        Long sevenDigitwordsCount = rawWordList.stream().filter(word -> word.startsWith("7")).count();
	        Long eightDigitwordsCount = rawWordList.stream().filter(word -> word.startsWith("8")).count();
	        Long nineDigitwordsCount = rawWordList.stream().filter(word -> word.startsWith("9")).count();
	       
	        System.out.println("Total count of numbers: "+rawWordList.size());
	        System.out.println("Number of digits starting with 0: "+zeroDigitwordsCount);
	        System.out.println("Number of digits starting with 1: "+oneDigitwordsCount);
	        System.out.println("Number of digits starting with 2: "+twoDigitwordsCount);
	        System.out.println("Number of digits starting with 3: "+threeDigitwordsCount);
	        System.out.println("Number of digits starting with 4: "+fourDigitwordsCount);
	        System.out.println("Number of digits starting with 5: "+fiveDigitwordsCount);
	        System.out.println("Number of digits starting with 6: "+sixDigitwordsCount);
	        System.out.println("Number of digits starting with 7: "+sevenDigitwordsCount);
	        System.out.println("Number of digits starting with 8: "+eightDigitwordsCount);
	        System.out.println("Number of digits starting with 9: "+nineDigitwordsCount);
	        
	    }catch (IOException e) {
	    		e.printStackTrace();
		}
    }

    /**
     * Extracts numerical words (sequences of digits) from a given text.
     * This method iterates through the text and identifies sequences of characters
     * that represent numbers.
     *
     * @param text The input string from which to extract numerical words.
     * @return A list of strings, where each string is a numerical word found in the text.
     *         Returns an empty list if no numerical words are found or if the input text is null or empty.
     */
	public static List<String> getWords(String text) {
	    List<String> words = new ArrayList<String>();
	    if (text == null || text.isEmpty()) {
	        return words;
	    }
	    BreakIterator breakIterator = BreakIterator.getWordInstance();
	    breakIterator.setText(text);
	    int lastIndex = breakIterator.first();
	    while (BreakIterator.DONE != lastIndex) {
	        int firstIndex = lastIndex;
	        lastIndex = breakIterator.next();
	        if (lastIndex != BreakIterator.DONE && Character.isDigit(text.charAt(firstIndex))) {
	            // Extract the identified numerical word
	            String word = text.substring(firstIndex, lastIndex);
	            // Optionally, convert to lowercase if case-insensitivity for numbers is desired,
	            // though typically numbers don't have case.
	            // String word = text.substring(firstIndex, lastIndex).toLowerCase();
	            words.add(word);
	        }
	    }

	    return words;
	}

}
