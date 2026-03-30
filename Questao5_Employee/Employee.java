package Questao5_Employee;

public abstract class Employee {

    private final String Nome;
    private final String Sobrenome;
    private final String CPF;

    public Employee(String Nome, String Sobrenome, String CPF){
        this.Nome = Nome;
        this.Sobrenome = Sobrenome;
        this.CPF = CPF;
    }

    public String getNome() {
        return Nome;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public String getCPF() {
        return CPF;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", getNome(), getSobrenome(), getCPF());
    }

    public abstract double earnings();
}
