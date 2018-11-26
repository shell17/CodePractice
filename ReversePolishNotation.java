package com.practice;

import java.util.Stack;

public class ReversePolishNotation {

    public static String evaluate(String[] tokens){
        Stack<String> stack = new Stack<>();
        String operators = "+-/*";
        //handle exception if last chr is num then throw excepption
        for(String t: tokens){
            if(!operators.contains(t)){
                stack.push(t);
            }
            else{
                int operand1 = Integer.valueOf(stack.pop());
                int operand2 = Integer.valueOf(stack.pop());
                switch(t){
                    case "+":
                        stack.push(String.valueOf(operand1 + operand2));
                        break;
                    case "-":
                        stack.push(String.valueOf(operand1 - operand2));
                        break;
                    case "*":
                        stack.push(String.valueOf(operand1 * operand2));
                        break;
                    case "/":
                        stack.push(String.valueOf(operand1 / operand2));
                        break;
                }
            }
        }

        return stack.pop();

    }
    public static void main(String[] args){
        String[] tokens = new String[]{"2","1","+","3","*"};
        System.out.println("Result is : " + evaluate(tokens));
    }
}
