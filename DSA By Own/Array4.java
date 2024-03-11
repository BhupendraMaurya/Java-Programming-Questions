// Least frequent element in an array
public class Array4 {
    static int INT_MAX = 1000000000;
    static int leastFrequent(int a[], int n){
         
        int maxCount = INT_MAX;
        int element_Having_minimum_frequency = -1;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=i+1;j<n;j++){
                if(a[i] == a[j]){
                    count++;
                }
            }
            if(count<maxCount){
                maxCount = count;
                element_Having_minimum_frequency = a[i];
            }
        }
        return element_Having_minimum_frequency;
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,1};
        int n = a.length;
        System.out.println(leastFrequent(a, n));
    }
}
