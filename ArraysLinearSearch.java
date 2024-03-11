import java.util.*;
//linear search me hm ek ek index ko n times check krte hain isaliye iski time complexity O(n) hoti h.
public class ArraysLinearSearch{
    public static int LinearSearch(int numbers[], int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int numbers[] = { 1,2,3,4,5,6,7,8,9};
        int key;
        System.out.println("Enter your number: ");
        key = sc.nextInt();
        int index = LinearSearch(numbers,key);
        if(index==-1){
            System.out.println("not found");
        }
        else{
            System.out.println("Key is at index: " +index);
        }
    }
}