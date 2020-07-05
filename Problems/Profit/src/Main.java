import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        double m = scanner.nextDouble();
        double p = scanner.nextDouble() / 100;
        double k = scanner.nextDouble();

        int counter = 0;
        while (k > m) {
            m += m * p;
            counter++;
        }
        System.out.println(counter);
    }
}