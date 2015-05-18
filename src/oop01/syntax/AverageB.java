package oop01.syntax;

public class AverageB {
	// 필드 선언 ( 인스턴스 변수 )
	String name;
	int kor;
	int eng;
	int tot;
	double avg;
	
	// 이름 저장 기능
	public void setName(String name){ // 메소드 괄호안에 있는것을 parameter라 부른다.
		this.name = name;				 		// this : 인스턴스 변수임을 알려주기위해 사용.
		//( this.parameter = parameter : local 변수를 인스턴스 변수에 넣을수 있는 유일한 방법.
	}
	public static void main(String[] args) {
	
		// 학생 객체 생성 및 메모리 할당
		AverageA hulk = new AverageA();
		AverageA iron = new AverageA();
		AverageA hawk = new AverageA();
		
		// 이름 저장
		hulk.name = "헐크";
		iron.name = "아이언";
		hawk.name = "호크";
	
		// 점수 저장
		hulk.kor = 100;
		hulk.eng = 80;
		
		iron.kor = 50;
		iron.eng = 90;
		
		hawk.kor = 20;
		hawk.eng = 40;
		
		//총점, 평균 계산
		hulk.tot = hulk.eng + hulk.kor;
		hulk.avg = hulk.tot /2;
		
		iron.tot = iron.eng + iron.kor;
		iron.avg = iron.tot /2;
		
		hawk.tot = hawk.eng + hawk.kor;
		hawk.avg = hawk.tot /2;
		
		// 출력
		System.out.println("===" + hulk.name + "의 성적표===");
		System.out.println("국어 : " + hulk.kor);
		System.out.println("영어 : " + hulk.eng);
		System.out.println("합계 : " + hulk.tot);
		System.out.println("평균 : " + hulk.avg);
		System.out.println();
		System.out.println("===" + iron.name + "의 성적표===");
		System.out.println("국어 : " + iron.kor);
		System.out.println("영어 : " + iron.eng);
		System.out.println("합계 : " + iron.tot);
		System.out.println("평균 : " + iron.avg);
		System.out.println();
		System.out.println("===" + hawk.name + "의 성적표===");
		System.out.println("국어 : " + hawk.kor);
		System.out.println("영어 : " + hawk.eng);
		System.out.println("합계 : " + hawk.tot);
		System.out.println("평균 : " + hawk.avg);
		System.out.println();
		
		
	}
}
