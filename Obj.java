package coding;

public class Obj {
    
    int x;//instance(object)membervariable
    int y;//

    void fun1(){//instance(object)member function
        System.out.println("fun1");

    }
    void fun2(){
        System.out.println("fun2");
    }
    public static void main(String[] args){
        Obj e1 = new Obj();
        e1.fun1();
        e1.fun2();

        System.out.println(e1.x);


    }
}