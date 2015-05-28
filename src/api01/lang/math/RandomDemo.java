package api01.lang.math;

import java.util.Scanner;

/*
 java.lang.Math 에 있는
 random() 메소드는 난수(임의의 수) 를 발생시킨다.
 */
public class RandomDemo {
	public static void main(String[] args) {
		int com = (int) (Math.random()*5)+1; // 앞의 3은 limit, 뒤의 1은 begin
		int myVal = 0;
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		while(true){
			System.out.println("1부터 5까지 임의의 숫자를 입력하세요.");
			i++;
			System.out.print(i + "번째 입력 : ");
			myVal = scanner.nextInt();
			
			if(myVal == com){
				System.out.println("컴난수 : " + com);
				System.out.println("빙고 정답입니다.");
				break; // 조건식을 true로 주게되면 무한루프를 돌수 있으므로 break; 를 건다.
			}
			// 횟수를 3회로 제한한다.
			if(i==3) {
				System.out.println("당신은 3회안에 실패하였습니다. ");
				break; 
			}
		}
	}
}
