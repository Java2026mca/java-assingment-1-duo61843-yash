import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        String shape = sc.next();
        double area = 0.0;

        if (shape.equalsIgnoreCase("circle")) {
            double r = sc.nextDouble();
            area = 3.14 * r * r;
        } 
        else if (shape.equalsIgnoreCase("rectangle")) {
            double l = sc.nextDouble();
            double w = sc.nextDouble();
            area = l * w;
        } 
        else if (shape.equalsIgnoreCase("triangle")) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            double s = (a + b + c) / 2.0;
            area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        }

        System.out.printf("Area: %.2f", area);
        sc.close();
    }
}
