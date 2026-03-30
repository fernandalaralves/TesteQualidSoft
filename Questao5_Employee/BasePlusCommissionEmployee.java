package Questao5_Employee;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double salarioBase;

    public BasePlusCommissionEmployee(String Nome, String Sobrenome, String CPF, double salarioBruto, double porcentagemComissao, double salarioBase) {
        super(Nome, Sobrenome, CPF, salarioBruto, porcentagemComissao);
        if (salarioBase < 0.0)
            throw new IllegalArgumentException("o salário base deve ser >= 0.0");
        this.salarioBase = salarioBase;
    }

    public void setsalarioBase(double salarioBase) {
        if (salarioBase < 0.0)
            throw new IllegalArgumentException("o salário base deve ser >= 0.0");

        this.salarioBase = salarioBase;
    }

    public double getsalarioBase() {
        return salarioBase;
    }

    @Override
    public double earnings() {
        return getsalarioBase() + super.earnings();
    }

    @Override
    public String toString() {
        return String.format("%s %s; %s: $%, .2f",
                "base salarial", super.toString(),
                "salário base", getsalarioBase());
    }
}