// Problem without (this) Keyword
class Student5{
    int id;
    String name;
    Student5(int id,String name){
        id = id;// here ambuiguity problem will arise
        name = name;
    }
    void display(){
        System.out.println(id+" "+name);
    }
}
public class This1 {
    public static void main(String[] args) {
        Student5 s =  new Student5(121,"bhupendra");
        s.display();
    }
}
