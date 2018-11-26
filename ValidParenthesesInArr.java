package com.PracticeAgain;

import java.util.Stack;

public class ValidParenthesesInArr {

    public static void main(String[] args){
         String values[] = {
                 "{}[]()", "{[()]}","{{{((({})))))","{{{(([[]]))}}}","{{]}"
         };

         String[] result = validate(values);
         for(String s: result){
             System.out.println(" " + s);
         }

    }

    private static String[] validate(String[] values) {
        String[] result = new String[values.length];
        int i=0;
        String yes="YES", no="NO";
        boolean isValid=false;

        for(String s : values){
            isValid = areValidParentheses(s);
            if(isValid){
                result[i++]=yes;
            }
            else{
                result[i++]=no;
            }

        }
        return result;
    }

    private static boolean areValidParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        if(s.length()%2 != 0)
            return false;
        for(Character ch : s.toCharArray()){
            if(ch == '{')
                stack.push('}');
            else if(ch == '(')
                stack.push(')');
            else if(ch == '[')
                stack.push(']');
            else{
                if(stack.isEmpty() || stack.pop() != ch){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

}
