package helloworld;
public class StudentTester
{
   public static void main(String[] args)
   {
      Student a = new Student("John");
      System.out.println(a.getGPA());
      
      Student b;
      b = a;
      b.addGrade(3, 4.0);;
      System.out.println(a.getName() + " " + " " + a.getGPA());
      System.out.println(b.getName() + " " + " " + b.getGPA());

	   a.addGrade(3, 1.0);
      System.out.println(b.getName() + " " + " " + b.getGPA());
      System.out.println(a.getName() + " " + " " + a.getGPA());
      
      Student c = null;
      //System.out.println(c.getGPA());
   }
}
