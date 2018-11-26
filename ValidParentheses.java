package com.example.helloworld;

import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String str){
        Stack<Character> stack = new Stack<Character>();
        if(str.length() %2 != 0)
            return false;

        for(Character ch : str.toCharArray()){
            if(ch == '{')
                stack.push('}');
            else if(ch == '(')
                stack.push(')');
            else if(ch == '[')
                stack.push(']');
            else{
                if(stack.isEmpty() || stack.pop() != ch)
                    return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args){
        String str = "{()[}]";
        System.out.println("Parenthese valid :: " + isValid(str));
    }
}
