// *******
// **   **
// * * * *
// *  *  *
// * * * *
// **   **
// *******

import java.util.Scanner;

public class pattern_diagonal {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        int n = sc.nextInt(); // 'n' must be odd
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                // left diagonal, right diagonal, top horizontal, bottom horizontal, left
                // vertical, right vertical
                if (i == j || i + j == n - 1 || i == 0 || i == n - 1 || j == 0 || j == n - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
