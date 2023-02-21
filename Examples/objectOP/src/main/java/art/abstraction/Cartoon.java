package art.abstraction;

public class Cartoon extends Drawing {

  public Cartoon() {
    System.out.println("Cartoon constructor");
  }

  @Override
  void displayArt(String artPiece){
    System.out.println("Cartoon of " + artPiece);
  }

  public static void main(String[] args) {
    Cartoon x = new Cartoon();
    System.err.println(x);
  }

}
