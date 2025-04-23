
public class IncreasingNumber {
    public static void increasing(int n) {
        // base case
        if (n == 1) {
            System.out.println("1");
            return;
        }
        // recurvsive work
        increasing(n - 1);

        // self work
        System.out.println(n);
    }

    public static void main(String[] args) {
        increasing(10);
    }
}
