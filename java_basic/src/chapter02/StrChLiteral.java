package src.chapter02;

public class StrChLiteral {

	public static void main(String[] args) {
		// 'A'와 같이 작은따옴표로 문자 하나를 감싼 것은 '문자 리터럴' 이라고 한다. 두 문자 이상은 큰 따옴표로 감싸야 하며 '문자열 리터럴'이라고 한다.
//		char ch = 'J';	// char ch = 'Java'; 이렇게 할 수 없다.
//		String name = "Java";	// 변수 name에 문자열 리터럴 "Java"를 저장
		
		// char 타입의 변수는 단 하나의 문자만 저장할 수 있으므로, 여러 문자(문자열)를 저장하기 위해서는 String 타입을 사용해야 한다.
		// 문자열 리터럴은 "" 안에 아무런 문자도 넣지 않는 것을 허용하며, 이를 빈 문자열(empty string)이라고 한다.
		// 그러나 문자 리터럴은 반드시 '' 안에 하나의 문자가 있어야 한다.
		String str = "";	// OK. 내용이 없는 빈 문자열
//		char ch = '';	// 오류. '' 안에 반드시 하나의 문자가 필요
		char ch = ' ';	// OK. 공백 문자(blank)로 변수 ch를 초기화
	
		// 원래 String은 클래스이므로 아래와 같이 객체를 생성하는 연산자 new를 사용해야 하지만 특별히 이와 같은 표현도 허용한다.
		String name = new String("Java");	// String 객체를 생성
//		String name = "Java";	// 위의 문장을 간단히

		System.out.println(str);
		System.out.println(ch);
		System.out.println(name);
	}
}
