package coding;
class A{
    private int x;
    private static int y;

    void fun1(){
        x=22;
        y=5;
    }
    void fun2(){
        System.out.println(x);
    }
    void fun3(){
        y=45;
    }
}

public class StaticMember{
    public static void main(String[] args){
        A a1=new A();
        A a2=new A();
        a1.fun1();
        a1.fun3();
        a2.fun2();

    }

}