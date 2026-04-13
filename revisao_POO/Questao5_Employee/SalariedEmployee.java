package Questao5_Employee;

public class SalariedEmployee extends Employee{
    private double salarioSemanal;

    public SalariedEmployee(String Nome, String Sobrenome, String CPF, double salarioSemanal){
        super(Nome, Sobrenome, CPF);

        if (salarioSemanal < 0.0)
            throw new IllegalArgumentException("O salário semanal deve ser maior ou igual a 0.0");
        this.salarioSemanal = salarioSemanal;
    }

    public void setSalarioSemanal(double salarioSemanal) {
        if (salarioSemanal < 0.0)
            throw new IllegalArgumentException("O salário semanal deve ser maior ou igual a 0.0");
        this.salarioSemanal = salarioSemanal;
    }

    public double getSalarioSemanal() {
        return salarioSemanal;
    }
    
    @Override
    public double earnings() {
        return getSalarioSemanal();
    }

    @Override
    public String toString(){
        return String.format("Empregado Assalariado: %s%n%s: $%, .2f",
        super.toString(), "Salário semanal", getSalarioSemanal());
    }
}
