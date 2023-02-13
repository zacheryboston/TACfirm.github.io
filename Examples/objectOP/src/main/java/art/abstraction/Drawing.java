package art.abstraction;

class Drawing extends Art {
  Drawing(){
    System.out.println("Drawing constructor");
  }

  void displayArt(String artPiece){
    System.out.println("Drawing of " + artPiece);
  }
}
