package org.paumard.palindrome;

public class PalindromeSolver {

    public boolean isPalindrome(String sentence) {
    	
    	String sentenceLowerCase = sentence.toLowerCase();
		String sentenceWithoutSpaces=sentenceLowerCase.replaceAll("\\s","");
		String inv="";
	    for (int i=sentenceWithoutSpaces.length()-1 ; i>=0 ; i--)
	    {
	        inv=inv+sentenceWithoutSpaces.charAt(i);
	    }
	    if (sentenceWithoutSpaces.equals(inv)) 
		       return true;
	    else 
	    	return false;
    
    }
}

