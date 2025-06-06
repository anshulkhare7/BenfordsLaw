package com.anshul.tools.benfordslaw;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    @DisplayName("Should return an empty list when input string is empty")
    public void shouldReturnEmptyListForEmptyInput() {
        assertEquals(Collections.emptyList(), AnnualReportApp.getWords(""));
    }

    @Test
    @DisplayName("Should return an empty list when input string contains no numbers")
    public void shouldReturnEmptyListForNoNumbers() {
        assertEquals(Collections.emptyList(), AnnualReportApp.getWords("abc def ghi"));
    }

    @Test
    @DisplayName("Should return a list of numbers when input string contains only numbers")
    public void shouldReturnListOfNumbersForOnlyNumbers() {
        List<String> expected = Arrays.asList("123", "456", "789");
        assertEquals(expected, AnnualReportApp.getWords("123 456 789"));
    }

    @Test
    @DisplayName("Should return a list of numbers when input string contains mixed content")
    public void shouldReturnListOfNumbersForMixedContent() {
        List<String> expected = Arrays.asList("123", "456");
        assertEquals(expected, AnnualReportApp.getWords("abc 123 def 456 ghi"));
    }

    @Test
    @DisplayName("Should return a list of numbers with leading zeros preserved")
    public void shouldReturnListOfNumbersWithLeadingZeros() {
        List<String> expected = Arrays.asList("007", "008");
        assertEquals(expected, AnnualReportApp.getWords("abc 007 def 008 ghi"));
    }

    @Test
    @DisplayName("Should return an empty list when input is null")
    public void shouldReturnEmptyListForNullInput() {
        assertEquals(Collections.emptyList(), AnnualReportApp.getWords(null));
    }
}
