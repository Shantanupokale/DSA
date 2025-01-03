package strings;

public class equals {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        System.out.println(s1==s3); // comapares only the address
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3)); // comapres the actual string and not the address
    }
}
