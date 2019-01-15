public class Human extends Main {

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


   /*
   public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    */

    public static void main(String[] args) {
        Greeting();
        howOldYou(25);
        System.out.println("Exit");

    }

    public static void Greeting() {
        System.out.println("Hi! I am a human");
    }


    public static void howOldYou(int age) {
        System.out.println(+age);
    }

    /*public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }*/
}



