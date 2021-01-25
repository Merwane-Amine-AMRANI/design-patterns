package org.paumard.anagram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AnagramServiceImp implements AnagramService {
	
	
	@SuppressWarnings("unused")
	private AnagramSolverService anagramSolver;
	 
	public AnagramServiceImp(AnagramSolverService anagramSolver) {
		this.anagramSolver = anagramSolver;
	}

	@Override
	public Set<String> findLongestAnagramSetFrom(Set<String> words) {
		
		 
		Function<String, String> sortChar = sentence -> {
			char[] charArray1 = sentence.toLowerCase().toCharArray();
			Arrays.sort(charArray1);
			String sortedSentence1 = new String(charArray1);
			return sortedSentence1.trim();
		};
		
		Map<String, List<String>> map =
				words.stream().collect(Collectors.groupingBy(sortChar));
		
		Entry<String, List<String>> entry =
				 map.entrySet()
				.stream()
				.filter(e -> e.getValue().size() >= 2)
				.max(Map.Entry.comparingByValue(Comparator.comparing(List::size)))
				.orElseThrow();

		return(entry.getValue().stream().collect(Collectors.toSet()));
		
		
	}

	@Override
	public Set<String> findLongestAnagramFrom(Set<String> words) {
			
		Function<String, String> sortChar = sentence -> {
		char[] charArray1 = sentence.toLowerCase().toCharArray();
		Arrays.sort(charArray1);
		String sortedSentence1 = new String(charArray1);
		return sortedSentence1;
	};

//	// clés : chaîne triée
//	// valeurs : listes de mots anagrames les uns des autres
	
	Map<String, List<String>> map = words.stream()
			.collect(Collectors.groupingBy(sortChar));
	
	//System.out.println("# map " + map.size());
	
	Entry<String, List<String>> entry1 = 
			map.entrySet().stream()
			.filter(e -> e.getValue().size() >= 2)
			.max(Map.Entry.comparingByKey(Comparator.comparing(String::length)))
			.orElseThrow();
	
		return  (entry1.getValue().stream().collect(Collectors.toSet()));
		
	}
	

}
