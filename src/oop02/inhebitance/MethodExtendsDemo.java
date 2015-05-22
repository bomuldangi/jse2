package oop02.inhebitance;
/*
 Date : 15-05-22
 Author : J
 Desc : 메소드 상속에 관한 예제
 */
/*
 Car 
   △
  |
 Hcar <- new (instantiate) : 인스턴스 생성 개념도
 */

class car2{
	String name = "자동차";
	public String gear(){
		return "수동기어";
	}
	
}
class Hcar2 extends car2{
	String brand = "현대";
	public String autoGear(){
		return "자동기어";
	}
}

public class MethodExtendsDemo {
	public static void main(String[] args) {
		Hcar2 h = new Hcar2();
		System.out.println(h.gear());
		System.out.println(h.autoGear());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
