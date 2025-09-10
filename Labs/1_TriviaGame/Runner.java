import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.*;

class Parsers {
  private static final Map<Class<?>, Function<String, ?>> PARSERS = Map.of(
      Integer.class, Integer::parseInt,
      Double.class, Double::parseDouble,
      Boolean.class, Boolean::parseBoolean,
      String.class, s -> s.strip().toLowerCase());

  @SuppressWarnings("unchecked")
  public static <T> Function<String, T> getParser(Class<T> c) {
    Function<String, ?> parser = PARSERS.get(c);
    if (parser == null) {
      throw new IllegalArgumentException("a parser isn't defined for this type: " + c.getName());
    }
    return (Function<String, T>) parser;
  }

  public static <T> Predicate<T> getOneWordFn(Class<T> c) {
    if (c.isAssignableFrom(String.class)) {
      Predicate<T> p = t -> ((String) t).strip().split(" ").length == 1;
      return p;
    } else {
      return t -> true;
    }
  }
}

class Question<QT, AT> {
  private final QT question;
  private final AT answer;
  private final boolean oneWord;
  private final Function<String, AT> parser;

  public Question(QT question, AT answer, Class<AT> at) {
    this.question = question;
    this.answer = answer;
    this.parser = Parsers.getParser(at);
    this.oneWord = Parsers.getOneWordFn(at).test(answer);
  }

  public boolean ask(Scanner sc) {
    System.out.print(question.toString() + ": ");
    AT userAns = parser.apply(oneWord ? sc.next() : sc.nextLine());
    try {
      if (answer.equals(userAns)) {
        System.out.println("correct!");
        return true;
      } else {
        System.out.println("wrong, the answer was: " + answer);
        return false;
      }
    } catch (Exception e) {
      System.out.println("something went wrong, sorry!");
      return false;
    }
  }

  public boolean getOneWord() {
    return oneWord;
  }

  @Override
  public String toString() {
    return question.toString();
  }
}

public class Runner {
  // easy math question factory
  static Question<String, ? extends Number> makeEasyMathQuestion() {
    int qtype = (int) (Math.random() * 4);
    if (qtype == 0) {
      int cubeSide = (int) (Math.random() * 20) + 1;
      int cubeVolume = (int) Math.pow(cubeSide, 3);
      String qString = "What is the volume of a cube with side length " + cubeSide;
      return new Question<>(qString, cubeVolume, Integer.class);
    } else if (qtype == 1) {
      int triHeight = (int) (Math.random() * 20) + 1;
      int triBase = (int) (Math.random() * 20) + 1;
      double triArea = Math.round((triHeight * triBase * 0.5) * 100.0) / 100.0;
      String qString = "What is the area of a triangle with height " + triHeight + " and base " + triBase;
      return new Question<>(qString, triArea, Double.class);
    } else if (qtype == 2) {
      int m = (int) (Math.random() * 10) + 1;
      int x = (int) (Math.random() * 10);
      int b = (int) (Math.random() * 10);
      int c = m * x + b;
      String qString = "Solve for x: " + c + " = " + m + "x + " + b;
      return new Question<>(qString, x, Integer.class);
    } else {
      int l1 = (int) (Math.random() * 15) + 1;
      int l2 = (int) (Math.random() * 15) + 1;
      double hyp = Math.sqrt(l2 * l2 + l1 * l1);
      hyp = Math.round(hyp * 100) / 100.0;
      String qString = "What is the hypotenuse of a right triangle with legs " + l2 + " and " + l1;
      return new Question<>(qString, hyp, Double.class);
    }
  }

