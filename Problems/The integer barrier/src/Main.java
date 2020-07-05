import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int num;
        int sum = 0;

        while (scanner.hasNextInt()) {
            num = scanner.nextInt();
            sum = sum + num;
            if (num == 0) {
                System.out.println(sum);
                break;
            } else if (sum >= 1000) {
                System.out.println(sum - 1000);
                break;
            }
        }


    }
}