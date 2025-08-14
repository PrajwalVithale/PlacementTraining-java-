import java.util.*;

public class InfixToPostfixusingStack {

    static int precedence(String op) {
        switch (op) {
            case "+":
            case "-":
                return 1;
            case "*":
            case "/":
                return 2;
        }
        return 0;
    }

    static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") ||
               token.equals("*") || token.equals("/");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String infix = sc.nextLine();

        String[] tokens = infix.split(" "); // Tokens are space-separated
        Stack<String> stack = new Stack<>(); // Operator stack
        StringBuilder postfix = new StringBuilder(); // Result

        for (String token : tokens) {
            if (!isOperator(token) && !token.equals("(") && !token.equals(")")) {
                // Operand: directly append
                postfix.append(token).append(" ");
            }
            else if (isOperator(token)) {
                // Pop from stack while top has higher or equal precedence
                while (!stack.isEmpty() && isOperator(stack.peek()) &&
                        precedence(stack.peek()) >= precedence(token)) {
                    postfix.append(stack.pop()).append(" ");
                }
                stack.push(token);
            }
            else if (token.equals("(")) {
                stack.push(token);
            }
            else if (token.equals(")")) {
                // Pop until '(' is found
                while (!stack.isEmpty() && !stack.peek().equals("(")) {
                    postfix.append(stack.pop()).append(" ");
                }
                if (!stack.isEmpty() && stack.peek().equals("(")) {
                    stack.pop(); // Remove '('
                }
            }
        }

        // Pop remaining operators
        while (!stack.isEmpty()) {
            postfix.append(stack.pop()).append(" ");
        }

        // Output result (trim trailing space)
        System.out.println(postfix.toString().trim());

        sc.close();
    }
}
