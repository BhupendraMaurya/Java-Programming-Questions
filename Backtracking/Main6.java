import java.util.Scanner;

public class Main6{
    public static boolean isAnagram(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }

        int cnt[] = new int[26];

        for(int i=0;i<s1.length();i++){
            char ch = s1.charAt(i);
            cnt[ch - 'a']++;
        }

        for(int i=0;i<s1.length();i++){
            char ch = s2.charAt(i);
            cnt[ch - 'a']--;
        }

        for(int i=0;i<cnt.length;i++){
            int val = cnt[i];
            if(val != 0){
                return false;
            }
        }

        return true;
    }
    public void helper_function(){
        Scanner sc = new Scanner(System.in);
        int n; 
        n = sc.nextInt();
        sc.nextLine();

        for(int i=0;i<n;i++){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();

            if(isAnagram(s1,s2)){
                System.out.println("Anagrams");
            }
            else{
                System.out.println("Not Anagrams");
            }
        }
        sc.close();

    }
    public static void main(String args[]){
        Main6 m = new Main6();
        m.helper_function();
    }
}