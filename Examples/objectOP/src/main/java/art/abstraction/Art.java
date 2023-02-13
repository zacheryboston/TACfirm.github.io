package art.abstraction;

public abstract class Art {
  Art() {
    System.out.println("Art constructor");
  }
  abstract void displayArt(String artPiece);
}
