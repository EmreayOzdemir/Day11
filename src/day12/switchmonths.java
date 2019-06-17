package day12;

import java.util.Scanner;

public class switchmonths {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number of the month:");
		int monthNumber=s.nextInt();
		String month="unknown";
		switch(monthNumber) {
	  case 1:
		  month="January";
	      break;
	      
	  case 2:
		  month="February";
	      break;
	  case 3:
		  month="March";
	      break;
	  case 4:
		  month="April";
	      break;
	  case 5:
		  month= "May";
	      break;
	  case 6:
		  month="June";
	      break;
	  case 7:
		  month="July";
	      break;
	  case 8:
		  month="August";
	      break;
	  case 9:
		  month="September";
	      break;
	  case 10:
		  month="October";
	      break;
	  case 11:
		  month="November";
	      break;
	  case 12:
		  month="December";
	      break;
	  default:
		  System.out.println("invalid Month number Please try again");
	      break;   
	      
	}
		System.out.println(month);
}
}