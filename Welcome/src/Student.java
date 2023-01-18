/**
 * A class for gethering student information
 * @author Jelena Tesic
 * @version 2.0
 */
public class Student {

   /**
    * Default Constructor
    * 
    */
    public Student() {
      this.credits = 0;
      this.points = 0.0;
   }

   /**
    * Constructs a Student object that saves the name of a person.
    * 
    * @param aName the name of the person.
    */
   public Student(String aName) {
      this();
      this.name = aName;
   }

   public Student(String aName, int aCredits, double aPoints) {
      this.credits = aCredits;
      this.points = aPoints;
      this.name = aName;
   }


   /**
    * Updates the fields using new course credit and new course grade info
    * 
    * @param aName the name of the person.
    */
   public void addGrade(int courseCredits, double courseGrade) {

      // Add the number of credits for total number of credits
      this.credits += courseCredits;

      // Add the course grade to our running total
      this.points += courseGrade * (double) courseCredits;
    }

    /**
     * This returns the student's GPA as a double
     *
     * @return The calculated GPA
     */
    public double getGPA() {
      if (credits == 0.0) return 0.0;
      else return ((points / credits) * 100) / 100;
   }
  
   /**
    * Getter
    * 
    * @return class name.
    */
   public String getName() {
      return this.name;
   }

   /**
    * Getter
    * 
    * @return total course credits taken
    */
    public int getCredits() {
      return this.credits;
   }

   private double points;
   private int credits;
   private String name;

}
