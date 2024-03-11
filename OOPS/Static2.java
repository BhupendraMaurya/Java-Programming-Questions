// instance variable without static keyword
public class Static2 {
    int count=0;
    Static2(){
        count++;
        System.out.println(count);
    }
    public static void main(String[] args) {
        Static2 s = new Static2();
        Static2 s2 = new Static2();
    }
}
