package chapter04;

public class Exercise4_7 {
    public static void main(String[] args) {
        // 숫자로 이루어진 문자열 str이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하는 문제
        // 만일 문자열이 "12345"라면, '1+2+3+4+5'의 결과인 15가 출력되어야 한다.
        // Hint : String 클래스의 charAt(int i)을 사용
        String str = "12345";
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char c  = str.charAt(i);
            int num = c - '0';
            sum += num;
        }
        System.out.println("sum = " + sum);
    }
}
