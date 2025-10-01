import java.util.HashMap;

// subject choices
enum Subject {
    MATH,
    SCIENCE,
    HISTORY
}

// hobby choices
enum Hobby {
    READING,
    ART
}

// food choices 
enum Food {
    ICE_CREAM,
    PIZZA
}

// output career possibilities
enum Career {
    PROGRAMMER,
    AUTHOR,
    LAWYER,
    TEACHER,
    DANCER,
    SINGER,
    ARTIST,
    DOCTOR,
    CHEF,
    BANKER,
    POLITICIAN,
    ENTREPRENEUR
}

// helper class for mapping preferences to a career 
record Preferences(Subject subject, Hobby hobby, Food food) {
    public static HashMap<Preferences, Career> mapping = new HashMap<>();
    static {
        mapping.put(new Preferences(Subject.MATH, Hobby.READING, Food.ICE_CREAM), Career.PROGRAMMER);
        mapping.put(new Preferences(Subject.MATH, Hobby.READING, Food.PIZZA), Career.AUTHOR);
        mapping.put(new Preferences(Subject.MATH, Hobby.ART, Food.ICE_CREAM), Career.LAWYER);
        mapping.put(new Preferences(Subject.MATH, Hobby.ART, Food.PIZZA), Career.TEACHER);

        mapping.put(new Preferences(Subject.SCIENCE, Hobby.READING, Food.ICE_CREAM), Career.DOCTOR);
        mapping.put(new Preferences(Subject.SCIENCE, Hobby.READING, Food.PIZZA), Career.CHEF);
        mapping.put(new Preferences(Subject.SCIENCE, Hobby.ART, Food.ICE_CREAM), Career.SINGER);
        mapping.put(new Preferences(Subject.SCIENCE, Hobby.ART, Food.PIZZA), Career.DANCER);

        mapping.put(new Preferences(Subject.HISTORY, Hobby.READING, Food.ICE_CREAM), Career.POLITICIAN);
        mapping.put(new Preferences(Subject.HISTORY, Hobby.READING, Food.PIZZA), Career.BANKER);
        mapping.put(new Preferences(Subject.HISTORY, Hobby.ART, Food.ICE_CREAM), Career.ARTIST);
        mapping.put(new Preferences(Subject.HISTORY, Hobby.ART, Food.PIZZA), Career.ENTREPRENEUR);
    }
}

// main profile class 
public class Profile {
    // instance variables to store personal info and preferences
    private Hobby hobby;
    private Subject subject;
    private Food food;
    private String name;
    private int age;

    // initialization constructor
    public Profile(String name, int age, String subject, String hobby, String food) {
        updateProfile(name, age, subject, hobby, food);
    }

    private static <E extends Enum<E>> E parseEnum(Class<E> enumClass, String input) {
        return Enum.valueOf(enumClass, input.strip().toUpperCase().replace(" ", "_"));
    }

    public void updateProfile(String name, int age, String subject, String hobby, String food) {
        this.name = name;
        this.age = age;
        this.subject = parseEnum(Subject.class, subject);
        this.hobby = parseEnum(Hobby.class, hobby);
        this.food = parseEnum(Food.class, food);
    }

    private static String formatEnum(Enum<?> e) {
        return e.name().toLowerCase().replace("_", " ");
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Hobby: " + formatEnum(hobby));
        System.out.println("Food: " + formatEnum(food));
        System.out.println("Subject: " + formatEnum(subject));
        printCareer();
    }

    private void printCareer() {
        Career career = Preferences.mapping.get(new Preferences(subject, hobby, food));
        if (career != null) {
            System.out.println("Career: " + formatEnum(career));
        } else {
            System.out.println("Career: unknown");
        }
    }
}
