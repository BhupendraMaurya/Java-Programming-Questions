import java.util.*;

public class Main {
    
    
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
    // public void helper_function(){
    //     Scanner sc = new Scanner(System.in);
    //     int n;
    //     n = sc.nextInt();

    // }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
            
            String str1 = sc.nextLine();
            String str2 = sc.nextLine();

            if (areAnagrams(str1, str2)){
                System.out.println("Anagrams"); 
            }
            else{
                System.out.println("Not Anagrams");
            }

            sc.close();
        
        
    
    }
}

