package band.abstraction;

class Percussion extends Instrument {

  void play(String str) {
    System.out.println("Percussion.play() " + str);
  }

  String what() {
    return "Percussion";
  }

}
