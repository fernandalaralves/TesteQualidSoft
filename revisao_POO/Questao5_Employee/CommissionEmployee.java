package Questao5_Employee;

public class CommissionEmployee extends Employee{
    private double totalVendas;
    private double porcentagemComissao;

    public CommissionEmployee (String Nome, String Sobrenome, String CPF, double totalVendas, double porcentagemComissao){
        super(Nome, Sobrenome, CPF);

        if(porcentagemComissao <= 0.0 || porcentagemComissao >= 1.0)
        throw new IllegalArgumentException("A porcentagem da Comisão deve ser > 0.0 e 1.0");

        if(totalVendas < 0.0)
            throw new IllegalArgumentException("o total de vendas deve ser >= 0.0");

        this.totalVendas = totalVendas;
        this.porcentagemComissao = porcentagemComissao;
    }

    public void settotalVendas(double totalVendas){
        if(totalVendas < 0.0)
            throw new IllegalArgumentException("o total de vendas deve ser >= 0.0");
        this.totalVendas =totalVendas;
    }
    public double gettotalVendas(){
        return totalVendas;
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
        return getPorcentagemComissao() * gettotalVendas();
    }
    @Override
     public String toString() {
        return String.format("%s: %s%n%s: $%,.2f; %s: %.2f",
                "Empregado com comissão", super.toString(),
                "total de vendas", gettotalVendas(),
                "porcentagem de comissão", getPorcentagemComissao());
    }
}
