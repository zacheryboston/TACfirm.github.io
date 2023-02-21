package band.polymorphism;

class Woodwind extends Wind{

  public void play(String str){
    System.out.println("Woodwind.play() " + str);
  }

  public String what() {
    return "Woodwind";
  }

}
