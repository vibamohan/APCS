
public class Animal {
    private String animalType;
    private int age;

    public Animal() {
        animalType = "blank";
        age = 0;
    }

    public Animal(String animalType, int age) {
        this.animalType = animalType;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Animal type: " + animalType);
        System.out.println("Age: " + age);
    }
}
