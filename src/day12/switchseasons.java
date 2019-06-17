package day12;

import java.util.Scanner;

public class switchseasons {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	
	System.out.println("enter the number of the month:");
	int monthNumber=s.nextInt();
	String season="unknown";
	switch(monthNumber) {
	   case 3:
	   case 4:
	   case 5:
		   season="spring";
		   break;
	   case 6:
	   case 7:
	   case 8:
		   season="summer";
		   break;
	   case 9:
	   case 10:
	   case 11:
		   season="fall";
		   break;
	   case 12:
	   case 1:
	   case 2:
		   
		   season="winter";
		   break;
		   default:
			   System.out.println("invalid enterence");
			   break;
	}
	System.out.println("the season is:"+season );
	}
	 if (!weekday || vacation) {
		    return true;
		  }
		  
		  return false;
		  !sleepIn(false, false) → true
		  sleepIn(true, false) → false
		  sleepIn(false, true) → true
}
