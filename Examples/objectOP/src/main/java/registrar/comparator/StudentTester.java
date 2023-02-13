package registrar.comparator;

import java.util.TreeSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class StudentTester {
	
  private static class IDcomparator<T> implements Comparator<T> { 
  
      public int compare(T st1, T st2) {	  
      return Integer.compare(((Student) st1).getIdNumber(), ((Student) st2).getIdNumber());
	  }//end compare
	  
  }//end nested class 

  public static void main(String[] args) {
	  
	Student st1 = new Student("Doe, J", "Math", 1234, 3.6F);
	Student st2 = new Student("Carr, M", "CS", 1000, 2.7F);
  Student st3 = new Student("Ames, D", "Business", 2233, 3.7F);
	

    List<Student> list = new ArrayList<>();
    list.add(st1);
    list.add(st2);
	  list.add(st3);
    list.add(new Student("Ames, Ruth", "Business", 2233, 3.4F));
    
    for (Student s: list){
      System.out.println(s);
    }
    
    System.out.println("Natural Sort: ");
    //natural sort - by name 
    Collections.sort(list);
    for (Student s: list){
      System.out.println(s);
    }
    
    System.out.println("Nested class comparator: ");
    
    // sorting reviewer by ratings of products differs from respective average product ratings to most 
    Comparator<Student> comp = new IDcomparator();
    Collections.sort(list,comp);
    for (Student s: list){
      System.out.println(s);
    }
    
    System.out.println("Anonymous Nested Comparator: ");
    // sorting reviewer by ratings of products differs from respective average product ratings to most 
    Collections.sort(list, new Comparator<Student>() {
      public int compare(Student st1, Student st2) {
			return Double.compare(st1.getGPA(),st2.getGPA());
			}});
			
    for (Student s: list){
      System.out.println(s);
    }
    
    System.out.println("Nested Comparator for Tree Set Creation: ");
    //sort using nested class 
    TreeSet<Student> set = new TreeSet<>(comp);
    set.add(st1);
    set.add(st2);
    set.add(st3);
    set.add(new Student("Ames, Ruth", "Business", 2233, 3.4F));
    
    System.out.println("Native print:");
    System.out.println(set);
    System.out.println("Formatted print:");
    for (Student s: set){
      System.out.println(s);
    }
  }
	
}