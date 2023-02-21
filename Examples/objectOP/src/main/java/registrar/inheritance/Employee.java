package registrar.inheritance;

/**
  Employee class: captures the attributes and behaviors of all University employees
*/
public class Employee {
  /**
     Constructs an employee.
     @param name the employee name
     @param salary the employee salary
  */
  public Employee(String name) {
    this.name = name;
    this.salary = 0;
    this.address = "unknown";
    this.dateOfHire = "unknown";
  }

  public Employee(String name, String address) {
    this.name = name;
    this.salary = 0;
    this.address = address;
    this.dateOfHire = "unknown";
  }

  public Employee(String name, double salary) {
    this.name = name;
    this.salary = salary;
    this.address = "unknown";
    this.dateOfHire = "unknown";
  }

  public Employee(String name, double salary, String hireDate) {
    this.name = name;
    this.salary = salary;
    this.dateOfHire = hireDate;
  }

  public String toString() {
    //return getClass().getName() + ": name=" + name + ", salary=" + salary;
    return " name:" + name + ", salary: $" + salary;
  }

  public String getInfo() {
    return getClass().getName() + ": name=" + name + ", salary=" + salary;
  }

  private String name;
  private String address;
  private double salary;
  private String dateOfHire;
}
