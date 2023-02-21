package registrar.composition;

public class SectionTester {
  public static void main(String[] args) {

    Course cs3354 = new Course("CS 3354", "Object Oriented Programming and Design");
    //Section cs3354Sec1 = cs3354.createSection("Fall 2020", "DERR 0329", "Tue Thu 14:00 - 15:20");
    Section cs3354Sec1= new Section(cs3354,"Spring 2023","Derr 240", "T Th 2:00 PM");
    Section cs3354Sec2 = cs3354.createSection("Fall 2020", "DERR 0235", "Tue Thu 12:30 - 13:50");

    System.out.println(cs3354Sec1.toString());
    System.out.println(cs3354Sec2.toString());
    cs3354.setDescription("OOPD");
    System.out.println(cs3354Sec1.toString());
    System.out.println(cs3354Sec2.toString());

  }
}