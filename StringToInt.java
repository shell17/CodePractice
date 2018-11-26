package com.PracticeAgain;

public class StringToInt {
        public int myAtoi(String str) {

            String str1 = str.trim(); //trim white spaces
            //System.out.println(str1);
            if(str1.isEmpty())
                return 0;
            int sign =1;


            if(str1.charAt(0) < '0' && str1.charAt(0) >'9' && str1.charAt(0)!= '-' && str1.charAt(0) != '+'){
                //System.out.println("in 1");
                return 0;
            }
            int index =0;
            if(str1.charAt(0) == '-'){
                sign = -1;
                index++;
            }
            else if(str1.charAt(0) == '+'){
                sign = 1;
                index++;
            }


            int total =0;
            for(int i=index; i< str1.length(); i++){
                int digit = str1.charAt(i) - '0';
                if(digit < 0 || digit > 9)
                    break;

                total  = total * 10 + digit;

                if(Integer.MAX_VALUE/10 <= total ||
                        Integer.MAX_VALUE%10 < digit){
                    return sign==1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
            }
            return total * sign;
        }
    }
