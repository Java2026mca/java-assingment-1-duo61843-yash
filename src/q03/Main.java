import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        int num = 1;
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;

        while (num <= n * n) {
            
            for (int i = left; i <= right && num <= n * n; i++) mat[top][i] = num++;
            top++;
        
            for (int i = top; i <= bottom && num <= n * n; i++) mat[i][right] = num++;
            right--;
           
            for (int i = right; i >= left && num <= n * n; i--) mat[bottom][i] = num++;
            bottom--;
           
            for (int i = bottom; i >= top && num <= n * n; i--) mat[i][left] = num++;
            left++;
        }

      
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j]);
                if (j != n - 1) System.out.print(" ");
            }
            System.out.println();
        }

        
        int diagSum = 0;
        for (int i = 0; i < n; i++) diagSum += mat[i][i];
        System.out.println("Diagonal: " + diagSum);

        sc.close();
    }
}
