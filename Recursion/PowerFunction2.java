public class PowerFunction2{
    public static int Power(int x, int n){
        if(n==0){
            return 1;
        }


        //int halfpower = Power(x,n/2)*Power(x,n/2); Time complexity = O(n)
        int halfpowersquare = Power(x,n/2);

        int halfpower = halfpowersquare * halfpowersquare;// time complexity = O(logn)


        //for odd power
        if(n%2!=0){
            halfpower = x*halfpower;
        }
        return halfpower;
    }
    public static void main(String args[]){
        int x = 2;
        int n = 5;
        System.out.println(Power(x,n));
    }
}//careers@kukbitsl.com