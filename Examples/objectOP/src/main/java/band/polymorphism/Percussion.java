package band.polymorphism;

class Percussion implements Instrument {

  public void play(String str){
    System.out.println("Percussion.play() " + str);
  }

  public String what() { 
    return "Percussion"; 
  }

}
