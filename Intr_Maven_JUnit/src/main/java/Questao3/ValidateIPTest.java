package Questao3;

import org.junit.Test;
import static org.junit.Assert.*;
import static Questao3.ValidateIP.validate;

public class ValidateIPTest {
    @Test
    public void testaIPValido() {
        assertTrue(validate("192.168.1.1"));
    }

    @Test
    public void testaIPValido2() {
        assertTrue(validate("0.0.0.0"));
    }

    @Test
    public void testaIPInvalido() {
        assertFalse(validate("999.999.999.999"));
    }

    @Test
    public void testaIPInvalido2() {
        assertFalse(validate("abc.def.ghi.jkl"));
    }
}
