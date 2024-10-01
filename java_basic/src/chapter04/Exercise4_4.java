package src.chapter04;

public class Exercise4_4 {
    public static void main(String[] args) {
        // 1+(-2)+3+(-4)+...과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100 이상이 되는지 구하는 문제
        int i = 0;
        int num = 0;
        while (num < 100) {
            i++;
            if(i % 2 != 0) {
                num += i;
            } else {
                num -= i;
            }
        }
        System.out.println("i가 몇이야? " + i);
        System.out.println("num이 몇이야?" + num);
    }
}
