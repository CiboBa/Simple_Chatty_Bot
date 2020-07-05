import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
//        String yes = "YES";
//        String no = "NO";

        String isTriangle = a + b > c && a + c > b && b + c > a ? "YES" : "NO";
        System.out.println(isTriangle);
    }
}