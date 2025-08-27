import java.util.Scanner;

public class DecimalToAnyBase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base (2-36) and number: ");
        int base = scanner.nextInt();
        int n = scanner.nextInt();
        scanner.close();

        if (base < 2 || base > 36) {
            System.out.println("Base must be between 2 and 36");
            return;
        }

        boolean isNegative = n < 0;
        long num = Math.abs((long)n);
        StringBuilder result = new StringBuilder();
        char[] digits = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

        if (num == 0) {
            result.append('0');
        } else {
            if ((base & (base - 1)) == 0) {
                int shift = (int)(Math.log(base) / Math.log(2));
                while (num > 0) {
                    int remainder = (int)(num & (base - 1));
                    result.append(digits[remainder]);
                    num >>= shift;
                }
            } else {
                while (num > 0) {
                    int remainder = (int)(num % base);
                    result.append(digits[remainder]);
                    num /= base;
                }
            }
        }

        if (isNegative) {
            result.append('-');
        }

        System.out.println("Result: " + result.reverse());
    }
}
