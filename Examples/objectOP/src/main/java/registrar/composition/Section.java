package registrar.composition;

/**
   A class for specific Section
*/
public class Section {

  public Section(Course theCourse, String theSemester, String thePlace, String theDaysAndTimes) {
    course = theCourse;
    place = thePlace;
    daysAndTimes = theDaysAndTimes;
    semester = theSemester;
  }

  public String toString() {
    return "Section: " + semester + " " + course.getDescription() + " Location: " + place + " Days/Times: "
        + daysAndTimes;
  }

  public String getPlace() {
    return place;
  }

  public String getDaysAndTimes() {
    return daysAndTimes;
  }

  public String getSemester() {
    return semester;
  }

  public Course getCourse() {
    return course;
  }

  public void setPlace(String newPlace) {
    place = newPlace;
  }

  public void setDaysAndTimes(String newDaysAndTimes) {
    daysAndTimes = newDaysAndTimes;
  }

  private String semester;
  private String place;
  private String daysAndTimes;
  private Course course;
}
