public class Recursive {

    public static void main(String[] args) {
        Recursive r = new Recursive();
        int factorial = r.factorial(10);
        System.out.println(factorial);
    }

    public int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
