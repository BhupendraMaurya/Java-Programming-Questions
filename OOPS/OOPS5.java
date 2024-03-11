//single level inheritance
public class OOPS5{
    public static void main(String args[]){
        Fish shark = new Fish();
        shark.eat();

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

//derived or sub  class
class Fish extends Animal{
    int fins;
    
    void swims(){
        System.out.println(" fish swims");
    }
}