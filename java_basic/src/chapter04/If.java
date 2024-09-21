package chapter04;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		// scanner로 입력 받은 값에 대해 조건문으로 출력 문구 다르게 하
		System.out.print("점수를 입력하세요 : ");
		
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		
		if (score > 60) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
	}
}