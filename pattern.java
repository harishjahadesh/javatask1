package guvitask;
import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the pattern: ");
        int n = scanner.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = n; j >= 1; j--) {
                if (j > i) {
                    System.out.print(j);
                } else {
                    System.out.print(i);
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
