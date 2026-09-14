package lab1;

public class Multiples {
    public static void main(String[] args) {
        int count = multiples(3, 5);
        System.out.println(count);
    }

    private static int multiples(int a, int b) {
        int count = 0;
        for (int i = 1; i <= 1000; i++){
            if (i % a == 0 || i % b == 0) {
                count++;
            }
        }
        return count;
    }
}
