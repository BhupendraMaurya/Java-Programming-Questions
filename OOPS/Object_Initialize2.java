// initializing object by invoking method
class Student2{
    int id;
    String name;

    void insertRecord(int i, String n){
        id = i; 
        name = n;
    }

    void display(){
        System.out.println(id+" "+name);
    }

}
public class Object_Initialize2 {
    public static void main(String[] args) {
        Student2 s = new Student2();
        s.insertRecord(121,"Bhupendrea");
        s.display();
    }
}
