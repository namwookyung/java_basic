package chapter03;

public class StringEquals {

	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = new String("abc");
		
		// equals()는 두 문자열의 내용이 같으면 true, 다르면 false를 결과로 반환
//		boolean result = str.equals("abc");	// 내용이 같으므로 result에 true가 저장
		
		System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc" == "abc");
		System.out.printf(" str1==\"abc\" ? %b%n", str1 == "abc");
		System.out.printf(" str2==\"abc\" ? %b%n", str2 == "abc");
		System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc"));
		System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
		System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));
		System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC"));
	}

}