  // hard math question factory
  static Question<String, ?> makeHardMathQuestion() {
    int qtype = (int) (Math.random() * 4);

    if (qtype == 0) {
      // quadratic root
      int a = (int) (Math.random() * 5) + 1;
      int b = (int) (Math.random() * 10) - 5;
      int c = (int) (Math.random() * 10) - 5;
      double disc = b * b - 4 * a * c;
      if (disc < 0)
        disc = 0;
      double root = (-b + Math.sqrt(disc)) / (2.0 * a);
      root = Math.round(root * 100.0) / 100.0;
      String qString = "Find one root of " + a + "x² + " + b + "x + " + c
          + " = 0 (rounded to 2 decimals, use 0 for discriminant if it does not exist): ";
      return new Question<>(qString, root, Double.class);

    } else if (qtype == 1) {
      int x1 = (int) (Math.random() * 20) - 10;
      int y1 = (int) (Math.random() * 20) - 10;
      int x2 = (int) (Math.random() * 20) - 10;
      int y2 = (int) (Math.random() * 20) - 10;
      double dist = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
      dist = Math.round(dist * 100.0) / 100.0;
      String qString = "What is the distance between (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ")? (2 decimals)";
      return new Question<>(qString, dist, Double.class);

    } else if (qtype == 2) {
      int x1 = (int) (Math.random() * 20);
      int y1 = (int) (Math.random() * 20);
      int x2 = (int) (Math.random() * 20);
      int y2 = (int) (Math.random() * 20);
      String midpoint = "(" + ((x1 + x2) / 2.0) + ", " + ((y1 + y2) / 2.0) + ")";
      String qString = "What is the midpoint between (" + x1 + "," + y1 + ") and (" + x2 + "," + y2
          + ")? (format: (x,y))";
      return new Question<>(qString, midpoint, String.class);

    } else {
      int x1 = (int) (Math.random() * 20) - 10;
      int y1 = (int) (Math.random() * 20) - 10;
      int x2 = (int) (Math.random() * 20) - 10;
      int y2 = (int) (Math.random() * 20) - 10;
      while (x2 == x1)
        x2++;
      double slope = (y2 - y1) * 1.0 / (x2 - x1);
      slope = Math.round(slope * 100.0) / 100.0;
      String qString = "What is the slope of the line through (" + x1 + "," + y1 + ") and (" + x2 + "," + y2
          + ")? (2 decimals)";
      return new Question<>(qString, slope, Double.class);
    }
  }

  public static List<List<Question<String, ?>>> geographyQuestions() {
    List<Question<String, ?>> qsl1 = new ArrayList<>();

    // ----- Easy -----
    qsl1.add(
        new Question<>("Which continent is the largest by land area? (A) Africa (B) Asia (C) North America (D) Europe",
            "b", String.class));
    qsl1.add(new Question<>("What is the capital city of Australia? (A) Sydney (B) Melbourne (C) Canberra (D) Perth",
        "c", String.class));
    qsl1.add(new Question<>(
        "The Great Barrier Reef is located off the coast of which country? (A) South Africa (B) Australia (C) Philippines (D) Thailand",
        "b", String.class));
    qsl1.add(
        new Question<>("Which U.S. city is known as 'The Windy City'? (A) New York (B) Boston (C) Chicago (D) Miami",
            "c", String.class));
    qsl1.add(new Question<>(
        "Which African country is nicknamed 'The Pearl of Africa'? (A) Uganda (B) Kenya (C) Tanzania (D) Ghana", "a",
        String.class));
    qsl1.add(new Question<>(
        "Which European city is famous for its canals and gondolas? (A) Venice (B) Amsterdam (C) Geneva (D) Bruges",
        "a", String.class));

    List<Question<String, ?>> qsl2 = new ArrayList<>();
    // ----- Hard -----
    qsl2.add(new Question<>(
        "Which country is home to the highest waterfall in the world, Angel Falls? (A) Brazil (B) Venezuela (C) Colombia (D) Peru",
        "b", String.class));
    qsl2.add(new Question<>(
        "The ancient city of Petra is located in which modern-day country? (A) Egypt (B) Jordan (C) Turkey (D) Israel",
        "b", String.class));
    qsl2.add(new Question<>(
        "Which desert is the coldest in the world? (A) Kalahari (B) Gobi (C) Sahara (D) Antarctica Desert", "d",
        String.class));

    return List.of(qsl1, qsl2);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<List<Question<String, ?>>> mathQList = List.of(
        // level 1
        List.of(
            makeEasyMathQuestion(),
            makeEasyMathQuestion(),
            makeEasyMathQuestion(),
            makeEasyMathQuestion(),
            makeEasyMathQuestion(),
            makeEasyMathQuestion(),
            makeEasyMathQuestion(),
            makeEasyMathQuestion(),
            makeEasyMathQuestion()),
        // level 2
        List.of(
            makeHardMathQuestion(),
            makeHardMathQuestion(),
            makeHardMathQuestion()));

    List<List<Question<String, ?>>> geoQList = geographyQuestions();

    System.out.println("Enter 1 for Math, and 2 for Geography Questions");
    System.out.println("This test will adapt to your abilities");
    int choice = scanner.nextInt();
    List<List<Question<String, ?>>> chosenQs;
    if (choice == 1) {
      chosenQs = mathQList;
    } else {
      chosenQs = geoQList;
    }

    int score = 0;
    boolean previousWasOneWord = true;
    // quiz easy questions
    for (int i = 0; i < 3; i++) {
      if (!previousWasOneWord)
        scanner.nextLine();
      if (chosenQs.get(0).get(i).ask(scanner)) {
        score++;
      }
      previousWasOneWord = chosenQs.get(0).get(i).getOneWord();
    }

    if (score == 3) {
      for (int i = 0; i < 3; i++) {
        if (!previousWasOneWord)
          scanner.nextLine();

        if (chosenQs.get(1).get(i).ask(scanner)) {
          score++;
        }

        previousWasOneWord = chosenQs.get(1).get(i).getOneWord();
      }
    } else {
      for (int i = 3; i < 6; i++) {
        if (!previousWasOneWord)
          scanner.nextLine();
        if (chosenQs.get(0).get(i).ask(scanner)) {
          score++;
        }

        previousWasOneWord = chosenQs.get(0).get(i).getOneWord();
      }
    }

    scanner.close();
    switch (score) {
      case 0:
      case 1:
      case 2:
        System.out.println("Sorry, you got an F");
        break;
      case 3:
        System.out.println("Sorry, you got a D");
        break;
      case 4:
        System.out.println("You got a C");
        break;
      case 5:
        System.out.println("You got a B! :)");
        break;
      case 6:
        System.out.println("You got an A! Nice job!");
        break;
      default:
        break;
    }
    System.out.println("Thanks for playing!");
  }
}
