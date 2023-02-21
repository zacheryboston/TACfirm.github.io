package band.abstraction;

class Stringed extends Instrument {

  void play(String str) {
    System.out.println("Stringed.play() " + str);
  }

  String what() {
    return "Stringed";
  }


}
