//hierarchial inheritance
public class OOPS7{
    public static void main(String args[]){
        Birds parrot = new Birds();
        parrot.breaths();
        parrot.flies();
    }
}
//parent class or base class
class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breaths(){
        System.out.println("breathes");
    }

}
//derived class
class Mammal extends Animal {
    void walks(){
        System.out.println("mammal walks");
    }
}
class Birds extends Animal {
    void flies(){
        System.out.println("birds flies");
    }
}
class Fish extends Animal {
    void swims(){
        System.out.println("fish swims");
    }
}