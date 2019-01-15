public class Student extends Human {

  // Не получается писать сверху метода @Override - выдает ошибку
  @Override
  public void greeting() {
    System.out.println("Hi! I am a student");
  }

}

