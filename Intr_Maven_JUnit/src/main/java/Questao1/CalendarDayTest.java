package Questao1;

import org.junit.Test;
import static org.junit.Assert.*;
import static Questao1.CalendarDay.findDay;

public class CalendarDayTest {
    @Test
    public void testaDomingo() {
        assertEquals("Domingo", findDay(13, 4, 2025));
    }

    @Test
    public void testaSegunda() {
        assertEquals("Segunda-feira", findDay(14, 4, 2025));
    }

    @Test
    public void testaTerca() {
        assertEquals("Terça-feira", findDay(15, 4, 2025));
    }

    @Test
    public void testaQuarta() {
        assertEquals("Quarta-feira", findDay(16, 4, 2025));
    }

    @Test
    public void testaQuinta() {
        assertEquals("Quinta-feira", findDay(17, 4, 2025));
    }

    @Test
    public void testaSexta() {
        assertEquals("Sexta-feira", findDay(18, 4, 2025));
    }

    @Test
    public void testaSabado() {
        assertEquals("Sábado", findDay(19, 4, 2025));
    }

    @Test
    public void testaDataHistorica() {
        assertEquals("Sexta-feira", findDay(13, 4, 1990));
    }

    @Test
    public void testaAnoBissexto() {
        assertEquals("Segunda-feira", findDay(29, 2, 2016));
    }
}
