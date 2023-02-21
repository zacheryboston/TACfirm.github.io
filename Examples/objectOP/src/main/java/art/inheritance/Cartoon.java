package art.inheritance;

public class Cartoon extends Drawing {

  public Cartoon() {
    System.out.println("Cartoon constructor");
  }

  public static void main(String[] args) {
    Cartoon x = new Cartoon();
    x.displayArt("a dog.");
  }

  @Override
  void displayArt(String artPiece){
    System.out.println("Cartoon of " + artPiece);
  }

}
