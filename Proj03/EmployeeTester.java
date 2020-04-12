
public class EmployeeTester
{
    public static void main(String[] args){
        System.out.println("Exercise 3.11:");
        Employee Natalie = new Employee("Hacker, Natalie", 100);
        System.out.println("Name = " + Natalie.getName());
        System.out.println("Name expected = Hacker, Natalie");
        
        System.out.println("Salary = " + Natalie.getSalary());
        System.out.println("Salary exepected = 100");
        
        Natalie.raiseSalary(10);
        System.out.println("Salary after raise = " + Natalie.getSalary());
        System.out.println("Salary exepected = 110");
    }
}
