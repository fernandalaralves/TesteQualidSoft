package Questao1;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarDay {
    public static String findDay(int day, int month, int year) {

        Calendar calendar = Calendar.getInstance();
        calendar.set(day, month - 1, year);

        int diaSemana = calendar.get(Calendar.DAY_OF_WEEK);

        String dia = "";

        if (diaSemana == 1) dia = "Domingo";
        else if (diaSemana == 2) dia = "Segunda-feira";
        else if (diaSemana == 3) dia = "Terça-feira";
        else if (diaSemana == 4) dia = "Quarta-feira";
        else if (diaSemana == 5) dia = "Quinta-feira";
        else if (diaSemana == 6) dia = "Sexta-feira";
        else if (diaSemana == 7) dia = "Sábado";

        return dia;
    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o dia: ");
        int day = input.nextInt();

        System.out.print("Digite o mês: ");
        int month = input.nextInt();

        System.out.print("Digite o ano: ");
        int year = input.nextInt();

        String resultado = findDay(day, month, year);

        System.out.println("Dia da semana: " + resultado);
    }
}
