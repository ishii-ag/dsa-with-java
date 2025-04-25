package OOP;

public class ContinueExample{
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if(i==4){ //skips this iteration
                continue;
            }
            System.out.println(i);
        }
    }
}
