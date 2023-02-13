package registrar.inheritance;

/**
  Employee class: captures the attributes and behaviors of all University employees
*/
public class Staff extends Employee {
  /**
     Constructs an employee.
     @param name the employee name
     @param salary the employee salary
  */

  public Staff(String name, String address) {
    super(name, address);
  }

  public Staff(String name, double salary) {
    super(name, salary);
  }

  public Staff(String name, double salary, String hireDate, String title) {
    super(name, salary, hireDate);
    this.title = title;
  }

  public String toString() {
    //return getClass().getName() + ": name=" + name + ", salary=" + salary;
    return super.toString() + ", title: " + title;
  }

  public String getInfo() {
    //return getClass().getName() + ": name=" + name + ", salary=" + salary;
    return super.getInfo() + ", title: " + title;
  }

  private String title;
}
