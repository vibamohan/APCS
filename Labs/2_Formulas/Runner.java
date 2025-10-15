import java.time.Duration;

public class Runner {
    public static Formulas formulas = new Formulas();
    public static void main(String[] args) throws InterruptedException{
        int c = -1;
        while (c != 0) {

                Runnable callback = switch(formulas.displayMenu()) {
                    case 0 -> () -> {
                        System.out.println("Thank you for using the formula calculator!");
                        formulas.closeScanner();
                        System.exit(0);
                    };
                    case 1 -> formulas::areaTriangle;
                    case 2 -> formulas::lawOfSines;
                    case 3 -> formulas::halfAngle;
                    case 4 -> formulas::volumeSphere;
                    case 5 -> formulas::areaCircle;
                    case 6 -> formulas::circCircle;
                    case 7 -> formulas::distance;
                    case 8 -> formulas::kinematic;
                    case 9 -> formulas::gasLaw;
                    case 10 -> formulas::arithmeticSum;
                    case 11 -> formulas::geometricSum;
                    case 12 -> formulas::lawOfCosines;
                    case 13 -> formulas::avgROC;
                    case 14 -> formulas::binomialExpansion;
                    case 15 -> formulas::diffQuotient;
                    default -> () -> System.out.println("Invalid choice");
                };
                callback.run();
                Thread.sleep(Duration.ofSeconds(3));
        }
    }
}
