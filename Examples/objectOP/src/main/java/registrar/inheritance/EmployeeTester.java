package registrar.inheritance;

public class EmployeeTester {
  public static void main(String[] args) {

    Employee en = new Employee("Alan Turing", "1 Trinity Street, Cambridge, CB2 1SZ");
    Instructor in = new Instructor("Alan Turing", "1 Trinity Street, Cambridge, CB2 1SZ");
    Staff sn = new Staff("Alan Turing", "1 Trinity Street, Cambridge, CB2 1SZ");

    System.out.println(en.getInfo());
    System.out.println(in.getInfo());
    System.out.println(sn.getInfo());

    System.out.println(en);
    System.out.println(in);
    System.out.println(sn);

  }
}
