package org.paumard.palindrome;

import org.assertj.core.api.Assertions;
import org.junit.Ignore;
import org.junit.Test;

public class PalindromeTest {

    @Test 
    public void should_return_true_for_an_empty_sentence() {

        // Given
        String sentence = "";
        PalindromeSolver solver = new PalindromeSolver();

        // When
        boolean isPalindrome = solver.isPalindrome(sentence);

        // Then
        Assertions.assertThat(isPalindrome).isTrue();
    }

    @Test 
    public void should_return_true_for_a_one_char_sentence() {

        // Given
        String sentence = "a";
        PalindromeSolver solver = new PalindromeSolver();

        // When
        boolean isPalindrome = solver.isPalindrome(sentence);

        // Then
        Assertions.assertThat(isPalindrome).isTrue();
    }

    @Test 
    public void should_return_true_for_a_two_chars_sentence_with_same_letters() {

        // Given
        String sentence = "aa";
        PalindromeSolver solver = new PalindromeSolver();

        // When
        boolean isPalindrome = solver.isPalindrome(sentence);

        // Then
        Assertions.assertThat(isPalindrome).isTrue();
    }

    @Test 
    public void should_return_false_for_a_two_chars_sentence_with_different_letters() {

        // Given
        String sentence = "ab";
        PalindromeSolver solver = new PalindromeSolver();

        // When
        boolean isPalindrome = solver.isPalindrome(sentence);

        // Then
        Assertions.assertThat(isPalindrome).isFalse();
    }

    @Test @Ignore
    public void should_return_true_for_an_even_number_of_chars_sentence_that_is_a_palindrome() {

        // Given
        String sentence = "abcdeffedcba";
        PalindromeSolver solver = new PalindromeSolver();

        // When
        boolean isPalindrome = solver.isPalindrome(sentence);

        // Then
        Assertions.assertThat(isPalindrome).isTrue();
    }

    @Test @Ignore
    public void should_return_true_for_an_odd_number_of_chars_sentence_that_is_a_palindrome() {

        // Given
        String sentence = "abcdefedcba";
        PalindromeSolver solver = new PalindromeSolver();

        // When
        boolean isPalindrome = solver.isPalindrome(sentence);

        // Then
        Assertions.assertThat(isPalindrome).isTrue();
    }

    @Test @Ignore
    public void should_return_false_for_an_even_number_of_chars_sentence_that_is_not_a_palindrome() {

        // Given
        String sentence = "axbcxdeffxedcbax";
        PalindromeSolver solver = new PalindromeSolver();

        // When
        boolean isPalindrome = solver.isPalindrome(sentence);

        // Then
        Assertions.assertThat(isPalindrome).isFalse();
    }

    @Test @Ignore
    public void should_return_false_for_an_odd_number_of_chars_sentence_that_is_not_a_palindrome() {

        // Given
        String sentence = "axbcdexfexdcbxa";
        PalindromeSolver solver = new PalindromeSolver();

        // When
        boolean isPalindrome = solver.isPalindrome(sentence);

        // Then
        Assertions.assertThat(isPalindrome).isFalse();
    }

    @Test @Ignore
    public void should_return_true_for_an_even_number_of_chars_sentence_with_spaces_that_is_a_palindrome() {

        // Given
        String sentence = "ab c def fed cba";
        PalindromeSolver solver = new PalindromeSolver();

        // When
        boolean isPalindrome = solver.isPalindrome(sentence);

        // Then
        Assertions.assertThat(isPalindrome).isTrue();
    }

    @Test @Ignore
    public void should_return_true_for_an_odd_number_of_chars_sentence_with_spaces_that_is_a_palindrome() {

        // Given
        String sentence = "a bc defe dcba";
        PalindromeSolver solver = new PalindromeSolver();

        // When
        boolean isPalindrome = solver.isPalindrome(sentence);

        // Then
        Assertions.assertThat(isPalindrome).isTrue();
    }

    @Test @Ignore
    public void should_return_false_for_an_even_number_of_chars_sentence_with_spaces_that_is_not_a_palindrome() {

        // Given
        String sentence = "ax bc x def fxedc bax";
        PalindromeSolver solver = new PalindromeSolver();

        // When
        boolean isPalindrome = solver.isPalindrome(sentence);

        // Then
        Assertions.assertThat(isPalindrome).isFalse();
    }

    @Test @Ignore
    public void should_return_false_for_an_odd_number_of_chars_sentence_with_spaces_that_is_not_a_palindrome() {

        // Given
        String sentence = " a xbcdex fex dcb xa";
        PalindromeSolver solver = new PalindromeSolver();

        // When
        boolean isPalindrome = solver.isPalindrome(sentence);

        // Then
        Assertions.assertThat(isPalindrome).isFalse();
    }

    @Test @Ignore
    public void should_return_true_for_an_odd_number_of_chars_sentence_with_spaces_and_mixed_case_that_is_a_palindrome() {

        // Given
        String sentence = "Abc D Efedc Ba";
        PalindromeSolver solver = new PalindromeSolver();

        // When
        boolean isPalindrome = solver.isPalindrome(sentence);

        // Then
        Assertions.assertThat(isPalindrome).isTrue();
    }

    @Test @Ignore
    public void should_return_false_for_an_even_number_of_chars_sentence_with_spaces_and_mixed_case_that_is_not_a_palindrome() {

        // Given
        String sentence = "Ax Bcx Deff Xedc Bax";
        PalindromeSolver solver = new PalindromeSolver();

        // When
        boolean isPalindrome = solver.isPalindrome(sentence);

        // Then
        Assertions.assertThat(isPalindrome).isFalse();
    }

    @Test @Ignore
    public void should_return_false_for_an_odd_number_of_chars_sentence_with_spaces_and_mixed_case_that_is_not_a_palindrome() {

        // Given
        String sentence = " A Xbc Dex Fex Dcb Xa";
        PalindromeSolver solver = new PalindromeSolver();

        // When
        boolean isPalindrome = solver.isPalindrome(sentence);

        // Then
        Assertions.assertThat(isPalindrome).isFalse();
    }
}
