

public class Middle {
    public static void main(String[] args) {
        int numOne = 5;
        int numTwo = 10;
        System.out.println("numOne=" + numOne);
        System.out.println("numTwo=" + numTwo);
        
        int middle1 = (numOne + numTwo)/2;
        System.out.println("middle1=" + middle1);
        
        double middle2 = (numOne + numTwo) / 2.0;
        System.out.println("middle2=: " + middle2);

        double deci1 = 5.2;
        double deci2 = 9.8;
        double deci3 = 14.3;
        double avg = (deci1 + deci2 + deci3) / 3.0;
        System.out.println("average: " + avg);
    }
}
