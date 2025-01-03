package strings;

import java.util.Scanner;

public class toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());

        System.out.println(str);

        //toggle using Stringbuilder

        for (int i = 0; i < str.length(); i++) {
            //P -> p
            // check if alaphbet is small or capital

            boolean flag = true; // true for capital
            char ch = str.charAt(i); // A
            int asci = (int)ch;  //65
            if(asci<=97) {
                flag = false; // small
                asci += 32;
                char dh = (char) asci; //a
                str.setCharAt(i, dh);
            }
            else{ //small
                asci -= 32;
                char dh = (char)asci;
                str.setCharAt(i,dh);
            }
        }
        System.out.println(str);




    }
}
