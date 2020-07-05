import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        while (scanner.nextInt() > 0) {
            number++;
        }


        System.out.println(number);
    }
}