package oop01.syntax;

import java.util.Scanner;

public class PayD {
	public static void main(String[] args) {
		
		//String hulkName = "헐크";
		//int hulkSalary = 200;
		
	//	Scanner scanner = new Scanner(System.in);

//		System.out.println("급여 입력 :");
		int hulkSalary = 200;
		
		
		/*
		String ironName = "아이언";
		int ironSalary = 300;
		String thorName = "토르";
		int thorSalary = 500;
		*/
		PayC hulkPay = new PayC();
		PayC hulk = new PayC();
		/*PayC ironPay = new PayC();
		PayC thorPay = new PayC();
		*/
		hulk.setName();
		
		hulkPay.setTaxVal(hulkSalary);
		hulkPay.setIncome(hulkSalary);
		/*ironPay.setTaxVal(ironSalary);
		ironPay.setIncome(ironSalary);
		thorPay.setTaxVal(thorSalary);
		thorPay.setIncome(thorSalary);
*/		
		System.out.println("=== "+hulk.getName()+"의 5월 급여내역 ===");
		System.out.println("급여 : " + hulkSalary);
		System.out.println("세금 : " + hulkPay.getTaxVal());
		System.out.println("실수령액 : " + hulkPay.getIncome());
		System.out.println();
		/*System.out.println("=== "+ironName+"의 5월 급여내역 ===");
		System.out.println("급여 : " + ironSalary);
		System.out.println("세금 : " + ironPay.getTaxVal());
		System.out.println("실수령액 : " + ironPay.getIncome());
		System.out.println();
		System.out.println("=== "+thorName+"의 5월 급여내역 ===");
		System.out.println("급여 : " + thorSalary);
		System.out.println("세금 : " + thorPay.getTaxVal());
		System.out.println("실수령액 : " + thorPay.getIncome());
		System.out.println();*/
		}
}
