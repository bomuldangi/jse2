package oop01.syntax;

public class KaupVO {
	// 필드
	private double height;
	private double weight;
	private int index;
	private String msg;
	
	// 생성자
	public KaupVO(double height, double weight) {
		this.height=height;
		this.weight=weight;
	}
	// getter & setter
	// alt + shift + s - r

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(double height, double weight) {
		this.index = (int) ((weight/(height*weight))*10000);
	}

	public String getMsg() {
		String msg = "";
		if(index > 30) {
			msg = "비만";
		}else if(index > 24){
			msg = "과체중";
		}else if(index > 20){
			msg = "정상";
		}else if(index > 15){
			msg = "저체중";
		}else if(index > 13){
			msg = "마름";
		}else if(index > 10){
			msg = "영양실조";
		}else {
			msg = "소모증";
		}
		
		
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	//alt+shift+s - S
	public String toString() {
		return "카우프 지수 [height=" + height + ", weight=" + weight + ", index="
				+ index + ", msg=" + getMsg() + "]";
	}
	
}
