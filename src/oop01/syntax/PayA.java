package oop01.syntax;

 public class PayA {
	private String name;
	private int salary; // 급여
	public static final double TAX=0.1; // 세율
	private int income; // 실급여 = 급여 - 급여*세율
	private int taxVal; // 세금
	
	// 세금 저장
	public void setTax(int A){ //setter : 필드에다 값을 저장하겠다.
    //System.out.println("payA에 넘어온 파라미터값 :"+ A);
		this.taxVal = (int) (A*TAX);
	}
	// 실급여 저장
	public void setIncome(int salary){
		this.income = salary - taxVal;
	}
	
	public int getTax(){ // getter 필드에 있는 값을 읽어오겠다.
		return taxVal;
	}
	public int getIncome(){
		return income;
	}
}
