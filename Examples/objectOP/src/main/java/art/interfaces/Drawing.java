package art.interfaces;

class Drawing implements Art {

  public Drawing(){
    System.out.println("Drawing constructor");
  }

  public void displayArt(String artPiece){
    System.out.println("Drawing of " + artPiece);
  }

}
