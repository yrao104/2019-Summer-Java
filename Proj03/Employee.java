 
/**
 * This class represents an employee.
 *
 * @author (Yamuna)
 * @version (1.0)
 */
public class Employee
{
    // Fields
    private String name;
    private double salary;
    
    // Constructors
    /**
     * Initialize name to the employee's name and intialize the salary to the current salary.
     * @param employeeName Employee's name
     * @param currentSalary Current salary
     */
    public Employee(String employeeName, double currentSalary) {
        name = employeeName;
        salary = currentSalary;
    }
    
    // Methods
    /**
     * Return the employee's name.
     * @return Name
     */
    public String getName(){
        return name;
    }
    
    /**
     * Return the employee's salary.
     * @return Current salary
     */
    public double getSalary(){
        return salary;
    }
    
    /**
     * Raise employee's salary by a certain percentage
     * @param byPercent Percent to raise salary.
     * @return Current Balance
     */
    public void raiseSalary(double byPercent){
        salary = salary * (1.0 + (byPercent/100.0));
    }
    
}
