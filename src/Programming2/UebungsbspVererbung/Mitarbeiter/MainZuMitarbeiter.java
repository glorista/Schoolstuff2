package Programming2.UebungsbspVererbung.Mitarbeiter;

public class MainZuMitarbeiter {
    public static void main(String[] args) {
        Employee e1 = new Employee("k","m","Software",200);
        Employee e2 = new Employee("f","l","Software",200);
        Employee e3 = new Employee("g","o","Hausbau",400);
        PercentCommissionEmployee p1 = new PercentCommissionEmployee("g","f","Software",2000,10);


        EmployeeManager em = new EmployeeManager();
        em.addEmployee(e1);
        em.addEmployee(e2);
        em.addEmployee(e3);
        em.addEmployee(p1);

        System.out.println(p1.getFullSalary());

        System.out.println(em.getSalaryByDepartment());
    }
}
