package ch2_1017;

public class Variable1 {

	public static void main(String[] args) {

		int level;              //정수형 변수 level을 선언
		level = 10;		//level 변수에 10을 대입
		// 초기화 : 최초에 변수에 값을 할당 하는것 말함.
	
		byte b1 = 12; // 변수를 선언과 동시에 값을 할당.
		
		//기본 데이터 타입 primtitive type,
		// 기본 타입을 제외한 나머지를 참조형 타입. (주로 참조형을 많이 사용합니다.)
		// 참자형 타입 : 클래스 타입.
		// class person
		// 참조형 타입으로 선언 하게 되면
		// person p1; 선언만.
		// p1 = new person(); 기본 생성자 호출.
		// 생성자의 역할은 값을 초기화 하는 역할.
		System.out.println(level); 
		System.out.println(b1);
		System.out.println("내용 테스트 중");
		// int i = 1000000000;
		// 해당 데이터 타입의 메모리 크기 및 공간에 대해서 암기등 이렇게 할 필요 없음.
		// 컴파일러가 알아서 1차 문법 검사 해줍니다.
		
	}

}
