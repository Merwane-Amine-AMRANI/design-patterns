package org.paumard.anagram;

import java.util.Arrays;
import java.util.Objects;

public class AnagramSolver implements AnagramSolverService {
	
	

    @Override
	public boolean isAnagram(String sentence1, String sentence2) {
    	
    	
    	String sortedSentence1 = sortChars(sentence1);
    	String sortedSentence2 = sortChars(sentence2);
    	
    	return Objects.equals(sortedSentence1, sortedSentence2);
    	
    	
    }

	private String sortChars(String sentence1) {
		char[] charArray1 = sentence1.toLowerCase().toCharArray();
    	Arrays.sort(charArray1);
    	String sortedSentence1 = new String(charArray1);
		return sortedSentence1;
	}
}
