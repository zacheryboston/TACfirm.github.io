package exceptions;

public class MyAppExceptionTest{

   public static void main(String[] a) {
     try{
       MyAppExceptionTest.myTest(null);
     }
     catch(MyAppException mae){
       System.out.println("Inside catch block:"+mae.getMessage());
      }
    }

   static void myTest(String str) throws MyAppException {
      if(str == null){
         throw new MyAppException("String val is null");
      }
  }
}
