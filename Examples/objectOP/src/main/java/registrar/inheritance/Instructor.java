package registrar.inheritance;

import java.util.ArrayList;

/**
  Employee class: captures the attributes and behaviors of all University employees
*/
public class Instructor extends Employee {
  /**
     Constructs an employee.
     @param name the employee name
     @param salary the employee salary
  */
  public Instructor(String name, String address) {
    super(name, address);
  }

  public Instructor(String name, double salary, String hireDate) {
    super(name, salary, hireDate);
  }

  @Override
  public String toString() {
    //return getClass().getName() + ": name=" + name + ", salary=" + salary;
    return super.toString() + ", teaching section: " + currentSection;
  }

  @Override
  public String getInfo() {
    return super.getInfo() + ", teaching section: " + currentSection;
  }

  private ArrayList<String> coursesTought;
  private String currentSection;
}
