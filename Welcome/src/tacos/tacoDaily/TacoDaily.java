package tacos.tacoDaily;
/**
   A class for daily taco special
*/
public class TacoDaily{
  /**
     Constructs a Student object that saves the name of a person.
     @param aName the name of the person.
  */
   public TacoDaily(String aName){
      name = aName;
   }

   /**
      Setter
      @param aName Set the value of the name field 
   */
   public void setName(String aName){
       this.name = aName;
   }

   /**
      Getter
      @return value of the name field
   */
   public String getName(){
      return this.name;
   }

    private String name;
}
