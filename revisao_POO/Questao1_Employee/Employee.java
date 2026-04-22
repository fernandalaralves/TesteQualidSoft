package Questao1_Employee;

public class Employee {
    private String Nome;
    private String UltimoNome;
    private double SalarioMensal;

    public Employee(String Nome, String UltimoNome, double SalarioMensal) {
        this.Nome = Nome;
        this.UltimoNome = UltimoNome;
        if (SalarioMensal > 0)
            this.SalarioMensal = SalarioMensal;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getUltimoNome() {
        return UltimoNome;
    }
    public void setUltimoNome(String UltimoNome) {
        this.UltimoNome = UltimoNome;
    }

    public double getSalarioMensal() {
        return SalarioMensal;
    }

    public void setSalarioMensal(double SalarioMensal) {
        if (SalarioMensal > 0)
            this.SalarioMensal = SalarioMensal;
    }

    public double getSalarioAnual() {
        return SalarioMensal * 12; }
}