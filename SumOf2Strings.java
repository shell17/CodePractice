package com.PracticeAgain;

public class SumOf2Strings {
        public String addStrings(String num1, String num2) {

        /*int[] n1=new int[num1.length()];
        int[] n2=new int[num2.length()];
        int i =0;
        for(char ch : num1.toCharArray()){
            n1[i++] = ch - '0';
        }

        for(char ch : num2.toCharArray()){
            n2[i++] = ch - '0';
        }

        char[] res = new char[Math.max(n1.length,n2.length)];
            int sum=0,carry=0;
        for(int j=Math.max(n1.length,n2.length);j>=0;j--){
            sum=n1[j]+n2[j]+carry;
            if(sum>9){
                carry=1;
            }
            else
                carry=0;

            res[j]=(char) (sum%10 - 'a');
        }

        if(carry==1){
            char[] newres = new char[res.length+1];

        newres[0]=1;
        for(int j=res.length;j>=0;j--){
            newres[j]=res[j];
        }

        return Arrays.toString(newres);
        }
        else{
            return Arrays.toString(res);
        }*/

            StringBuilder sb = new StringBuilder();
            int carry=0;
            for(int i=num1.length()-1,j=num2.length()-1; i>=0 || j>=0 || carry ==1; i--,j--){
                int x = i < 0 ? 0 :num1.charAt(i)-'0';
                int y = j < 0 ? 0 :num2.charAt(j)-'0';
                sb.append((x+y+carry)%10);
                carry = (x+y+carry)/10;
            }
            return sb.reverse().toString();

        }
    }
