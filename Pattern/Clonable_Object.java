public class Clonable_Object implements Cloneable{  
    int rollno;  
    String name;  
      
    Clonable_Object(int rollno,String name){  
    this.rollno=rollno;  
    this.name=name;  
    }  
      
    public Object clone() throws CloneNotSupportedException{  
    return super.clone();  
    }  
      
    public static void main(String args[]){  
    try{  
    Clonable_Object s1=new Clonable_Object(101,"amit");  
      
    Clonable_Object s2= (Clonable_Object)s1.clone();  
      
    System.out.println(s1.rollno+" "+s1.name);  
    System.out.println(s2.rollno+" "+s2.name);  
      
    }catch(CloneNotSupportedException c){}  
      
    }  
}
