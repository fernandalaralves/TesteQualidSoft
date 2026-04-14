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
    public void testaIPValido3() {
        assertTrue(validate("150.251.200.255"));
    }

    @Test
    public void testaIPInvalido() {
        assertFalse(validate("316.0.0.1"));
    }

    @Test
    public void testaIPInvalido2() {
        assertFalse(validate("999.999.999.999"));
    }

    @Test
    public void testaIPInvalido5() {
        assertFalse(validate("abc.def.ghi.jkl"));
    }
}
