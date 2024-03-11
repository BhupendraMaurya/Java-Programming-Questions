import java.util.ArrayList;

public class PrintReverse{
    public static void main(String args[]){
        ArrayList<Integer> reverse = new ArrayList<>();

        reverse.add(1);
        reverse.add(2);
        reverse.add(3);
        reverse.add(4);
        reverse.add(5);

        System.out.println(reverse);

        // TC for this program is O(n)

        for(int i=reverse.size()-1; i>=0; i--){
            System.out.print(" "+ reverse.get(i));
        }

    }
}