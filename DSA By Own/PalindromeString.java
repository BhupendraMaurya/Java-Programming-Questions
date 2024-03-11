
public class PalindromeString{

    public static boolean palindrome(String str){
        
        //sb.append(s);
        str = str.toLowerCase();
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) >=97 && str.charAt(i) <= 122){
                sb.append(str.charAt(i));
            }
        }
        int si = 0;
        int ei = sb.length()-1;
        while(si <= ei){
            if(sb.charAt(si) != sb.charAt(ei)){
                return false;
            }
            si++;
            ei--;
        }
        return true;
    }
    public static void main(String args[]){
        //Scanner sc = new Scanner(System.in);
        String str = "A man, a plan, a canal";
        System.out.println(palindrome(str));

    }
}