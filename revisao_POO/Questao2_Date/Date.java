package Questao2_Date;

public class Date {
    private int Day;
    private int Month;
    private int Year;

    public Date(int Day, int Month, int Year){
        if (Day > 0 && Day < 32){
            this.Day = Day;
        }
        if (Month > 0 && Month <= 12){
            this.Month = Month;
        }

        if (Year >= 0) {
            this.Year = Year;
        }
    }

    public void setDay(int Day){
        if (Day > 0 && Day <32){
            this.Day = Day;
        }
    }

    public void setMonth(int Month) {
        if(Month > 0 && Month <= 12){
            this.Month = Month;
        }
    }

    public void setYear(int Year) {
        if (Year >= 0) {
            this.Year = Year;
        }
    }

    public int getDay() {
        return Day;
    }

    public int getMonth() {
        return Month;
    }

    public int getYear() {
        return Year;
    }

    public void DisplayDate() {
        System.out.printf("%d/%d/%d", Day, Month, Year);
    }
}
