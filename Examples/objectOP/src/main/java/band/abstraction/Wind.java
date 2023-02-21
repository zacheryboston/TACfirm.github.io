package band.abstraction;

class Wind extends Instrument {

  void play(String str) {
    System.out.println("Wind.play() " + str);
  }

  String what() {
    return "Wind";
  }


}
