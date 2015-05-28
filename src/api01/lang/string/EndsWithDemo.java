package api01.lang.string;
/*
 endsWith("s") : String 값이 s로 끝나는지를 체크
 */
public class EndsWithDemo {
	public static void main(String[] args) {
		System.out.println(("Hello.txt".endsWith("txt")) ? 
							"txt 파일입니다." : "txt 파일이 아닙니다.");
	}
}
