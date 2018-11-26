package com.example.helloworld;

public class    StringFunctions {
    public static void main(String[] args){
        String s1 = "This is funny";
        String s2 = s1.intern();

        System.out.println(s1.concat(s2)); //twice this is funny
        StringBuffer sb = new StringBuffer(s1);
        if(s1.contentEquals(sb)) //yes equal
            System.out.println("sb equal");
        System.out.println("Lastindexof f:" + s1.lastIndexOf('f')); //8
        System.out.println("Lastindexof is: " + s1.lastIndexOf("is"));//5
        if(s1.equals(s2))
            System.out.println("yes string are equal");
        if(s1==s2)
            System.out.println("equal");

        float salary = 40;
        System.out.printf("%.2f",salary);
    }
}
