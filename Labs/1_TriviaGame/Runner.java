import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.*;

// Custom parser class that holds info on how to handle different data types
class Parsers {
  // Map of parsers for a few different data types that I have questions for
  private static final Map<Class<?>, Function<String, ?>> PARSERS = Map.of(
      Integer.class, Integer::parseInt,
      Double.class, Double::parseDouble,
      Boolean.class, Boolean::parseBoolean,
      String.class, s -> s.strip().toLowerCase());

  @SuppressWarnings("unchecked")
  /**
   * Get a parser function for a class type
   * @param <T> the type to get a parser for
   * @param c the class type to get a parser for
   * @return
   */
  public static <T> Function<String, T> getParser(Class<T> c) {
    Function<String, ?> parser = PARSERS.get(c);
    if (parser == null) {
      throw new IllegalArgumentException("a parser isn't defined for this type: " + c.getName());
    }
    return (Function<String, T>) parser;
  }

  /**
   * Get a predicate that checks if an object can be read by next() instead of nextLine()
   * @param <T> type to get predicate for
   * @param c class type to get predicate for
   * @return
   */
  public static <T> Predicate<T> getOneWordFn(Class<T> c) {
    if (c.isAssignableFrom(String.class)) {
      Predicate<T> p = t -> ((String) t).strip().split(" ").length == 1;
      return p;
    } else {
      return t -> true;
    }
  }
}

// Generic question class that can hold any type of question answer
class Question<QT, AT> {
  // Instance variables for question, answer, and the parser to be used for the user answer
  private final QT question;
  private final AT answer;
  private final boolean oneWord;
  private final Function<String, AT> parser;

  /**
   * Constructs a question object
   * @param question the question to be asked
   * @param answer the answer to the question
   * @param at the class type of the answer
   */
  public Question(QT question, AT answer, Class<AT> at) {
    this.question = question;
    this.answer = answer;
    this.parser = Parsers.getParser(at);
    this.oneWord = Parsers.getOneWordFn(at).test(answer);
  }

  /**
   * Asks the question and checks the answer
   * @param sc scanner to read input from
   * @return whether the user got the question right
   */
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

  /**
   * Getter for whether the answer is one word (next() vs nextLine())
   * @return whether the answer is one word or not
   */
  public boolean getOneWord() {
    return oneWord;
  }

  /**
   * Simple to string override
   */
  @Override
  public String toString() {
    return question.toString();
  }
}

// Main runner class
public class Runner {
  // easy math question factory
  static Question<String, ? extends Number> makeEasyMathQuestion() {
    // randomly choose one of 4 types of questions to generate/construct
    int qtype = (int) (Math.random() * 4);
    if (qtype == 0) {
      // volume of cube
      // Uses random integers to generate random cube side lengths and answers
      int cubeSide = (int) (Math.random() * 20) + 1;
      int cubeVolume = (int) Math.pow(cubeSide, 3);
      String qString = "What is the volume of a cube with side length " + cubeSide;
      return new Question<>(qString, cubeVolume, Integer.class);
    } else if (qtype == 1) {
      // area of triangle
      int triHeight = (int) (Math.random() * 20) + 1;
      int triBase = (int) (Math.random() * 20) + 1;
      double triArea = Math.round((triHeight * triBase * 0.5) * 100.0) / 100.0;
      String qString = "What is the area of a triangle with height " + triHeight + " and base " + triBase;
      return new Question<>(qString, triArea, Double.class);
    } else if (qtype == 2) {
      // solve for x in mx + b = c
      int m = (int) (Math.random() * 10) + 1;
      int x = (int) (Math.random() * 10);
      int b = (int) (Math.random() * 10);
      int c = m * x + b;
      String qString = "Solve for x: " + c + " = " + m + "x + " + b;
      return new Question<>(qString, x, Integer.class);
    } else {
      // pythagorean theorem
      int l1 = (int) (Math.random() * 15) + 1;
      int l2 = (int) (Math.random() * 15) + 1;
      double hyp = Math.sqrt(l2 * l2 + l1 * l1);
      hyp = Math.round(hyp * 100) / 100.0;
      String qString = "What is the hypotenuse of a right triangle with legs " + l2 + " and " + l1;
      return new Question<>(qString, hyp, Double.class);
    }
  }

