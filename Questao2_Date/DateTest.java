package Questao2_Date;

import java.util.Scanner;

public class DateTest {

    public static void main(String[] args) {
        //Criar objeto scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Entre com um dia entre " + "1 a 31:");
        int Day = input.nextInt();

        System.out.println("Entre com um mês entre " + "1 a 12:");
        int Month = input.nextInt();

        System.out.println("Entre com um ano depois de " + "Cristo");
        int Year = input.nextInt();

        Date date = new Date(Day, Month, Year);
        date.DisplayDate();
    }
}
