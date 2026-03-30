package Questao1_Employee;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee emp1 = new Employee("Maria", "Silva", 1500.00);
        Employee emp2 = new Employee("Clara", "Souza", -6000.00);


        System.out.println(" Salários Anuais Iniciais ");
        System.out.printf("%s %s: R$ %.2f%n", emp1.getNome(), emp1.getUltimoNome(), emp1.getSalarioMensal());
        System.out.printf("%s %s: R$ %.2f%n", emp2.getNome(), emp2.getUltimoNome(), emp2.getSalarioMensal());

        // Aumento de 10%
        emp1.setSalarioMensal(emp1.getSalarioMensal() * 1.10);
        emp2.setSalarioMensal(emp2.getSalarioMensal() * 1.10);

        System.out.println("\n=== Salários Anuais Após Aumento de 10% ===");
        System.out.printf("%s %s: R$ %.2f%n", emp1.getNome(), emp1.getUltimoNome(), emp1.getSalarioAnual());
        System.out.printf("%s %s: R$ %.2f%n", emp2.getNome(), emp2.getUltimoNome(), emp2.getSalarioAnual());
    }
}
