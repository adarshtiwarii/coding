package coding;
public class string {
    public static void main(String[] args) {
        String str="HEllo, how are you";
        String st=" ";
        System.out.println(str.length());
        System.out.println(str.substring(0));
        System.out.println(str.substring(5,11));
        System.out.println(str.replace("HEllo","Hi.."));

        System.out.println(st.isEmpty());
        System.out.println(st.isBlank());

        char[] chArray={'A','D','A','R','S','H'};
        String str2=new String(chArray);
        System.out.println(str2);
         
    }
}
