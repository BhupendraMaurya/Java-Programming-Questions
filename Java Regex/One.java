import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class One{
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("Bhupendra");
        Matcher matcher = pattern.matcher("visit W3schools!");
        boolean matchfound = matcher.find();
        if(matchfound){
            System.out.println("Match found");
        }
        else{
            System.out.println("Not found");
        }
    }
}