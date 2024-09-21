package chapter03;

public class Exercise3_3 {

	public static void main(String[] args) {
		// 변수 num의 값 중에서 백의 자리 이하를 버리는 코드이다.
		// 변수 num의 값이 '456'이라면 '400'이 되고, '111'이라면 '100'이 되는 예제
		int num = 456;
		System.out.println(num / 100 * 100);	// 400
	}
}
