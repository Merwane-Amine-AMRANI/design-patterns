package org.paumard.anagram;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class AnagramTest {

    @Test 
    public void should_return_true_for_two_empty_sentences() {

        // Given
        String sentence1 = "";
        String sentence2 = "";
        AnagramSolver anagramSolver = new AnagramSolver();

        // When
        boolean isAnagram = anagramSolver.isAnagram(sentence1, sentence2);

        // Then
        Assertions.assertThat(isAnagram).isTrue();
    }

    @Test
    public void should_return_true_for_two_equal_sentences() {

        // Given
        String sentence1 = "hello world";
        String sentence2 = "hello world";
        AnagramSolver anagramSolver = new AnagramSolver();

        // When
        boolean isAnagram = anagramSolver.isAnagram(sentence1, sentence2);

        // Then
        Assertions.assertThat(isAnagram).isTrue();
    }

    @Test 
    public void should_return_true_for_two_equal_sentences_mixed_case() {

        // Given
        String sentence1 = "HellOworLd";
        String sentence2 = "helloworld";
        AnagramSolver anagramSolver = new AnagramSolver();

        // When
        boolean isAnagram = anagramSolver.isAnagram(sentence1, sentence2);

        // Then
        Assertions.assertThat(isAnagram).isTrue();
    }

    @Test 
    public void should_return_true_for_two_anagrams_1() {

        // Given
        String sentence1 = "sinks";
        String sentence2 = "skins";
        AnagramSolver anagramSolver = new AnagramSolver();

        // When
        boolean isAnagram = anagramSolver.isAnagram(sentence1, sentence2);

        // Then
        Assertions.assertThat(isAnagram).isTrue();
    }

    @Test 
    public void should_return_true_for_two_anagrams_2() {

        // Given
        String sentence1 = "kinship";
        String sentence2 = "pinkish";
        AnagramSolver anagramSolver = new AnagramSolver();

        // When
        boolean isAnagram = anagramSolver.isAnagram(sentence1, sentence2);

        // Then
        Assertions.assertThat(isAnagram).isTrue();
    }

    @Test 
    public void should_return_false_for_two_different_sentences() {

        // Given
        String sentence1 = "Hello world";
        String sentence2 = "I am Groot";
        AnagramSolver anagramSolver = new AnagramSolver();

        // When
        boolean isAnagram = anagramSolver.isAnagram(sentence1, sentence2);

        // Then
        Assertions.assertThat(isAnagram).isFalse();
    }
}
