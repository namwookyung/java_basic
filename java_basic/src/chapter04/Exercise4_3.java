package src.chapter04;

public class Exercise4_3 {
    public static void main(String[] args) {
        // 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하는 문제
        int i;
        int j;
        int total = 0;

        for (i = 1; i <= 10; i++) {
            for (j = 1; j <= i; j++) {
                total += j;
            }
            System.out.println("total의 값 : " + total);
        }
    }
}
