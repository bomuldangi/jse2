package cmm03.flow;

import java.util.Scanner;


public class No07_ManOrWoman {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" �Է� ");
		
		String ssn = scanner.nextLine();
		char ch = ssn.charAt(7);
		
		if(ch == '1' || ch=='3'){
			System.out.println(" ���� ");
		}else if(ch =='2' || ch=='4'){
			System.out.println(" ���� ");
		}else{
			System.out.println("x");
		}
	}

}
