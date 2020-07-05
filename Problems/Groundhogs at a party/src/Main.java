import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int numOfReeses = scanner.nextInt();
        boolean weekend = scanner.nextBoolean();

        System.out.println((numOfReeses >= 10 && numOfReeses <= 20 && !weekend) || (numOfReeses >= 15 && numOfReeses <= 25 && weekend));
    }
}