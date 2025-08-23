package coding;

public class prob4 {
    public static void main (String[] args){
        for(Character ch = 'A'; ch <= 'E'; ch++) {
            for(Character j = 'A'; j <= ch; j++) {
                System.out.print(j + " ");
            }
            System.out.println();

        }
    }
    
}
