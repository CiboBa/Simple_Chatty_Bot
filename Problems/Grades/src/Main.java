import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int gradeNumber = scanner.nextInt();
        int gradeA = 0;
        int gradeB = 0;
        int gradeC = 0;
        int gradeD = 0;

        for (int i = 0; i < gradeNumber; i++) {
            int j = scanner.nextInt();
            if (j == 2) {
                gradeD++;
            } else if (j == 3) {
                gradeC++;
            } else if (j == 4) {
                gradeB++;
            } else gradeA++;
        }
        System.out.println(gradeD + " " + gradeC + " " + gradeB + " " + gradeA);
    }
}