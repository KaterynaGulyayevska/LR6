public class Human {
  String name = "Dima";
  int age = 25;

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void greeting() {
    System.out.println("Hi! I am a human");
  }

  public static void howOldYou(int age) {
    System.out.println(+age);
  }

}

/*
   public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    */

    /*public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }*/


