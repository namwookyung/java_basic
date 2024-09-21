package src.chapter02;

public class Constant {
	public static void main(String[] args) {
		// 상수(constant)는 변수와 마찬가지로 '값을 저장할 수 있는 공간'이지만, 변수와 달리 한번 값을 저장하면 다른 값으로 변경할 수 없다.
		// 상수를 선언하는 방법은 변수와 동일하며, 단지 변수의 타입 앞에 키워드 'final'을 붙여주기만 하면 된다.
		final int MAX_SPEED = 10;
		
		// 상수에 값이 저장된 후에는 상수의 값을 변경하는 것이 허용되지 않는다.
		final int MAX_VALUE;	// 정수형 상수 MAX_VALUE를 선언
		MAX_VALUE = 100;	// OK. 상수에 처음으로 값 저장
		// MAX_VALUE = 200;	// 오류. 상수에 저장된 값을 변경할 수 없음
		
		System.out.println(MAX_SPEED);
		System.out.println(MAX_VALUE);
	}
}