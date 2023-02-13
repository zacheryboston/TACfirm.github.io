package band.inheritance;

class Brass extends Wind{

  public void play(String str){
    System.out.println("Brass.play() " + str);
  }

  public String what() {
    return "Brass";
  }

}
