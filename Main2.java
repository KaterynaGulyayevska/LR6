public class Main2 {

    public static void whoAmI(Human human){
        Human.Greeting();
    }

    public static void howOldIam(Human human){
        Human.howOldYou(25);
    }

    public static void main(String[] args) {

        Human someHuman = new Student();
        whoAmI(someHuman);
        howOldIam(someHuman);


        someHuman = new Teacher();
        whoAmI(someHuman);
        howOldIam(someHuman);

    }

}
