package Questao1;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;


public class CalendarDay {
    public static String findDay(int day, int month, int year) {

        LocalDate date = LocalDate.of(year, month, day);
        return date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.US).toUpperCase();
    
    }
}
