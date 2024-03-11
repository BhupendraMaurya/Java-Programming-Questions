public class Constructor3 {
    int id;
    String name;
    String email;
    Constructor3(int i, String n){
        id = i;
        name = n;
    }
    Constructor3(int i,String n,String e){
        id = i;
        name = n;
        email = e;
    }

    void display(){
        System.out.println(id+" "+name+" "+email);
    }

    public static void main(String[] args) {
        Constructor3 c = new Constructor3(212,"bhudf");
        Constructor3 c2 = new Constructor3(323,"hsfdf","gmail");

        c.display();
        c2.display();
    }
}
