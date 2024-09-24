package src.chapter04;

public class While_1 {
    public static void main(String[] args) {
        int i = 5;

        while(i-- != 0) {
            System.out.println(i + " - I can do it.");
        }

        System.out.println("첫 번째 while문 실행 끝");
        System.out.println("i의 값 : " + i);

        while(i++ != 4) {
            System.out.println(i + " - 후위 증가.");
        }

        System.out.println("두 번째 while문 실행 끝");
        System.out.println("i의 값 : " + i);

        int j;
        for (j = 1; j <= 5; j++) {
            System.out.println("j 후위 증가 - " + j);
        }

        System.out.println("첫 번째 for문 실행 끝");
        System.out.println("j의 값 : " + j);

        for (; j >= 0; j--) {
            System.out.println("j 후위 감소 - " + j);
        }

        System.out.println("두 번째 for문 실행 끝");
        System.out.println("j의 값 : " + j);
    }   // main의 끝
}
