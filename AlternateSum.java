
public class AlternateSum {
    // 1-2+3-4+5-6+7-8+9-10
    public static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        if (n % 2 == 0) { //even
            return  sum(n - 1)-n;
        }
        else { //odd
            return sum(n - 1)+n;

        }
    }
    public static void main(String[] args) {
        System.out.println(sum(4));
    }
}
