package api01.lang.string;
/*
 toString() : String 인스턴스에 저장되어 있는 문자열을 리턴
 */
public class ToStringDemo {
	public static void main(String[] args) {
		double d = 85322.812d; // 끝에 있는 d는 double 형을 의미
		String s = Double.toString(d);
		
		System.out.println("s의 값은 : " + s);
		
		int dot = s.indexOf('.');
		System.out.println(s.indexOf('.'));
		System.out.println(dot + " : digits before decimal point ."); // 소수점 앞의 자리수
		System.out.println(s.length() - (dot+1) + " : digits after decimal point ."); // 소수점 뒷자리 자리수
	}
}
