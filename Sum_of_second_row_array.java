//import java.util.*;//no need
public class Sum_of_second_row_array{
    public static void main(String args[]){
        int num[][]={{1,4,9},{11,4,3},{2,2,3}};
        int sum=0;
        for(int i=1;i<=1;i++){
            for(int j=0;j<num[0].length;j++){
                sum+=num[i][j];
            }
        }
        System.out.println("Total sum is: "+sum);
        //second method
        //for(int j=0;j<num[0].length;j++)
        //sum+=num[1][j];
    }
}