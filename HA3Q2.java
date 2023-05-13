/*
 Program: Write a java program that prompts the user to enter an integer for today’s day of the week 
 		  (Sunday is 0, Monday is 1… and Saturday is 6). Also prompt the user to enter the number of 
 		  days after today for a future day and display the future day of the week.
 Author name: SWASTIK MULLICK
 Registration no.: 2241013379
 */
import java.util.*;
public class HA3Q2 
{
	public static void main(String args[])
	{
		Scanner i=new Scanner(System.in);
		System.out.print("\nSUNDAY    [0]\nMONDAY    [1]\nTUESDAY   [2]\nWEDNESDAY [3]\nTHURSDAY  [4]\nFRIDAY    [5]\nSATURDAY  [6]"
				+ "\n\nEnter today's day: ");
		int ch1=i.nextInt();String c1="";
		switch (ch1)
		{
		case (0):
			c1="Sunday";break;
		case (1):
			c1="Monday";break;
		case (2):
			c1="Tuesday";break;
		case (3):
			c1="Wednesday";break;
		case (4):
			c1="Thursday";break;
		case (5):
			c1="Friday";break;
		case (6):
			c1="Saturday";break;
		}
		System.out.print("Now enter the number of days elapsed since today: ");
		int ch2=(i.nextInt()+ch1)%7;String c2="";
		switch (ch2)
		{
		case (0):
			c2="Sunday";break;
		case (1):
			c2="Monday";break;
		case (2):
			c2="Tuesday";break;
		case (3):
			c2="Wednesday";break;
		case (4):
			c2="Thursday";break;
		case (5):
			c2="Friday";break;
		case (6):
			c2="Saturday";break;
		}
		System.out.println("Today is "+c1+" and the future day is "+c2+".");
		i.close();
	}
}
