package day12;

import java.util.Scanner;

public class switch3 {

	public static void main(String[] args) {
System.out.println("enter two numbers please:");
		
		Scanner scan=new Scanner(System.in);

		int num1=scan.nextInt();
		int num2=scan.nextInt();
		System.out.println("enter the operation:");
		 String operator=scan.next();
		String addition;
		operator=(operator.equals("+"))? ("the addition result is "+(num1+num2)):(operator.equals("-"))? ("the subtraction result is "+(num1-num2)):(operator.equals("/"))?("the division result is "+(num1/num2)):(operator.equals("*"))?("the multiplication result is "+(num1*num2)):"invalid operation";
		System.out.println(operator);

	}

}
