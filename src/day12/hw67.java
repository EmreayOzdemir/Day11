package day12;
import java.util.*;
public class hw67 {

	public static void main(String[] args) {
		

		    Scanner scan = new Scanner(System.in);
		    String word1 = scan.next();
		    String word2 = scan.next();
		    //YOUR CODE HERE
		    
		    if(word1.length()!=3&&word2.length()!=3) {
		    	System.out.println("print cannot merge");
		    }else {

			int i = 0; 
			
				System.out.print(word1.charAt(i));
				System.out.print(word2.charAt(i));
				i++;
				
				System.out.print(word1.charAt(i));
				System.out.print(word2.charAt(i));
				i++; 
				
				System.out.print(word1.charAt(i));
				System.out.print(word2.charAt(i));
				i++;
					    	
		   }
	}

}
