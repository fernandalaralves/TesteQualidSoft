package Questao2;


import org.junit.Test;
import static org.junit.Assert.*;
import static Questao2.CompareSubstrings.getSmallestAndLargest;

public class CompareSubstringsTest {
    @Test
    public void testaExemploDaQuestao() {
        assertEquals("ava\nwel", getSmallestAndLargest("welcometojava", 3));
    }

    @Test
    public void testaSubstringTamanho1() {
        assertEquals("a\nz", getSmallestAndLargest("az", 1));
    }

    @Test
    public void testaStringPequena() {
        assertEquals("abc\nabc", getSmallestAndLargest("abc", 3));
    }

    @Test
    public void testaSubstringNoMeio() {
        assertEquals("ana\nban", getSmallestAndLargest("banana", 3));
    }

    @Test
    public void testaSubstringTamanho2() {
        assertEquals("ab\ncd", getSmallestAndLargest("abcd", 2));
    }
}
