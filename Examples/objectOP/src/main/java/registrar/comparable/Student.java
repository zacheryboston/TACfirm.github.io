package registrar.comparable;

/**
   A class for gethering student information
*/
public class Student implements Comparable<Student> {
  /**
     Constructs a Student object that saves the name of a person.
     @param aName the name of the person.
  */
  public Student(String aName) {
    this.name = aName;
  }

  public Student(String aName, int aId) {
    this.name = aName;
    this.idNumber = aId;
  }

  public Student(String aName, String aMajor, int aId, float aGpa) {
    this.name = aName;
    this.major = aMajor;
    this.idNumber = aId;
    this.gpa = aGpa;
  }

  /**
     Setter
     @return assigns aName to field name.
  */
  public void setName(String aName) {
    name = aName;
  }

  /**
     Setter
     @return assigns aAddress to field address.
  */
  public void setAddress(String aAddress) {
    address = aAddress;
  }

  /**
     Getter
     @return student name.
  */
  public String getName() {
    return name;
  }

  /**
     Getter
     @return student address
  */
  public String getAddress() {
    return address;
  }

  /**
     Getter
     @return student's gpa
  */
  public double getGPA() {
    return gpa;
  }

  public String toString() {
    return "Name: " + this.name + ", major: " + this.major + ", gpa:" + this.gpa;
  }

  @Override 
  public int compareTo(Student rhs) {
    String rhsName = ((Student) rhs).name;
    return name.compareTo(rhsName);
  }
  // compare by GPA

  /* public int compareTo(Student rhs) {
    double rhsGpa = rhs.gpa;
    if (gpa < rhsGpa)
      return -1;
    if (gpa == rhsGpa)
      return 0;
    return 1;
  } */

  private String name;
  private String major;
  private String address;
  private int idNumber;
  private float gpa;

}
