package com.anshul.tools.benfordslaw;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void testGetWords_emptyString() {
        List<String> expected = Collections.emptyList();
        List<String> actual = AnnualReportApp.getWords("");
        assertEquals(expected, actual);
    }

    @Test
    public void testGetWords_noNumbers() {
        List<String> expected = Collections.emptyList();
        List<String> actual = AnnualReportApp.getWords("abc def ghi");
        assertEquals(expected, actual);
    }

    @Test
    public void testGetWords_onlyNumbers() {
        List<String> expected = Arrays.asList("123", "456", "789");
        List<String> actual = AnnualReportApp.getWords("123 456 789");
        assertEquals(expected, actual);
    }

    @Test
    public void testGetWords_mixedContent() {
        List<String> expected = Arrays.asList("123", "456");
        List<String> actual = AnnualReportApp.getWords("abc 123 def 456 ghi");
        assertEquals(expected, actual);
    }

    @Test
    public void testGetWords_leadingZeros() {
        List<String> expected = Arrays.asList("007", "008");
        List<String> actual = AnnualReportApp.getWords("abc 007 def 008 ghi");
        assertEquals(expected, actual);
    }

    @Test
    public void testGetWords_nullInput() {
        List<String> expected = Collections.emptyList();
        List<String> actual = AnnualReportApp.getWords(null);
        assertEquals(expected, actual);
    }
}
