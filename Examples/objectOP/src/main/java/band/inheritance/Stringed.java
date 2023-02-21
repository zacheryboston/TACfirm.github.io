package band.inheritance;

class Stringed extends Instrument {

  public void play(String str){
    System.out.println("Stringed.play() " + str);
  }

  public String what() { return "Stringed"; }

}
