package prooject2;
import java.util.*;

public class oddEven {
	public static void main (String[]args) {
		System.out.println("Let's play a game called Odds and Evens");
		System.out.println("What's your name?");
		Scanner input = new Scanner(System.in);
		String name = input.next();
		System.out.println("hi " + name + " What do you choose? (O)dds or (E)vens");
		Scanner input1 = new Scanner(System.in);
		String choose = input1.next();
    
    
	if (choose.equals("O")) {
		System.out.println(name + " has picked odds! The computer will be evens.");
	}
  
	else if (choose.equals("E")) {
		System.out.println(name + " has picked evens! The computer will odds." );
	}
  
	else {
		System.out.println("invalid choice, choose between O or E");
		}
	System.out.println("--------------------------------------------------");
  
	System.out.println("How many fingers do you put out?");
	Scanner input2 = new Scanner(System.in);
	int finger = input2.nextInt();
	Random rand = new Random();
	int computer = rand.nextInt(6);
	System.out.println("The computer plays number " + computer);
	System.out.println("--------------------------------------------------");
	int sum = finger + computer;
	System.out.println("the sum of computer and user is " + sum);
  
	if (sum % 2 == 0) {
		System.out.println("sum is EVEN");
    
		if (finger % 2 == 0) {
			System.out.println(name + " IS THE WINNER");
		}
    
		else {
			System.out.println("SORRY, BETTER LUCK NEXT TIME");
		}
	}
  
	else if (sum % 2 != 0) {
		System.out.println("sum is ODD");
    
		if (finger % 2 != 0) {
			System.out.println(name + " IS THE WINNER");
		}
    
		else {
			System.out.println("SORRY, BETTER LUCK NEXT TIME");
		}
		}
    }
}
			
		
