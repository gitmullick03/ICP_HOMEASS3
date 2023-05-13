/*
 Program: Write a java program that prompts the user to enter an integer and determines whether it is 
 		  divisible by 5 and 6, whether it is divisible by 5 or 6, and whether it is divisible 
 		  by 5 or 6, but not both.
 Author name: SWASTIK MULLICK
 Registration no.: 2241013379
 */
import java.util.*;
public class HA3Q4 
{
	public static void main(String z[]) 
	{
		Scanner j=new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int num=j.nextInt();boolean a_nd,o_r,or_and;
		if (num%5==0 && num%6==0)
			a_nd=num%5==0 && num%6==0;
		else
			a_nd=num%5==0 && num%6==0;
		if (num%5==0 || num%6==0)
			o_r=num%5==0 || num%6==0;
		else
			o_r=num%5==0 || num%6==0;
		if ((num%5==0 && num%6!=0)||(num%5!=0 && num%6==0))
			or_and=(num%5==0 && num%6!=0)||(num%5!=0 && num%6==0);
		else
			or_and=(num%5==0 && num%6!=0)||(num%5!=0 && num%6==0);
		System.out.println("Is "+num+" divisible by 5 and 6? "+a_nd);
		System.out.println("Is "+num+" divisible by 5 or 6? "+o_r);
		System.out.println("Is "+num+" divisible by 5 or 6, but not both? "+or_and);
		j.close();
	}
}