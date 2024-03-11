// here I am initializing object with the help of reference variable
class Student1{
    int id;
    String name;
}
public class Object_Initialize {
    public static void main(String[] args) {
        Student1 s=  new Student1();
        s.id = 212;
        s.name = "Bhupendra";
        System.out.println(s.id+" "+s.name);
    }
}
