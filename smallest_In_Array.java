import java.util.*;
public class smallest_In_Array{
    public static int Smallest(int num[]){
        int smallest=Integer.MAX_VALUE;//for +infinity
        for(int i=0;i<num.length;i++){
            if(smallest>num[i]){
                smallest=num[i];
            }
        }
        return smallest;
    }
    public static void main(String args[]){
        int num[]={10,2,3,44,5,6,77,8,9};
        System.out.println("Smallest number is : "+Smallest(num));
    }
}