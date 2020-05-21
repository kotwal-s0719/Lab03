/**
 * 
 */
package myJavaProject;

import java.util.Scanner;

/**
 * @author user
 *
 */
public class myAppTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello Software Engineering World");
		
		Scanner input = new Scanner(System.in);
		
		 System.out.print("Input the starting number of the range: "); 
	        int rstartNum = input.nextInt(); 
	        System.out.print("Input the ending number of the range: "); 
	        int rendnum = input.nextInt(); 
		    int random_num = rstartNum + (int)(Math.random() * ((rendnum - rstartNum) + 1));
		    System.out.println(random_num);

	}

}
