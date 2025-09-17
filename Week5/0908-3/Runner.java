
public class Runner {
    public static void main(String[] args) {
        Toy toy = new Toy();
        toy.type();
        toy.maker();
        toy.price();

        Student student = new Student();
        student.speak();
        student.speakID();

        Dog dog = new Dog();
        dog.speak();
        dog.sayName();        

    }
}