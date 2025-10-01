package coding;

import java.util.Scanner;
// sum of two number
class sum {
    public static void main(String[] args) {
        System.out.println("Enter the two number :");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        System.out.println(a+b);
        sc.close();
    }
    
}
// largest of two numbers
class largestNumber{
    public static void main(String[] args) {
        System.out.println("Largets NUmber write :");
        Scanner Sc1=new Scanner(System.in);
        int a=Sc1.nextInt();
        int b=Sc1.nextInt();
        System.out.println("Largets number is : " + (a > b ? a : b));
        Sc1.close();
    }
}
//check even or odd number
class EvenOddNumber {
    public static void main(String[] args) {
        System.out.println("Enter the Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + " is Even");
        } else {
            System.out.println(n + " is Odd");
        }

        sc.close();
    }
}
//Largest of three numbers 
class LargestThreeNumber{
    public static void main(String[] args) {
        System.out.println("Enter the three number :");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        int max=a;
        if(b>max) max=b;
        if (c>max) max=c;
        System.out.println(max+": Largest NUMber ");
        sc.close();
    }

}
//Positive,Negative,or Zero check
class Pnz {
    public static void main(String[] args) {
        System.out.println("Enter the number :");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>0){
            System.out.println("Postive Number");
        }else if(n<0){
            System.out.println("Negative Number");
        }else{
            System.out.println("Zero");
        }
        sc.close();

    }

    
}
//Leap Year check
class leap{
    public static void main(String[] args) {
        System.out.println("enter the number :");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean leap =(n%400==0)||(n%4==0 && n%100 !=0);
        if (leap) {
            System.out.println("Leap Year");

    System.out.println("Leap Year");
        } else {
            System.out.println("Not Leap Year");
}

        
        sc.close();
    }
}

//swap two number
class SwapNumbers {
    public static void main(String[] args) {
        int a = 5, b = 10;
        System.out.println("Before Swap: a = " + a + ", b = " + b);

        // Swap without temp
        a = a + b; // a = 15
        b = a - b; // b = 5
        a = a - b; // a = 10

        System.out.println("After Swap: a = " + a + ", b = " + b);
    }
}
//with temp swap two number
class SwapNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter second number: ");
        int c = sc.nextInt();

        System.out.println("Before Swap: a = " + a + ", b = " + b  +",c = "+c);

        // Swap using temp
        int temp = a;
        a = b;
        b = temp;
        b=c;
        c=temp;

        System.out.println("After Swap: a = " + a + ", b = " + b+",c = "+c);

        sc.close();
    }
}
