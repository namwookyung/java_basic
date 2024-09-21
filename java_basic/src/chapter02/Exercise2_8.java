package src.chapter02;

public class Exercise2_8 {

	public static void main(String[] args) {
		// 변수 x, y, z의 값을 서로 바꾸는 문제
		int x = 1;
		int y = 2;
		int z = 3;
		
		// 문제 START
		int temp = x;
		x = y;
		y = z;
		z = temp;
		// 문제 END
		
		System.out.println("x = " + x);	// x = 2
		System.out.println("y = " + y);	// y = 3
		System.out.println("z = " + z);	// z = 1
	}
}
