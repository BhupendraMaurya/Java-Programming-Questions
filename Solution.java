import java.util.*;
public class Solution{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Enter your number: ");
        num = sc.nextInt();

        if(isEven(num)){
            System.out.print("Even number");
        }
        else{
            System.out.print("Odd number");
        }


    }
    public static boolean isEven(int number){
        if(number%2==0){
            return true;
        }
        else{
            return false;
        }
    }
}