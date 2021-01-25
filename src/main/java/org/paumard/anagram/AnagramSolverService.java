package org.paumard.anagram;

public interface AnagramSolverService {

	
	/**
	 * returns true is <code>sentence1</code> is the anagram of <code>sentence2</code>.
	 * Two sentences are anagram if the same letters are used for both sentences, regardless of upper / lower case
	 * 
	 * @param sentence1
	 * @param sentence2
	 * @return
	 */
	boolean isAnagram(String sentence1, String sentence2);
	
}