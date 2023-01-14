/**
   A user with additional menu options.
*/
public class Instructor extends User
{
   /**
      Constructs an instructor.
      @param aName the instructor's name
      @param aPassword the instructor password
   */
   public Instructor(String aName, String aPassword)
   {
      super(aName, aPassword);
   }

   public String getMenu() 
   {
      return super.getMenu() + "P)urge message\nA)dd user\n";
   }
}
