import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();
        int input3 = scanner.nextInt();

        int desksNum = input1 / 2 + input1 % 2 + input2 / 2 + input2 % 2 + input3 / 2 + input3 % 2;

        System.out.println(desksNum);
    }
}