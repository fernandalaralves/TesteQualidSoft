package Questao5_Employee;


public class PayrollSystemTest {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("João", "Silva", "654.123.556-97", 800.00);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Ana", "Pereira", "538.981.888-01", 16.75, 40);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Samuel", "Torres", "356.975.324-32", 10000, .06);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bruna", "Lima", "246.189.654-91", 5000, .04, 300);

        System.out.println("Funcionários processados individualmente");

        System.out.printf("%n%s%n%s: $%, .2f%n%n", salariedEmployee, "ganhado", salariedEmployee.earnings());

        System.out.printf("%s%n%s: $%, .2f%n%n",
                hourlyEmployee, "ganhado", hourlyEmployee.earnings());
        System.out.printf("%s%n%s: $%, .2f%n%n",
                commissionEmployee, "ganhado", commissionEmployee.earnings());
        System.out.printf("%s%n%s: $%, .2f%n%n", basePlusCommissionEmployee,
                "ganhado", basePlusCommissionEmployee.earnings());

        Employee[] employees = new Employee[4];

        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;

        System.out.println("Empregados processados polimorficamente: ");

        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee);

            if (currentEmployee instanceof BasePlusCommissionEmployee)
            {
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;

                employee.setsalarioBase(1.10 * employee.getsalarioBase());

                System.out.printf("Novo salário base com aumento de 10%% é: $%, .2f%n",
                        employee.getsalarioBase());
            }

            System.out.printf("ganhado $%, .2f%n%n",
                    currentEmployee.earnings());
        }
        for (int j = 0; j < employees.length; j++)
            System.out.printf("Employee %d is a %s%n", j, employees[j].getClass().getName());
    }
}
