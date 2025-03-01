package string.programs;

import java.util.Stack;

public class InvalidParenthesisChecker {
		    public static void main(String[] args) {
		        String expression = "((a+b)*(c-d)))"; // Example expression with invalid parentheses

		        if (isValidParentheses(expression)) {
		            System.out.println("The expression has valid parentheses.");
		        } else {
		            System.out.println("The expression has invalid parentheses.");
		        }
		    }

		    public static boolean isValidParentheses(String expression) {
		        // Stack to keep track of opening parentheses
		        Stack<Character> stack = new Stack<>();

		        // Iterate through each character in the expression
		        for (char ch : expression.toCharArray()) {
		            if (ch == '(') {
		                // Push opening parentheses to the stack
		                stack.push(ch);
		            } 
		            else if (ch == ')') 
		            {
		                if (stack.isEmpty())  // Check for unopened closing parentheses
		                {
		                    return false; // Invalid parentheses
		                } 
		                else 
		                {
		                    // Pop the corresponding opening parentheses
		                    stack.pop();
		                }
		            }
		        }

		        // Check for unclosed opening parentheses
		        return stack.isEmpty(); // If stack is empty, parentheses are valid
		
	}

}
