package src.chapter03;

public class Exercise3_5 {

	public static void main(String[] args) {
		// 변수 num의 값에 따라 '양수', '음수', '0'을 출력하는 코드
		// 삼항 연산자를 이용해서 완성해야 한다.
		// 힌트 : 삼항 연산자를 두번 사
		int num = 10;
		System.out.println(num > 0 ? "양수" : (num < 0 ? "음수" : "0"));	// 실행 결과 : 양수
	}
}