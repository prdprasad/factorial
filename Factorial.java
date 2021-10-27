//program to find find the factorial using loop and recursion
import java.util.*;
class Factorial{

	static int factorial(int n){
		if(n==0)
		return 1;
		int i = n, fact = 1;
		while (n/i != n) {
			fact = fact * i;
			i--;
		}
		return fact;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a Number: ");
		int num = sc.nextInt();
		System.out.println("Factorial of " + num+ " is " + factorial(num));
	}
}
