package strings;

public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hello");
        str.append("world");
        System.out.println(str);

        //hello-> mello can be done using string builder
        // use setCharAt(index,"character")
        StringBuilder s = new StringBuilder("hello");
        s.setCharAt(0,'m'); //mello

        s.insert(2, 'y'); // meyllo
        s.deleteCharAt(0); // eyllo
        System.out.println(s);


    }


}