  // hard math question factory
  // same as the easy factory but with harder question types
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
      // distance formula
      int x1 = (int) (Math.random() * 20) - 10;
      int y1 = (int) (Math.random() * 20) - 10;
      int x2 = (int) (Math.random() * 20) - 10;
      int y2 = (int) (Math.random() * 20) - 10;
      double dist = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
      dist = Math.round(dist * 100.0) / 100.0;
      String qString = "What is the distance between (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ")? (2 decimals)";
      return new Question<>(qString, dist, Double.class);

    } else if (qtype == 2) {
      // midpoint formula
      int x1 = (int) (Math.random() * 20);
      int y1 = (int) (Math.random() * 20);
      int x2 = (int) (Math.random() * 20);
      int y2 = (int) (Math.random() * 20);
      String midpoint = "(" + ((x1 + x2) / 2.0) + ", " + ((y1 + y2) / 2.0) + ")";
      String qString = "What is the midpoint between (" + x1 + "," + y1 + ") and (" + x2 + "," + y2
          + ")? (format: (x,y))";
      return new Question<>(qString, midpoint, String.class);

    } else {
      // slope formula
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

  // hardcoded geography questions (factory not really needed here but present just to clean the code up)
  /**
   * Factory for geography questions
   * @return a 2d list of geography questions (easy and hard)
   */
  public static List<List<Question<String, ?>>> geographyQuestions() {
    List<Question<String, ?>> qsl1 = new ArrayList<>();

    // easy questions
    qsl1.add(
        new Question<String, String>("Which continent is the largest by land area? (A) Africa (B) Asia (C) North America (D) Europe",
            "b", String.class));
    qsl1.add(new Question<String, String>("What is the capital city of Australia? (A) Sydney (B) Melbourne (C) Canberra (D) Perth",
        "c", String.class));
    qsl1.add(new Question<String, String>(
        "The Great Barrier Reef is located off the coast of which country? (A) South Africa (B) Australia (C) Philippines (D) Thailand",
        "b", String.class));
    qsl1.add(
        new Question<String, String>("Which U.S. city is known as 'The Windy City'? (A) New York (B) Boston (C) Chicago (D) Miami",
            "c", String.class));
    qsl1.add(new Question<String, String>(
        "Which African country is nicknamed 'The Pearl of Africa'? (A) Uganda (B) Kenya (C) Tanzania (D) Ghana", "a",
        String.class));
    qsl1.add(new Question<String, String>(
        "Which European city is famous for its canals and gondolas? (A) Venice (B) Amsterdam (C) Geneva (D) Bruges",
        "a", String.class));

    List<Question<String, ?>> qsl2 = new ArrayList<>();
    // hard questions
    qsl2.add(new Question<String, String>(
        "Which country is home to the highest waterfall in the world, Angel Falls? (A) Brazil (B) Venezuela (C) Colombia (D) Peru",
        "b", String.class));
    qsl2.add(new Question<String, String>(
        "The ancient city of Petra is located in which modern-day country? (A) Egypt (B) Jordan (C) Turkey (D) Israel",
        "b", String.class));
    qsl2.add(new Question<String, String>(
        "Which desert is the coldest in the world? (A) Kalahari (B) Gobi (C) Sahara (D) Antarctica Desert", "d",
        String.class));

    return List.of(qsl1, qsl2);
  }

  public static void main(String[] args) {
    // Makes a scanner for the standard input stream 
    Scanner scanner = new Scanner(System.in);
    // constructs a 2d list of math questions by level (easy and hard)
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

    // constructs a 2d list of geography questions by level 
    List<List<Question<String, ?>>> geoQList = geographyQuestions();

    System.out.println("Enter 1 for Math, and 2 for Geography Questions");
    System.out.println("This test will adapt to your abilities");
    // based on user input decides which subject of questions to ask
    int choice = scanner.nextInt();
    List<List<Question<String, ?>>> chosenQs;
    if (choice == 1) {
      chosenQs = mathQList;
    } else {
      chosenQs = geoQList;
    }

    // score variable
    int score = 0;
    boolean previousWasOneWord = true;
    // quiz easy questions (first 3 easy questions)
    for (int i = 0; i < 3; i++) {
      // handle nextline issue
      if (previousWasOneWord && !chosenQs.get(0).get(i).getOneWord() && i != 0)
        scanner.nextLine();
      if (chosenQs.get(0).get(i).ask(scanner)) {
        score++;
      }
      previousWasOneWord = chosenQs.get(0).get(i).getOneWord();
    }

    if (score == 3) {
      // if user got all 3 easy questions right, ask hard questions)
      for (int i = 0; i < 3; i++) {
        if (previousWasOneWord && !chosenQs.get(1).get(i).getOneWord())
          scanner.nextLine();

        if (chosenQs.get(1).get(i).ask(scanner)) {
          score++;
        }

        previousWasOneWord = chosenQs.get(1).get(i).getOneWord();
      }
    } else {
      // if the user got below 3 for easy questions, continue asking easy questiosn
      for (int i = 3; i < 6; i++) {
        if (previousWasOneWord && !chosenQs.get(0).get(i).getOneWord())
          scanner.nextLine();
        if (chosenQs.get(0).get(i).ask(scanner)) {
          score++;
        }

        previousWasOneWord = chosenQs.get(0).get(i).getOneWord();
      }
    }

    // close the scanner for safety
    scanner.close();

    // prints the user's letter grade based on their score
    switch (score) {
      case 0:
      case 1:
      case 2:
        // cases 0-2 fallthrough to be an F
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
      default: // should never happen, but exhaustive switch
        break;
    }
    System.out.println("Thanks for playing!");
  }
}
