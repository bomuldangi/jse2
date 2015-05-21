package oop01.syntax;

import java.util.Scanner;

public class PayC {
	private String name;
	private int salary; // 급여
	public static final double TAX=0.1; // 세율
	private int income; // 실급여 = 급여 - 급여*세율
	private int taxVal; // 세금
	
	public String getName() {
		return name;
	}
	public void setName() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		this.name = scanner.nextLine();
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int salary) {
		this.income = salary-taxVal;
	}
	public int getTaxVal() {
		return taxVal;
	}
	public void setTaxVal(int salary) {
		this.taxVal = (int) (salary*TAX);
	}
	
	
	
}
