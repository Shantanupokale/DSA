package array;



public class reversenor {
    public static int reverse(int x) {
        int reversed = 0;
        while (x != 0) {
            int k = x % 10; // Get the last digit
            reversed = reversed * 10 + k; // Append the digit to the reversed number
            x = x / 10; // Remove the last digit from x
        }
        return reversed; // Return the fully reversed number

    }


    public static void main(String[] args) {
        int x = 1534236469;
        int rev = reverse(x);
        System.out.println(rev);

    }
}
