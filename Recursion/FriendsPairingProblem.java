public class FriendsPairingProblem{
    public static int FreindsPair(int n){
        if(n==1 || n==2){
            return n;
        }
        return FreindsPair(n-1)+(n-1)*FreindsPair(n-2);
    }
    public static void main(String args[]){
        System.out.println(FreindsPair(2));

    }
}