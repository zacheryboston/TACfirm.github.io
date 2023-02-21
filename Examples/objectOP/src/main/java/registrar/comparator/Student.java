package registrar.comparator;

/**
   A class for gethering student information
*/
public class Student implements Comparable<Object> {
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
  public int getIdNumber() {
    return this.idNumber;
  }

  /**
     Getter
     @return student's gpa
  */
  public double getGPA() {
    return gpa;
  }

  public String toString() {
    return "Name: " + this.name + ", major: " + this.major + ", gpa:" + this.gpa + ", ID:" + this.idNumber;
  }

 public int compareTo(Object rhs) {
    String rhsName = ((Student) rhs).name;
    return name.compareTo(rhsName);
  } 

  private String name;
  private String major;
  private String address;
  private int idNumber;
  private float gpa;

}
