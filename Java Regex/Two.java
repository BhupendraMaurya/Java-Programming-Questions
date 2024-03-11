import java.util.regex.*;
public class Two {
    public static void main(String[] args) {
        Pattern p = Pattern.compile(".s");
        Matcher matcher = p.matcher("asaa");
        boolean b = matcher.matches();
        System.out.println(b);
        // we can also write : Pattern.matches() function;
        boolean b2 = Pattern.matches(".s","asaaa");
        System.out.println(b2);

        
    }
}
