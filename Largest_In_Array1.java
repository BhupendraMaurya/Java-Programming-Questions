import java.util.*;
public class Largest_In_Array1{
    public static int Largest(int num[]){
        int largest=Integer.MIN_VALUE;//for -infinity
        for(int i=0;i<num.length;i++){
            if(largest<num[i]){
                largest=num[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        int num[]={1,2,3,44,5,6,77,8,9};
        System.out.println("Largest number is : "+Largest(num));
    }
}