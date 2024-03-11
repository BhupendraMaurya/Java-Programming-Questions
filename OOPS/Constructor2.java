public class Constructor2 {
    int id ;
    String name;
    Constructor2(int i,String n){
        id = i;
        name = n;
    }
    void display(){
        System.out.println(id+" "+name);

    }
    public static void main(String[] args) {
        Constructor2 c = new Constructor2(1212,"hupefdsf");
        c.display();
    }
}
