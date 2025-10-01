public class Profile {
  private String name;
  private int age;

  public Profile() {
    name = "John";
    age = 15;
  }

  public Profile(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void printInfo() {
    System.out.println("name: " + name);
    System.out.println("age: " + age);
  }

  public void printInfo(int id) {
    System.out.println("id: " + id);
    printInfo();
  }
}
