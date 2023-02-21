package art.interfaces;

public class Cartoon extends Drawing{

  public Cartoon() {
    System.out.println("Cartoon constructor");
  }

  public void displayArt(String artPiece){
    System.out.println("Cartoon of " + artPiece);
  }

  public static void main(String[] args) {
    Cartoon x = new Cartoon();
    System.out.println(x);
  }

}
