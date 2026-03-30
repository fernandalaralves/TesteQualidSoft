package Questao5_Employee;

import javax.swing.*;

public class HourlyEmployee extends Employee{
    private double salarioHora;
    private double Horas;

    public HourlyEmployee(String Nome, String Sobrenome, String CPF, double salarioHora, double Horas){
        super(Nome, Sobrenome, CPF);

        if(salarioHora < 0.0)
            throw new IllegalArgumentException("O salário por hora precisa ser >= 0.0");

        if((Horas < 0.0) || (Horas > 168.0))
            throw new IllegalArgumentException("As horas trabalhadas precisam ser >= 0.0 e <= 168.0");

        this.salarioHora = salarioHora;
        this.Horas = Horas;
    }

    public void setSalarioHora(double salarioHora){
        if(salarioHora < 0.0)
            throw new IllegalArgumentException("O salário por Hora deve ser >= 0.0");
        this.salarioHora = salarioHora;
    }

    public double getSalarioHora(){
        return salarioHora;
    }

    public void setHoras(double horas) {
        if((Horas < 0.0) || (Horas > 168.0))
            throw new IllegalArgumentException("As horas trabalhadas precisam ser >= 0.0 e <= 168.0");

        this.Horas = horas;
    }

    public double getHoras() {
        return Horas;
    }
    @Override
    public double earnings() {
        if(getHoras() <= 40)
            return getSalarioHora() * getHoras();
        else
            return 40 * getSalarioHora() + (getHoras() - 40) * getSalarioHora() * 1.5;
    }
    @Override
    public String toString(){
        return String.format("carga-horária do empregado: %s%n%s: $%,.2f: %s: %, .2f ",
                super.toString(), "salário por hora", getSalarioHora(),
                "horas trabalhadas", getHoras());
    }
}
