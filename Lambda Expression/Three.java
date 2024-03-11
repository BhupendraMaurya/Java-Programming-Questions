interface Sayablee{
    public String say(String name);
}
public class Three {
    public static void main(String[] args) {
        Sayablee s = (name)->{
            //return "HEllo"+name;
            return "Hello "+name;
        };
        System.out.println(s.say(" Bhupendra"));
    }
}
