package day12;

import java.util.Scanner;

public class switch2 {

	public static void main(String[] args) {
		System.out.println("enter two numbers please:");
		
		Scanner scan=new Scanner(System.in);

		int num1=scan.nextInt();
		int num2=scan.nextInt();
		System.out.println("enter the operation:");
		String operator=scan.next();
		switch(operator.toLowerCase()) {
		case "addition":
			System.out.println("the result is:" +(num1+num2));
			break;
		case "subtraction":
			System.out.println("the result is:" +(num1-num2));
			break;
		case "multiplication":
			System.out.println("the result is:" +(num1*num2));
			break;
		case "division":
			System.out.println("the result is:" +(num1/num2));
			break;
		 default:
  		   System.out.println("invalid operation");
  		   break;
		}
	}

}
