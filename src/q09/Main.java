import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scAll = new Scanner(new String(System.in.readAllBytes()));
        
        int n1 = scAll.nextInt(), m1 = scAll.nextInt();
        int[][] a = new int[n1][m1];
        for(int i=0;i<n1;i++)
            for(int j=0;j<m1;j++)
                a[i][j] = scAll.nextInt();

        int n2 = scAll.nextInt(), m2 = scAll.nextInt();
        int[][] b = new int[n2][m2];
        for(int i=0;i<n2;i++)
            for(int j=0;j<m2;j++)
                b[i][j] = scAll.nextInt();

        int[][] c = new int[n1][m2];
        for(int i=0;i<n1;i++)
            for(int j=0;j<m2;j++)
                for(int k=0;k<m1;k++)
                    c[i][j] += a[i][k] * b[k][j];

        for(int i=0;i<n1;i++){
            for(int j=0;j<m2;j++){
                System.out.print(c[i][j]);
                if(j<m2-1) System.out.print(" ");
            }
            System.out.println();
        }
    }
}
