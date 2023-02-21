package band.inheritance;

class Wind extends Instrument {

  public void play(String str){
    System.out.println("Wind.play() " + str);
  }

  public String what() {
    return "Wind";
  }

}
