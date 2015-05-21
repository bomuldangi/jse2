package oop01.syntax;

public class AverageC {
	// 필드 선언 ( 인스턴스 변수 )
	String name;
	int kor;
	int eng;
	int tot;
	double avg;
	
	// 이름 저장 기능
	public void setName(String name){ // 메소드 괄호안에 있는것을 parameter라 부른다.
									  // parameter = 변수선언
		this.name = name;	// this : 인스턴스 변수임을 알려주기위해 사용.
		//( this.parameter = parameter ) : local 변수를 인스턴스 변수에 넣을수 있는 유일한 방법. 
	}
	// 점수를 저장하는 기능
	public void setKor(int a){
		this.kor = a;
	}
	public void setEng(int b){
		this.eng = b;
	}
	// total를 구하는 기능
	public void setTot(int c, int d){
		this.tot = c+d;
	}
	// 평균점수를 구하는 기능 : overloading
	public void setAvg(int e, int f){
		this.avg = e+f/2;
	}
	// 평균점수를 구하는 기능 2
	public void setAvg(int g){
		this.avg = g/2;
	}

}
