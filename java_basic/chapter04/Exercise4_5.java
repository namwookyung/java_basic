package chapter04;

public class Exercise4_5 {
    public static void main(String[] args) {
        // for문을 while문으로 변경하는 문제
//        for (int i = 0; i <= 10; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        int i = 0;
        while (i <= 10) {
            int j = 0;
            while(j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
