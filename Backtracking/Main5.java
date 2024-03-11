import java.util.Scanner;

public class Main5 {
    public void helper_function(){
        Scanner sc = new Scanner(System.in);
        // int n;
        // n = sc.nextInt();
        sc.nextLine();

        // for(int i=0;i<n;i++){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();

            if(areAnagrams(s1, s2)){
                System.out.println("Anagrams");
            }
            else{
                System.out.println("Not Anagrams");
            }
        //}
        sc.close();


    }

    public static boolean areAnagrams(String str1, String str2) {
        
        if (str1.length() != str2.length()){
            return false;
        }
        
        int count[] = new int[26];

        for(char x:str1.toCharArray()){
            count[x-'a']++;
        }

        for(char x : str2.toCharArray()){
            count[ x - 'a']--;
        }


        for(int val : count){
            if(val != 0){
                return false;
            }
        }

        return true;
    }

    public static void main(String args[]){
        Main5 m = new Main5();
        m.helper_function();
    }
}
