package day12;

import java.util.Scanner;

public class resteaurantrating {

	
		  public static void main(String[] args) {
		   //WRITE YOUR CODE HERE



		  Scanner scan = new  Scanner(System.in);
		  System.out.println("Split:");
		  String split = scan.next();
		  System.out.println("Number of people:");
		  int numberOfPeople = scan.nextInt();
		  System.out.println("Check amount:");
		  double checkAmount = scan.nextDouble();
		  System.out.println("Service Quality:");
		  String serviceQuality = scan.next();
		  double tip=00;
		  String and = "unknown";
		   switch(serviceQuality){
		    case "Poor":
		      tip = checkAmount*0.05;
		      break;
		    case "Fair":
		      tip = checkAmount*0.1;
		      break;
		    case "Good":
		      tip = checkAmount*0.15;
		      break;
		    case "Great":
		      tip = checkAmount*0.2;
		      break;
		    case "Excellent":
		      tip = checkAmount*0.25;
		      break;
		      
		   }
		   switch (numberOfPeople){
		    case 1:
		    and = "&";
		    break;
		    case 2:
		    and = "&&";
		    break;
		    case 3:
		    and ="&&&";
		    break;
		    case 4:
		    and = "&&&&";
		    break;
		    case 5:
		    and ="&&&&&";
		    break;
		  }
		  
		   System.out.println("Number of people entered: "+ and);
		   System.out.println("Total to pay: " + (tip + checkAmount));
		     System.out.println("Total tip: " + tip);
		      System.out.println("Total per person: "+ ((checkAmount + tip)/numberOfPeople));
		    System.out.println("Tip per person: " + (tip/numberOfPeople));
		   
		  }
		}
