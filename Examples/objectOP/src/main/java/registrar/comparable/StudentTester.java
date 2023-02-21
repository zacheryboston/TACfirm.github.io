package registrar.comparable;

import java.util.Arrays;

public class StudentTester {
  public static void main(String[] args) {

    Student[] st = new Student[3];
    st[0] = new Student("Doe, J", "Math", 1234, 3.6F);
    st[1] = new Student("Carr, M", "CS", 1000, 2.7F);
    st[2] = new Student("Ames, D", "Business", 2233, 3.7F);

    System.out.println("Before: ");
    for (int i = 0; i < st.length; i++)
      System.out.println(st[i]);

    Arrays.sort(st);
    System.out.println("After: ");

    for (int i = 0; i < st.length; i++)
      System.out.println(st[i]);

  }
}
