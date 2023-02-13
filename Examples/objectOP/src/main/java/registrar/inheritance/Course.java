package registrar.inheritance;

/**
   A class for generic catalog course information
*/

public class Course {

  public Course(String courseId, String courseName) {
    id = courseId;
    name = courseName;
  }

  public Section createSection(String semester, String place, String time) {
    return new Section(this, semester, place, time);
  }

  public void setNumberOfCredits(int credits) {
    numberOfCredits = credits;
  }

  public void setDescription(String courseDescription) {
    description = courseDescription;
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public int getNumberOfCredits() {
    return numberOfCredits;
  }

  public String getDescription() {
    return description;
  }

  private String id;
  private String name;
  private int numberOfCredits;
  private String description;
}
