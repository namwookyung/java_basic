package src.chapter02;

public class Literal {

	public static void main(String[] args) {
		// 변수에 타입이 있는 것처럼 리터럴(상수)에도 타입이 있다. 변수의 타입은 저장될 값의 타입(리터럴의 타입)에 의해 결정되므로,
		// 만일 리터럴에 타입이 없다면 변수의 타입도 필요없을 것이다.
		
		// 10진수 외에도 2, 8, 16진수로 표현된 리터럴을 변수에 저장할 수 있으며,
		// 16진수라는 것을 표시하기 위해 리터럴 앞에 접두사 '0x' 또는 '0X', 8진수의 경우에는 '0'을 붙인다.
		int octNum = 010;	// 8진수 10, 10진수로 8
		int hexNum = 0x10;	// 16진수 10, 10진수로 16
		
		// JDK1.7부터 정수형 리터럴의 중간에 구분자 '_'를 넣을 수 있게 되어서 큰 숫자를 편하게 읽을 수 있게 되었다.
		long big = 100_000_000_000L;	// long big = 100000000000L;
		long hex = 0xFFFF_FFFF_FFFF_FFFFL;	// long hex = 0xFFFFFFFFFFFFFFFFL;
		
		// 실수형에서는 float타입의 리터럴에 접미사 'f' 또는 'F'를 붙이고, double타입의 리터럴에는 접미사 'd' 또는 'D'를 붙인다.
		float pi = 3.14f;	// 접미사 f 대신 F를 사용해도 된다. 생략불가
		double rate = 1.618d;	// 접미사 d 대신 D를 사용해도 된다. 생략가능
		
		System.out.println("octNum : " + octNum);
		System.out.println("hexNum : " + hexNum);
		System.out.println("big : " + big);
		System.out.println("hex : " + hex);
		System.out.println("pi : " + pi);
		System.out.println("rate : " + rate);
	}

}
