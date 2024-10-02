package chapter04;

public class Exercise4_9 {
    public static void main(String[] args) {
        int num = 12345;
        int sum = 0;

        do {
            int i = num % 10;
            sum += i;
            num /= 10;
        } while (num > 0);

        System.out.println("sum = " + sum);
    }
}
