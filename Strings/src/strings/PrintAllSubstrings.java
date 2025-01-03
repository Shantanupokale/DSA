package strings;


public class PrintAllSubstrings {


    public static void main(String[] args) {

        //complete substrings printing

        String s ="abcd";  //index goes form 0 to 3

//        for (int i = 0; i <= s.length() ; i++) {
//            for (int j = 1; j < s.length()+1; j++) {
//                System.out.println(s.substring(i,j));
//            }
//            //Your code fails because the outer loop allows `i` to exceed valid indices (`i <= s.length()`), and the inner loop doesn’t ensure `j > i`, causing invalid `substring(i, j)` calls.
//            // For example, it fails when `i = 4` and `j = 1, 2, 3, 4` because `s.substring(4, j)` accesses out-of-bound indices.
//            // Always keep indices within bounds and ensure `i <= j`.
//        };


        //correct code
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                System.out.println(s.substring(i, j));
            }
        }

    }
}
