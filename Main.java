public class Main {



   /* private String name;*/

   /* public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Hello " + name);
    }*/

    public static void main(String[] args) {
        Human.Greeting();
        Student.Greeting();
        Teacher.Greeting();

        Human.howOldYou(25);
        Student.howOldYou(24);
        Teacher.howOldYou(32);



    }


}
