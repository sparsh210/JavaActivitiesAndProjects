/*  In this program I will be asking the user what is their occupation
 *  and how much money they make in a year.
 *  (without using methods)
 */
import java.util.*;
public class InfoFromKeyboard {
	public static void main(String[] args) {
		Scanner keyb = new Scanner(System.in);
		System.out.println("What is your job?: ");
		String job = keyb.nextLine();
		System.out.println("How much money do you make in a year?: ");
		float salary = Float.parseFloat(keyb.nextLine());
		System.out.println("Hi, your occupation is a " + job + " and you make $" + salary +  " in a year.");
		
	}

}
