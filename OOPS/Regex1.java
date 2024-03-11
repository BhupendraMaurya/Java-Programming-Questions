// wrong output
import java.util.regex.*;
public class Regex1{
    public static void main(String[] args) {
        Pattern p = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher("Visit W3schools");
        boolean b = m.matches();
        System.out.println(b);
    }
}