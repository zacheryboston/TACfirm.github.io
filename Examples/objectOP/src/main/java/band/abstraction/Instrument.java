package band.abstraction;

abstract class Instrument {

  abstract void play(String str); //sublass must define play
  //{   System.out.println("Instrument.play() " + str); }

  abstract String what(); //subclass must define

  void adjust(){}

}
