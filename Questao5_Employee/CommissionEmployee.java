package Questao5_Employee;

public class CommissionEmployee extends Employee{
    private double salarioBruto;
    private double porcentagemComissao;

    public CommissionEmployee (String Nome, String Sobrenome, String CPF, double salarioBruto, double porcentagemComissao){
        super(Nome, Sobrenome, CPF);

        if(porcentagemComissao <= 0.0 || porcentagemComissao >= 1.0)
        throw new IllegalArgumentException("A porcentagem da Comisão deve ser > 0.0 e 1.0");

        if(salarioBruto < 0.0)
            throw new IllegalArgumentException("o salário bruto deve ser >= 0.0");

        this.salarioBruto = salarioBruto;
        this.porcentagemComissao = porcentagemComissao;
    }

    public void setSalarioBruto(double salarioBruto){
        if(salarioBruto < 0.0)
            throw new IllegalArgumentException("o salário bruto deve ser >= 0.0");
        this.salarioBruto =salarioBruto;
    }
    public double getSalarioBruto(){
        return salarioBruto;
    }

    public void setPorcentagemComissao(double porcentagemComissao){
        if(porcentagemComissao <= 0.0 || porcentagemComissao >= 1.0)
            throw new IllegalArgumentException("A porcentagem da Comisão deve ser > 0.0 e 1.0");

        this.porcentagemComissao = porcentagemComissao;
    }

    public double getPorcentagemComissao() {
        return porcentagemComissao;
    }

    @Override
    public double earnings() {
        return getPorcentagemComissao() * getSalarioBruto();
    }
    @Override
    public String toString()
    {
        return String.format("%s: %s%n%s: $%, .2f; %s: %.2f",
                "comissão do empregado", super.toString(),
                "salário bruto", getSalarioBruto(),
                "porcentagem de comissão", getPorcentagemComissao());
    }
}
