package OOP;

class Functions {

    // function with no arguments no return type
    static void add() {
        System.out.println("function with no arguments no return type ");
    }

    // function with argument no return type
    static void add(int a, int b) {
        System.out.println(" function with argument no return type");
    }

    // function with argument and return type
    static int subtract(int a, int b) {
        return a - b;
    }

    // function with no argument but with return type
    static int addition() {
        int a = 10, b = 35;
        return a + b;
    }

    public static void main(String[] args) {
        add();
        add(4, 5);
        subtract(3, 1);
        addition();
    }
}