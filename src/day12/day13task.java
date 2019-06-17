package day12;

import java.util.Scanner;

public class day13task {

	public static void main(String[] args) {
	
		
		 Scanner scan=new Scanner(System.in);
	       
	       System.out.println("Name1: ");
	       
	       String name1=scan.next();
	       System.out.println("Name2: ");
	       String name2=scan.next();
	       System.out.println("Name3: ");
	       String name3=scan.next();
	       
	       if(name1.length()>name2.length()){
	          System.out.println(name1.charAt(1));
	         
	       }else{
	          System.out.println(name1.charAt(2));
	          
	       }
	}


}
