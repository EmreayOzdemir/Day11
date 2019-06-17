package day12;

import java.util.Scanner;

public class switch4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter day num please: ");
		int dayNum=s.nextInt();
	    String dayWord = "unknown";
	    
	   
	    switch(dayNum) {
	    case 1:
			dayWord = "monday";
			break;
		
		case 2:
			dayWord = "Tuesday";
			break;
		case 3:
			dayWord = "Wednesday";
			break;
		case 4:
			dayWord = "Thursday";
			break;
		case 5:
			dayWord = "Friday";
			break;
		case 6:
			dayWord = "Saturday";
			break;
		case 7:
			dayWord = "Sunday";
			break;
		 default:
  		   System.out.println("invalid operation");
  		   break;
	    
	    }
	    System.out.println("the day is:" +dayWord);
	}
	   

}
