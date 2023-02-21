package art.inheritance;

public class MakeArt {
    public static void main(String[] args) {
  
      String artPiece = "Frown";
      
      Cartoon cart = new Cartoon();
      cart.displayArt(artPiece);
  
      Drawing draw = new Drawing();
      draw.displayArt(artPiece);
  
      //upcasting
      Art art2 = new Drawing();
      art2.displayArt(artPiece);
  
      //downcasting
      Drawing myDraw = (Drawing) art2;
      myDraw.displayArt(artPiece);
  
      Drawing art3 = cart; //automatic upcasting to Art
      art3.displayArt(artPiece);
      
      Cartoon myCart = (Cartoon) art3; //manual downcasting back to Cartoon
      myCart.displayArt(artPiece);
  
    }
}
