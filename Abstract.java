package coding;

abstract class Android{
   void goodFeature(){
    System.out.println("Android os provides alot of goog features");
   } 
   abstract void makeYourUi();
}
class AnySmartPhone extends Android{
    void makeYourUi(){
        System.out.println("Smartphone company has own UI");
    }
}

public class Abstract {
    public static void main (String[] args){
        AnySmartPhone a1=new AnySmartPhone();
        a1.makeYourUi();
        a1.goodFeature();
    }
    
}