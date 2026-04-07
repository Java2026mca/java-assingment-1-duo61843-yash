import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine().trim());
        int[][] A = new int[n][n];
        int[][] B = new int[n][n];
        int[][] C = new int[n][n];

        // Read matrix A
        for (int i = 0; i < n; i++) {
            String[] parts = sc.nextLine().trim().split("\\s+");
            for (int j = 0; j < n; j++) {
                A[i][j] = Integer.parseInt(parts[j]);
            }
        }

        // Read matrix B
        for (int i = 0; i < n; i++) {
            String[] parts = sc.nextLine().trim().split("\\s+");
            for (int j = 0; j < n; j++) {
                B[i][j] = Integer.parseInt(parts[j]);
            }
        }

        // Multiply matrices: C = A × B
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int sum = 0;
                for (int k = 0; k < n; k++) {
                    sum += A[i][k] * B[k][j];
                }
                C[i][j] = sum;
            }
        }

        // Print result
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(C[i][j]);
                if (j < n - 1) System.out.print(" ");
            }
            if (i < n - 1) System.out.println();
        }
    }
}
