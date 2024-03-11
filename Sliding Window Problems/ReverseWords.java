import java.util.Stack;
import java.util.*;

public class ReverseWords {
    public static String reverseWords(String s) {
        if(s.length() == 1){
            return s;
        }

        String arr[] = s.split(" ");

        
        String str = "";

        for(int i=arr.length-1;i>=0;i--){
            str = str + arr[i];
            str = str + " ";
        }


        return str;
        

    }
    public static void main(String args[]){
        String s = "I am Shaili Dwivedi";

        String s2 = reverseWords(s);

        for(int i=0;i<s2.length();i++){
            System.out.print(s2.charAt(i));
        }
        System.out.println();


    }
}
