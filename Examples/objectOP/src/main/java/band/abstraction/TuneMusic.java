package band.abstraction;

public class TuneMusic {

  public static void tune(Instrument i) { //unchanged
    i.play("Middle C");
  }

  public static void tuneAll(Instrument[] e) {
    for (int i = 0; i < e.length; i++)
      tune(e[i]);
  }

  public static void main(String[] args) {

    Instrument[] orchestra = { new Wind(), new Percussion(), new Stringed(), new Brass(), new Woodwind() };

    tuneAll(orchestra);

  }

}
