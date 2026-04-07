import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the whole line as postfix expression
        String line = sc.nextLine().trim();
        String[] tokens = line.split("\\s+");

        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (token.matches("-?\\d+")) {
                // number
                stack.push(Integer.parseInt(token));
            } else {
                // operator
                int b = stack.pop();
                int a = stack.pop();

                switch (token) {
                    case "+": stack.push(a + b); break;
                    case "-": stack.push(a - b); break;
                    case "*": stack.push(a * b); break;
                    case "/": stack.push(a / b); break;
                }
            }
        }

        // Final answer
        System.out.print(stack.pop());
    }
}
