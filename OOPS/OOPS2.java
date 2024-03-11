public class OOPS2{
    public static void main(String args[]){
        Student s1 = new Student();
        Student s2 = new Student("bhupendra");
        System.out.println(s2.name);
        Student s3 = new Student(123);
        System.out.println(s3.roll);

        //Student s4 = new Student("bhupendra", 123);//gives error kyoki aisa koi constructor exist hi nit krta jisme ek parameter string ho aur doosra int ho


    }
}
class Student{
    String name;
    int roll;
    
    //non-parametrized constructor
    Student(){
        System.out.println(" Constructor is called");
    }

    //parametrized constructor
    Student(String name){
        this.name=name;
    }
    //parametrized constructor
    Student(int roll){
        this.roll=roll;
    }
}