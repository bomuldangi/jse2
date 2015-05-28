package api01.lang.string;
/*
 java.lang.String 에서
 substring(n) 은 n부터 끝까지 잘라낸다.
 substring(n,m) 은 n부터 m전까지 잘라낸다. (n<=x<m)
 */
public class SubstringDemo {
	public static void main(String[] args) {
		String str = "Hello Java";
		System.out.println(str.substring(6));
		System.out.println(str.substring(6, 8));
	}
	
}
