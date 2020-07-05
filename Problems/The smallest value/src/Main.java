import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        int i = 0;
        while (number>0) {
            number/=++i;
        }
        System.out.println(i);
    }
}