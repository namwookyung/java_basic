package chapter04;

import java.util.Scanner;

public class While_3 {
    public static void main(String[] args) {
        int num = 0, sum = 0;
        System.out.print("숫자를 입력하세요. (예 : 12345) > ");

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        num = Integer.parseInt(tmp);

        while (num != 0) {
            // num을 10으로 나눈 나머지 sum에 더함
            sum += num % 10;    // sum = sum + num % 10;
            System.out.printf("sum = %3d num = %d%n", sum, num);

            num /= 10;  // num = num / 10; num을 10으로 나눈 값을 다시 num에 저장
        }
        System.out.println("각 자리수의 합 : " + sum);
    }
}
