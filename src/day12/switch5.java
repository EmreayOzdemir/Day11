package day12;

import java.util.Scanner;

public class switch5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter day num please: ");
		int dayNum=s.nextInt();
	    String dayWord = "unknown";
	    
	   
	    switch(dayNum) {
	    case 1:
	    case 2:
	    case 3:
	    case 4:
	    case 5:
	    	dayWord = "Weekdays";
			break;
	    case 6:
	    case 7:
			dayWord = "Weekends";
			break;
	    default:
	  		   System.out.println("invalid operation");
	  		   break;
	    	
	    }
	    System.out.println("the day is:" +dayWord);
	}

}
