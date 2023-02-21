package game;

public class PlayGame {

  public static void main(String[] args) {

    //upcasting
    Game game = new Chess();
    //manual downcasting back to Board Game
    BoardGame board = (BoardGame) game;
    //manual downcasting back to Cartoon
    Chess chess = (Chess) board;
    System.out.println(chess);
  }

}
