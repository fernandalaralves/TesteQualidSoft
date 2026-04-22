package Questao2;


import org.junit.Test;
import static org.junit.Assert.*;

public class CompareSubstringsTest {
    @Test
    public void testGetSmallestAndLargest() {
        CompareSubstrings cs = new CompareSubstrings();
        assertEquals("ava\nwel", cs.getSmallestAndLargest("welcomeToJava", 3));
        assertEquals("navio\narroz", cs.getSmallestAndLargest("arroznavio", 5));
        assertEquals("a\nc", cs.getSmallestAndLargest("abc", 1));
    }
}
