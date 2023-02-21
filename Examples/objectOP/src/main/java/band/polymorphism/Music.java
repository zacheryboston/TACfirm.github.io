package band.polymorphism;

public class Music{

  public static void tune(Instrument i) {
    i.play("Middle C");
  }

  public static void main(String[] args) {

    Wind flute = new Wind();
    Stringed violin = new Stringed();
    Percussion snaredrum = new Percussion();
    tune(flute); // upcasting
    tune(violin);
    tune(snaredrum);
  }

}
