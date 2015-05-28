package api01.lang.object;

public class EqualsDemo2 {
	public static void main(String[] args) {
		Person p1 = new Person("800101-1555555");
		Person p2 = new Person("800101-1555555");
		String result = "";
		result = (p1 == p2) ? "p1과 p2는 같은 사람" : "p1과 p2는 다른 사람";
		System.out.println("p1 == p2 결과값은 : " + result);
		// p1 == p2 결과값은 : p1과 p2는 다른 사람
		// 결과로 보아 == 는 hash code 주소값을 비교한다.
		
		result = (p1.equals(p2)) ? "p1과 p2는 같은 사람" : "p1과 p2는 다른 사람";
		System.out.println("p1.equals(p2) 결과값은 : " + result);
		// p1.equals(p2) 결과값은 : p1과 p2는 같은 사람
		// 결과로 보아 equals() (메소드)는 실제 리터럴 값을 비교한다.
	}
}
class Person{
	private String ssn; // 주민번호
	public Person(String ssn) {
		this.ssn = ssn;
		
	}
	// getter & setter 만들기
	// alt+shift+s - r
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	// equals overriding 
	// alt + shift + s - h
		
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Person){
			return ssn == ((Person)obj).ssn;
		}else{
			return false;
		}
	}
	
	
	
}