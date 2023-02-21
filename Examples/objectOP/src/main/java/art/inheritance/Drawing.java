package art.inheritance;

class Drawing extends Art {
  Drawing(){
    System.out.println("Drawing constructor");
  }

  @Override 
  void displayArt(String artPiece){
    System.out.println("Drawing of " + artPiece);
  }

}
