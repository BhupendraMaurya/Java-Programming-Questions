//  initializing object by Constructor
class Student4{
    int id;
    String name;

    Student4(int id, String name){
        this.id = id;
        this.name = name;
    }
    void display(){
        System.out.println(id+" "+name);
    }
}
public class Object_Initialize3 {
    public static void main(String[] args) {
        Student4 s = new Student4(212,"bhupendra");
        s.display();
        
    }
}
