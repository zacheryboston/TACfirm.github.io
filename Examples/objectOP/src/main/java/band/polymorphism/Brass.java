package band.polymorphism;

class Brass extends Wind{

  @Override
  public void play(String str){
    System.out.println("Brass.play() " + str);
  }

  @Override
  public String what() {
    return "Brass";
  }

}
