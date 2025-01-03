package strings;

public class stringReverse {
    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("Physics");

        // reverse using defineing a  loop with suing charAt(i,j)
        String original = "hello";
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }


        // using inbuilt fn str.reverse()
        str.reverse();
        System.out.println(str); //scisyhP



        //str.delete
        StringBuilder gtr = new StringBuilder("physicswallah");
        gtr.delete(2,4); // index 2 include but not 4 , and wil delete till 4th index
        System.out.println(gtr);

    }
}
