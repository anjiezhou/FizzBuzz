package lab1;

public class Multiples {
    public static void main(String[] args) {
        System.out.println(countMultiplesOfThreeOrFive(1000));
    }

    public static int countMultiplesOfThreeOrFive(int integer) {
        int ctr = 0;
        for (int i = 1; i < integer; i ++) {
            if (multiplesOfThreeOrFive(i)) {
                ctr++;
            }
        }
        return ctr;
    }

    public static boolean multiplesOfThreeOrFive(int integer) {
        return (integer % 3 == 0) || (integer % 5 == 0);
    }
}
