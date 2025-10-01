public class Profile {
  String name;
  int age;

  public Profile() {
    this("none", 0);
  }

  public Profile(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void print() {
    System.out.println(toString());
  }

  @Override
  public String toString() {
    return "Name: " + name + "\n Age: " + age;
  }
}
