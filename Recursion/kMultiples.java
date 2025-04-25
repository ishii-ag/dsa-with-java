package Recursion;

class kMultiples {
    public static void multiples(int n, int k) {
        if (k == 1) {
            System.out.println(n);
            return;
        }
        multiples(n, k - 1); //12 24 36 48
System.out.println(n*k);    //60
}
    public static void main(String[] args) {
        multiples(12, 5);
    }
}