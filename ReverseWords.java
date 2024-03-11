public class ReverseWords {
    public static String reverse(String str){
        int i = str.length()-1;
        String s = "";

        while(i>=0){

            // for spaces
            while(i>=0 && str.charAt(i) == ' '){
                i--;
            }

            int j = i;
            if(i < 0){
                break;
            }


            while(i>=0 && str.charAt(i) != ' '){
                i--;
            }

            if(s.isEmpty()){
                s = s.concat(str.substring(i+1, j+1));
            }
            else{
                s = s.concat(" "+ str.substring(i+1, j+1));
            }
        }
        // str = (String)sb;
        return s;
    }
    public static void main(String args[]){
        String s = "I am bhupendra maurya";

        System.out.println(reverse(s));
    }
}
