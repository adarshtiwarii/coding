package coding;
class Address {
    String name;
    String houseNo;
    String city;
    String country;
    public Address(String houseNo,String city,String country){
    this.houseNo=houseNo;
    this.city=city;
    this.country=country;
    }

}
class Employee{
    String name;
    Address address;

public Employee(String name,Address address){
    this.name=name;
    this.address= address;

}
public void display(){
    System.out.println(name);
    System.out.println(address.houseNo + address.city + address.country);
}
}

public class AggregationExample {
    public static void main(String[] args){
        Address aa1=new Address("H10 ", "Mirzapur ", "India");
        Employee a1=new Employee("Adarsh Tiwari",aa1);
        a1.display();


    }
    
}