package band.inheritance;

class Percussion extends Instrument {

  public void play(String str){
    System.out.println("Percussion.play() " + str);
  }

  public String what() { return "Percussion"; }

}
