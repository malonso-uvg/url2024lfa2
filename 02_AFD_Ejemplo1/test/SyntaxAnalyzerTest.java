package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import src.SyntaxAnalyzer;

public class SyntaxAnalyzerTest {

    @Test
    public void testStringIsAccepted() {

        assertEquals(SyntaxAnalyzer.ACCEPTED, SyntaxAnalyzer.stringIsAccepted("aabbabb"));
        assertEquals(SyntaxAnalyzer.ACCEPTED, SyntaxAnalyzer.stringIsAccepted("abb"));
        assertEquals(SyntaxAnalyzer.ERROR, SyntaxAnalyzer.stringIsAccepted("aaa"));
        assertEquals(SyntaxAnalyzer.ERROR, SyntaxAnalyzer.stringIsAccepted("aab"));

    }
}
