package band.inheritance;

public class Instrument {

  void play(String str){   
    System.out.println("Instrument.play() " + str); 
  }

  String what() {
    return "Instrument";
  }

  void adjust(){}

}
