package cmm03.flow;

import java.util.Scanner;

public class No07_ManOrWoman2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" �Է� ");
		
		String ssn = scanner.nextLine();
		char ch = ssn.charAt(7);
		
		switch (ch) {
		case '1':	System.out.println("����");	break;
		case '2':	System.out.println("����");	break;
		case '3':	System.out.println("����");	break;
		case '4':	System.out.println("����");	break;
		
		default:System.out.println("X");
			break;
		}
	}

}
