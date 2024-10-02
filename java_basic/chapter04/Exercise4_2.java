package chapter04;

public class Exercise4_2 {
    public static void main(String[] args) {
        // 1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하는 문제
        int i;
        int num = 0;
        for (i = 1; i <= 20; i++) {
            if (!(i % 2 == 0 || i % 3 == 0)) {
                num += i;
            }
            System.out.println(i + "로 연산했을 때, num의 값 : " + num);
        }
        System.out.println("연산이 끝난 num의 값 : " + num);
    }
}
