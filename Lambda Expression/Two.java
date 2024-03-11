// A lambda expression can have zero or any number of arguments.
interface Sayable{
    public void say();
}
public class Two {
    public static void main(String[] args) {
        Sayable d = ()->{
            System.out.println("Nothing to say");
        };
        d.say();
    }
}
