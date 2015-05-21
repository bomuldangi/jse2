package oop01.syntax;

public class PayB {
	public static void main(String[] args) {
		
		int hulkSalary = 200;
		int ironSalary = 300;
		int thorSalary = 500;
		
		PayA hulkPay = new PayA();
		hulkPay.setTax(hulkSalary);
		hulkPay.setIncome(hulkSalary);
		
		PayA iron = new PayA();
		PayA thor = new PayA();
		
		System.out.println("=== 헐크의 5월 급여내역 ===");
		
		System.out.println("급여 : " + hulkSalary);
		System.out.println("세금 : " + hulkPay.getTax());
		System.out.println("실수령액 : " + hulkPay.getIncome());
		System.out.println();
		/*
		System.out.println("=== 아이언의 5월 급여내역 ===");
		System.out.println("급여 : "+ iron.salary);
		System.out.println("세금 : "+ iron.tax);
		System.out.println("실수령액 : "+ iron.income);
		System.out.println();
		System.out.println("=== 토르의 5월 급여내역 ===");
		System.out.println("급여 : "+ thor.salary);
		System.out.println("세금 : "+ thor.tax);
		System.out.println("실수령액 : "+ thor.income);
		System.out.println();
	*/}
}
