package Recursion;
public class DecreasingNumber {

    public static void Decreasing(int n) {
        //base case
        if (n == 1) {
            System.out.println("1");
            return;
        } 
      //self work
        System.out.println(n);
            //recursive work
            Decreasing(n - 1);
             System.out.println(n+n);
        }
    public static void main(String[] args) {
        Decreasing(10);
    }
}
