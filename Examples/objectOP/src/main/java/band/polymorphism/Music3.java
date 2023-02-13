package band.polymorphism;

public class Music3{

  public static void tune(Instrument i) {
    i.play("Middle C");
  }

  public static void tuneAll(Instrument[] e) {
    for(int i = 0; i < e.length; i++){
      tune(e[i]);
    }
  }

  public static void main(String[] args) {

    // Upcasting during addition to the array:
    Instrument[] orchestra = {
      new Wind(),
      new Percussion(),
      new Stringed(),
      new Brass(),
      new Woodwind()
    };

     tuneAll(orchestra);
  }

}
