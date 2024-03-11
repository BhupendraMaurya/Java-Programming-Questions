public class Practice{
   public static void main(String args[]){
      int rem, reversed=0, temp;
      int n = 454;
      temp = n;
      while(n>0){
         rem = n%10;
         reversed = (reversed*10)+rem;
         n = n/10;
      }
      if(temp == reversed){
         System.out.println("Palindrome");
      }
      else{
         System.out.println("not palindrome");
      }
   }
} 