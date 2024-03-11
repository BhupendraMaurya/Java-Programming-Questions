public class NumberOfString{
    public static int Length(String str){
        if(str.length()==0){
            return 0;
        }
        return Length(str.substring(0))+1;
    }
    public static void main(String args[]){
        String str = "abcdef";
        System.out.println(Length(str));
    }
}