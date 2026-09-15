package lab1;

public class Reduce {
    public static void main(String[] args) {
        System.out.println(reduce(100));
    }

    public static int reduce(int integer) {
        int ctr = 0;
        while (integer > 0) {
            integer = reduceOneStep(integer);
            ctr++;
        }
        return ctr;
    }

    public static int reduceOneStep(int integer) {
        if (integer % 2 == 0) {
            return integer / 2;
        } else {
            return integer -1;
        }
    }
}
