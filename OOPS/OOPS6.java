//multiple level inheritance
public class OOPS6{
    public static void main(String args[]){
        Dog tony = new Dog();
        tony.eat();
        tony.legs=4;
        System.out.println(tony.legs);

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
class Mammal extends Animal{
    int legs;
}

class Dog extends Mammal {
    String breed;
}