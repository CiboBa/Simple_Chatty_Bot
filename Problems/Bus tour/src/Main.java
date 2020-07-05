import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        int heightBus = scanner.nextInt();
        int numBridges = scanner.nextInt();
        int heightBridge;

        for (int i = 1; i <= numBridges; i++) {
            heightBridge = scanner.nextInt();
            if (heightBus >= heightBridge) {
                System.out.println("Will crash on bridge " + i);
                return;
            } else if (i == numBridges)
                System.out.println("Will not crash");
        }
    }
}