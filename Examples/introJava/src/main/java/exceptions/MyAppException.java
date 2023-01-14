package exceptions;

class MyAppException extends Exception{
  public MyAppException() {
            super();
  }

  public MyAppException(String message) {
     super(message);
     this.message = message;
  }

  private String message;

 public MyAppException(Throwable cause){
   super(cause);
 }
 
}
