public class uppercasetolowercase{
    public static void main(String args[]){
        int x=32;
        for(char ch='A';ch<='Z';ch++){
            System.out.print((char)(ch|x));
        }
        //OR
        // for(char ch='A';ch<='Z';ch++){
        //     System.out.print((char)(ch|' '));
        // }
    }
}