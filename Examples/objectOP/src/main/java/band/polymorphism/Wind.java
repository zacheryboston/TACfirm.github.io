package band.polymorphism;

class Wind implements Instrument {

  public void play(String str){
    System.out.println("Wind.play() " + str);
  }

  public String what() {
    return "Wind";
  }

}
