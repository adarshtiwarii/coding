package coding;

class Emp{

    Emp(){
        System.out.println("Construstion without argument");
    }
    Emp(String data){
        System.out.println(data);

    }
    void getName(){
        System.out.println("Get name method without argument");

    }
    void getName(String name){
        System.out.println(name);//argument overloading

    }
    void getName(String fName,String lName){//mehtod overloading with Arugument
        System.out.println(fName+lName);
    }
    void getAge(int age){
        System.out.println("int age"+age);

    }
    void getAge(String age){
        System.out.println("String AGe"+age);
    }
}

public class OverloadingExample {
    public static void main(String[] args) {
        Emp e1=new Emp();
        e1.getName();
        e1.getName("adarsh","Tiwari");
        e1.getAge(35);
        e1.getAge("25");
    }

    
}
