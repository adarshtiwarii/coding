package coding;

import java.util.Scanner;

public class arr2d {
    public static void main(String[] args) {
        String str[][]=new String[3][3];
        str[0][0]="A";
        str[0][1]="B";
        str[0][2]="C";

        str[1][0]="D";
        str[1][1]="E";
        str[1][2]="F";

        str[2][0]="G";
        str[2][1]="H";
        str[2][2]="I";

        for(int i=0;i<str.length;i++){
            for(int j=0;j<str[i].length;j++){
                System.out.println("i :"+i+"j :"+j+"---> "+str[i][j]);
            }
        }


    }
    
}
class ad {
    public static void main(String[] args) {
        int d1=3;
        int d2=3;
        String st[][]=new String[d1][d2];
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the value 2d array");
        for(int i=0;i<d1;i++){
            for(int j=0;j<d2;j++){
                st[i][j]=scan.next();
            }
        }
        scan.close();
    }

    
}
