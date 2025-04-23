package Recursion;

public class SumOfDigits {
    public static int SumOD(int n) {
        if (n >= 0||n<=9) {
            return n;
        }
        return n % 10 + SumOD(n / 10);
    }
    public static void main(String[] args) {
        System.out.println(SumOD(1234));
    }
}
