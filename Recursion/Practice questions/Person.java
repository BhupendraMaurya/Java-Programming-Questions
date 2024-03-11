import java.util.Arrays;
public class Person {
  
  public static void main(String args[]){
     int arr[] = {1,4,2,6,4,9,8,3};
     Arrays.sort(arr,5,8);
     for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+ " ");
     }
     System.out.println();
    System.out.println(Arrays.toString(arr));

  }
}