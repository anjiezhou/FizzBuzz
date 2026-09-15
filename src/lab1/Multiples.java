package lab1;

public class Multiples {
    public static void main(String[] args) {
        int count = multiples();
        System.out.println(count);
    }

    public static int multiples() {
        return multiples(1000, 3, 5);
    }

    public static int multiples(int n, int a, int b) {
        int ctr = 0;
        for (int i = 1; i < n; i ++) {
            if (multiplesCheck(i, a, b)) {
                ctr++;
            }
        }
        return ctr;
    }

    public static boolean multiplesCheck(int n, int a, int b) {
        return (n % a == 0) || (n % b == 0);
    }
}
