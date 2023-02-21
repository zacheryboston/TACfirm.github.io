package band.interfaces;

public class TestMusic {

  public static void tune(Instrument i) {
    i.play("Middle C");
  }

  public static void main(String[] args) {

    Wind flute = new Wind();
    Stringed violin = new Stringed();
    Percussion snaredrum = new Percussion();
    //Instrument flute = new Instrument();
    tune(flute); // upcasting
    tune(violin);
    tune(snaredrum);
  }

}
