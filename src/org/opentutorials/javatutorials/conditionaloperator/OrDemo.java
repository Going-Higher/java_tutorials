package org.opentutorials.javatutorials.conditionaloperator;

//||(or)는 좌우항 중에 하나라도 true라면 전체가 true가 되는 논리 연산자다.

public class OrDemo {//123

	public static void main(String[] args) {
		if (true || true) {
			System.out.println(1);
		}
		if (true || false) {
			System.out.println(2);
		}
		if (false || true) {
			System.out.println(3);
		}
		if (false || false) {
			System.out.println(4);
		}

	}

}
