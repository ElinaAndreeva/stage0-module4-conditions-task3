package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary < 10000) {
            double salary2 = salary * 0.85;
            System.out.println(salary2);
        } else if (salary > 10000 && salary <= 20000) {
            double salary2 = salary*0.82;
            System.out.println(salary2);
        } else if (salary > 20000) {
            double salary2 = salary * 0.8;
            System.out.println(salary2);
        } else if (salary < 0) {
            System.out.println("wrong input!");
        }
    }
}
