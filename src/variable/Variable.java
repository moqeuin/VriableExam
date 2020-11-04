package variable;

public class Variable {

	
	public static void main(String[] args) {
		
		
		//1. 변수(variable), 값 저장 후 변경가능
		
		// 숫자형
		int x = 3; // 정수
		double b = 2.1; // 실수, 오차없이 15자리
		
		// 문자형
		char ch = 'A';
		String st = "str";
		
		//2. 상수(constant), 값 저장 후 변경불가능
		
		final int y = 5;
		
		//3. 리터럴(literal), 그 자체로 값을 의미
		
		// 숫자 리터럴, 대입할 때 표현하는 방식이 달라진다.
		
		// 정수형
		int c = 12; // 12, 접미사가 없으면 int타입
		long d = 32L; // l 또는 L
		// 실수형
		float f = 32.1F; // F 또는 f, 소수점 7자리에서 반올림해서 저장
		
		// 문자 리터럴
		
		char ch2 = 'b';
		//char ch3 = ''; // 허용x
		
		// 문자열 리터럴 
		// String은 클래스이기 때문에 선언할 때 new 연산자를 사용해야 하지만 예외적로 리터럴방식도 가능
		
		String st2 = new String("ABC");
		String st3 = "str2"; // str2
		String st4 = ""; // 허용o
		
		//4. 문자열결합
		System.out.println( 7 + 7 + "stt"); // 출력결과 : 14stt
		// 문자열 + any type , any type + 문자열 둘 다 문자열로 변환돼서 출력된다.
		// 왼쪽에서 오른쪽으로 연산이 되기 때문에 순서에 따라 결과값이 달라진다.
		
		//5. 자료형 : 값의 종류에 따라서 저장될 크기와 저장형식을 정의한 것
		
		// 기본형, 실제 data를 저장
		
		/*
		 	기본형의 종류
		 	논리형 : 	boolean - 1byte
		 	문자형 : 	char - 2byte
		 	정수형 : 	byte - 1byte
					short - 2byte
					int - 4byte ( 32bit == -2(31) ~ 2(31) - 1  == 1024*1024*1024*2 = 2(30)) 
					long - 8byte
			실수형:	float - 4byte
					double - 8byte		 	
		*/
		// 참조형, 객체의 주소를 저장, 객체의 종류에 따라서 type이 구분된다
		
		//6. printf, 다른형식으로 출력하고 싶을 때 사용, 지시자를 이용해서 변환시킬 수 있다.
		
		/*
		 %d : 10진 정수
		 %x : 16진수 정수
		 %f : 부동소수점
		 %c : 문자
		 %s : 문자열
		 */
		
		float f1 = .20f; // 0.200000
		float f2 = 1e3f; // 1000.000000 , e 지수표현법으로 앞에 3은 0을 3개 붙인다
		System.out.printf("f1 : %f f2 : %f\n",f1, f2);
		System.out.printf("f1 : %f f2 : %f\n",f1, f2);
		// 개행이 포함되지 않기 때문에 따로 지시자를 넣어줘야한다.
		
		// 타입 간 형변환
		System.out.println((char)(3 + '0')); // 숫자 -> 문자
		System.out.println('3' - '0'); // 문자 -> 숫자
		System.out.println("asd".charAt(1)); // 문자열 -> 문자 , 출력 : s
		System.out.println('3' + ""); // 문자 -> 문자열
		System.out.println('a' + 'b'); // 문자연산시 아스키코드값으로 연산 , 출력결과 : 195
		System.out.println('j' + "java"); // jjava
		System.out.println(true + ""); // true
		System.out.println('1' + 2); // 아스키코드 + 2 출력결과 : 51
	}

}
