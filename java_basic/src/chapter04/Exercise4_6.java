package src.chapter04;

public class Exercise4_6 {
    public static void main(String[] args) {
        // 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램 작성하는 문제
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                if (i + j == 6) {
                    System.out.println("i : " + i + ", j : " + j);
                }
            }
        }
    }
}
