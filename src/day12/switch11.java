package day12;

import java.util.Scanner;

public class switch11 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
        String weather="sunny";
        String action;
       weather=scan.next();
       weather=weather.toLowerCase();
       //weather=weather.toUpperCase();
       switch(weather) {
       case "sunny":
    	   System.out.println("go to picnic");
    	   break;
       case "cloudy":
    	   System.out.println("go to walking");
    	   break;
       case "rainy":
    	   System.out.println("stay at home and read book");
    	   break;
       case "snowy":
    	   System.out.println("go to make a snowman");
    	   break;
       case "windy":
    	   System.out.println("stay safe");
    	   break;
    	   default:
    		   System.out.println("invalid weather value");
    		   break;
      
       }   
	
	
	}

}
