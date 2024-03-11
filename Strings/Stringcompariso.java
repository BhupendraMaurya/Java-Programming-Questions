public class Stringcompariso{
    public static void main(String args[]){
        String s1="Bhupendra";
        String s2="Bhupendra";
        String s3=new String("Bhupendra");
        if(s1==s2){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
        // if(s1==s3){
        //     System.out.println("Strings are equal");
        // }
        // else{
        //     System.out.println("Strings are not equal");
        // }
        if(s1.equals(s3)){
            System.out.println("Strings are equal");
        }
        else
        {
            System.out.println("Strings are notequal");
        }
    }
}