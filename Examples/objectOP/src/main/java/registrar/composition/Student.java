package registrar.composition;

/**
   A class for gethering student information
*/
public class Student {
  /**
     Constructs a Student object that saves the name of a person.
     @param aName the name of the person.
  */
  public Student(String aName) {
    name = aName;
  }

  /**
     Constructs a Student object that saves the name of a person.
     @param aName the name of the person
     @param aAddress the address of the person
  */
  public Student(String aName, String aAddress) {
    name = aName;
    address = aAddress;
  }

  public void computeGPA(Course aCourse, char newGrade) {
    // use the grade and course to update gpa field
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
    return "Name: " + this.name + " Address: " + this.address;
  }

  private String name;
  private String address;
  private double gpa;
}
