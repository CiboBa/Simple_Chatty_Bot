import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();
        int input3 = scanner.nextInt();
        int input4 = scanner.nextInt();

        System.out.print(--input1 + " ");
        System.out.print(--input2 + " ");
        System.out.print(--input3 + " ");
        System.out.print(--input4);
    }
}