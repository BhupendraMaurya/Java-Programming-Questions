public class FindSubsets{
    public static void Subsets(String str, String newstr, int i){
        //base case
        if(i==str.length()){
            if(newstr==""){
                System.out.println("null");
            }
            else{
                System.out.println(newstr);
            }
            return;
        }

        //recursion
        //yes condition

        Subsets(str,newstr+str.charAt(i),i+1);

        //for no condition
        Subsets(str,newstr,i+1);

    }
    public static void main(String args[]){
        String str="abc";
        Subsets(str,"",0);
    }
}