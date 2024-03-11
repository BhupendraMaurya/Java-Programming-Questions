class Load{
    int id;
    String name;
    static String college = "IPS";
    Load(int i,String n){
        id =i;
        name = n;
    }
    void display(){
        System.out.println(id+" "+name+" "+college);
    }
}
public class Static1 {
    public static void main(String[] args) {
        Load l = new Load(2323, "Bhupenda");
        l.display();
    }
}
