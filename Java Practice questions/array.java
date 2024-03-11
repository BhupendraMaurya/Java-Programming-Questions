public class array{
    public static void main(String args[]){
        float num[]={1.0,2.5};
        float sum=0.0;
        for(int i=0;i<num.length;i++){
            sum+=num[i];
        }
        System.out.println("total sum is: " +sum);
    }
}