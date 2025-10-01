public class Student {
  private String name;

  public Student() {
    name = "none";
  }

  public Student(String name) {
    this.name = name;
  }

  public void printName() {
    System.out.println("Name: " + name);
  }

  public void printName(int age) {
    printName();
    System.out.println("Age: " + age);
  }
}
