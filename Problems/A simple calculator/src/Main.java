import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        long firstNum = scanner.nextLong();
        String operator = scanner.next();
        long secondNum = scanner.nextLong();

        switch (operator) {
            case "+":
                System.out.println(firstNum + secondNum);
                break;
            case "-":
                System.out.println(firstNum - secondNum);
                break;
            case "*":
                System.out.println(firstNum * secondNum);
                break;
            case "/":
                if (secondNum == 0) {
                    System.out.println("Division by 0!");
                } else
                    System.out.println(firstNum / secondNum);
                break;
            default:
                System.out.println("Unknown operator");
        }
    }
}