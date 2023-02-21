package band.abstraction;

class Brass extends Wind {

  void play(String str) {
    System.out.println("Brass.play() " + str);
  }

  String what() {
    return "Brass";
  }

}
