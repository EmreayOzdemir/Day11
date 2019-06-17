package day12;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		  Scanner scan=new Scanner(System.in);
          String weather="sunny";
          String action;
         weather=scan.next();
       action= (weather.equals("sunny"))? "go out":(weather.equals("cloudy"))? "stay at home":"go to sleep";
        
          System.out.println(action);
          
	}
}
