public class Non_Repeating_Characters {
    public static void main(String[] args) {
        String str = "Hello world";

        int arr[] = new int[256];

        for(int i =0; i<str.length(); i++){
            arr[str.charAt(i)]++;
        }

        System.out.print("Non repeating characters are:");
        for(int i=0;i<256;i++){
            if(arr[i] == 1){
                System.out.print((char)i+" ");
            }
        }
    }
}
