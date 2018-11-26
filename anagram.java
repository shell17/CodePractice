import java.util.Arrays;

public class anagram {

    public static void main(String[] args){
        String str11 = "armdy ";
        String str21 = "Mardy";

        String str1= str11.replaceAll("\\s", "");
        String str2= str21.replaceAll("\\s", "");


        if(str1.length()!= str2.length()){
            System.out.println("Not anagram length");

        }
        else{
            char[] str1Array = str1.toLowerCase().toCharArray();
            char[] str2Array = str2.toLowerCase().toCharArray();

            Arrays.sort(str1Array);
            Arrays.sort(str2Array);
            if(Arrays.equals(str1Array, str2Array)){
                System.out.println("Yes Anagram");
            }
            else{
                System.out.println("Not anagram");
            }
        }

    }
}
