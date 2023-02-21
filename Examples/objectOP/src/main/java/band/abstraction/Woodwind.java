package band.abstraction;

class Woodwind extends Wind {

  void play(String str) {
    System.out.println("Woodwind.play() " + str);
  }
  
  String what() {
    return "Woodwind";
  }

}
