package band.interfaces;

class Wind implements Instrument {

  public void play(String str) {
    System.out.println("Wind.play() " + str);
  }

  public String what() {
    return "Wind";
  }

  public void adjust() {
  }

}
