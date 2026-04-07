import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();
        while (sc.hasNextInt()) nums.add(sc.nextInt());
        int idx = 0;

        int n1 = nums.get(idx++), m1 = nums.get(idx++);
        int[][] a = new int[n1][m1];
        for (int i = 0; i < n1; i++)
            for (int j = 0; j < m1; j++)
                a[i][j] = nums.get(idx++);

        int n2 = nums.get(idx++), m2 = nums.get(idx++);
        int[][] b = new int[n2][m2];
        for (int i = 0; i < n2; i++)
            for (int j = 0; j < m2; j++)
                b[i][j] = nums.get(idx++);

        int[][] c = new int[n1][m2];
        for (int i = 0; i < n1; i++)
            for (int j = 0; j < m2; j++)
                for (int k = 0; k < m1; k++)
                    c[i][j] += a[i][k] * b[k][j];

        for (int i = 0; i < n1; i++){
            for (int j = 0; j < m2; j++){
                System.out.print(c[i][j]);
                if (j < m2 - 1) System.out.print(" ");
            }
            System.out.println();
        }
    }
}
