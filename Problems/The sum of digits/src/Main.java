import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        String a = scanner.next();
        int b = Integer.parseInt(a.substring(0, 1));
        int c = Integer.parseInt(a.substring(1, 2));
        int d = Integer.parseInt(a.substring(2, 3));

        System.out.println(b + c + d);
    }
}