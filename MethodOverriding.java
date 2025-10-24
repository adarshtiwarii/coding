package coding;

class User {
    void getLogin(){
        System.out.println("user login");
    }
    void logout(){
        System.out.println("user login");
    }
}
class Emp extends User {
    void getLogin(){
        System.out.println("Emp Login");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Emp e1 = new Emp();
        e1.getLogin();
    }
}
