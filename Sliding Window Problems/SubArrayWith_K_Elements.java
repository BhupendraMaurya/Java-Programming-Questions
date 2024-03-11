public class SubArrayWith_K_Elements{
    public static void subArray(int a[],int k){
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                if(j-i+1 == k){
                    for(int kk=i;kk<=j;kk++){
                        System.out.print(a[kk]+" ");
                    }
                    System.out.println();
                }
            }
        }
    }

    

    // another approach
    public static void subArray2(int a[], int k){
        int i=0;
        int m =0 ;
        for(int j=k+i-1;j<a.length;j++){
            for(int kk = i+m;kk<=j;kk++){
                System.out.print(a[kk]+" ");
            }
            m = m+1;
            System.out.println();
        }
    }

    // another approach
    public static void subArray3(int a[], int k){
        for(int i=0;i<a.length-k+1;i++){
            int j=i;
            int cnt = 0;
            while(cnt<k){
                System.out.print(a[j++]+" ");
                cnt++;
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int a[] = {1,2,3,4,5,6};
        int k = 3;
        //subArray(a,k);
        //subArray2(a, k);
        subArray3(a, k);
    }
}