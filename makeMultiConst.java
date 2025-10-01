package coding;

class Person{
    Person(){
        System.out.println("Constructor called");
    }

    Person(String name){
        System.out.println(name);
    }
    Person(String name,int age){
        System.out.println(name + age);
    }
}

public class makeMultiConst {
    public static void main(String[] args) {
        Person p1=new Person( );
        Person p2=new Person("Adarsh");
        Person p3=new Person("Adarsh",25);
    }
    
}
