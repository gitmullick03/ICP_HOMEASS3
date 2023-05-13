/*
 Program: Write a java program that plays the popular scissor-rock-paper game. (A scissor can cut
		  a paper, a rock can knock a scissor, and a paper can wrap a rock.) The program
		  randomly generates a number 0, 1, or 2 representing scissor, rock, and paper. The
		  program prompts the user to enter a number 0, 1, or 2 and displays a message indicating
		  whether the user or the computer wins, loses, or draws.
 Author name: SWASTIK MULLICK
 Registration no.: 2241013379
 */
import java.util.*;
public class HA3Q1 
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int cg=(int)((3)*Math.random());
		System.out.print("scissor(0), rock(1), paper(2): ");int ug=in.nextInt();
		if (cg==0 && ug==0)
			System.out.println("The computer is scissor. You are scissor. It is a draw.");
		else if (cg==1 && ug==1)
			System.out.println("The computer is rock. You are rock. It is a draw.");
		else if (cg==2 && ug==2)
			System.out.println("The computer is paper. You are paper. It is a draw.");
		else if (cg==0 && ug==1)
			System.out.println("The computer is scissor. You are rock. You won.");
		else if (cg==0 && ug==2)
			System.out.println("The computer is scissor. You are paper. Computer won.");
		else if (cg==1 && ug==0)
			System.out.println("The computer is rock. You are scissor. Computer won.");
		else if (cg==1 && ug==2)
			System.out.println("The computer is rock. You are paper. You won.");
		else if (cg==2 && ug==0)
			System.out.println("The computer is paper. You are scissor. You won.");
		else if (cg==2 && ug==1)
			System.out.println("The computer is paper. You are rock. Computer won.");
		in.close();
	}
}
