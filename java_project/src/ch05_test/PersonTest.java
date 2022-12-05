package ch05_test;

public class PersonTest {
   
	 public static void main(String[] args) {
		  Person lgb = new Person();
		 // lgb.name="임근범";
		  lgb.height=171F;
		  lgb.weight=75F;
		  lgb.setName("이상용세터로추가했음");
		  lgb.showInfo();
		  System.out.println("get메서드로 이름호출"+lgb.getName());
		  //set 를 이용하여 name 값 설정하기
		 
		  
		  Person lgb2 = new Person("임근범");
		  lgb2.height=174F;
		  lgb2.weight=75F;
		  lgb2.setName("테스트중입니다");
		  System.out.println("테스트2: "+lgb2.getName());
		  
		  lgb2.showInfo();
		  
		  Person lgb3 = new Person("임근범",171F,75F);
		  lgb3.showInfo();
		  
//		  personKim.name = "김유신";
//		  personKim.weight = 85.5F;
//		  personKim.height = 180.0F;
//		
//		  Person personLee = new Person("이순신", 175, 75);
	 }
}
