package Questao1;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalendarDayTest {
    @Test
     public void testFindDay() {
        CalendarDay calendar = new CalendarDay();
        assertEquals("WEDNESDAY", calendar.findDay(22, 4, 2026));
        assertEquals("MONDAY", calendar.findDay(20, 4, 2026));
        assertEquals("SUNDAY", calendar.findDay(12, 4, 2026));
    }
}
