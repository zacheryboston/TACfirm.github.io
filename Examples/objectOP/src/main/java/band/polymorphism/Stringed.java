package band.polymorphism;

class Stringed implements Instrument {

  public void play(String str){
    System.out.println("Stringed.play() " + str);
  }

  public String what() { return "Stringed"; }

}
