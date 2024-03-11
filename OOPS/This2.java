// to solve the problem of ambuiguity we will use (this ) keyword

class Student6{
    int id;
    String name;
    Student6(int id,String name){
        this.id = id;
        this.name = name;
    }
    void display(){
        System.out.println(id+" "+name);
    }
}
public class This2 {
    public static void main(String[] args) {
        Student6 s = new Student6(323,"bhupoendra");
        s.display();
    }
}
