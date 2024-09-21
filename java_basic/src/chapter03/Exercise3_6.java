package chapter03;

public class Exercise3_6 {

	public static void main(String[] args) {
		// 화씨(Fahrenheit)를 섭씨(Celcius)로 변환하는 코드이다.
		// 변환 공식이 'C = 5 / 9 X (F - 32)' 라고 할 때, 알맞은 코드를 넣어햐 한다.
		// 단, 변환 결과값은 소수점 셋째자리에서 반올림 해야 한다.(Math.round()를 사용하지 않고 처리할 것)
		int fahrenheit = 100;
		float celcius = (int)((5 / 9f * (fahrenheit - 32)) * 100 + 0.5) / 100f;
		
		System.out.println("Fahrenheit : " + fahrenheit);	// Fahrenheit : 100
		System.out.println("Celcius : " + celcius);	// Celcius : 37.78
	}
}