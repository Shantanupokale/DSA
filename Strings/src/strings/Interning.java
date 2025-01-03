package strings;

public class Interning {

    public static void main(String[] args) {
         String s = "Hello";
         String r = "Hello";
         r = "Mello";

        System.out.println(s);
        System.out.println(r);
        System.out.println(s);
    }
}
