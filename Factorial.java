//factorial value

package hw;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter the no to get factorial");
		int n=sn.nextInt();
		int f=1;
		for(int cnt=1;cnt<=n;cnt++)
		{
			f=f*cnt;
		}
		
		System.out.println("the factorial of the given no is = " +f);
		
	}

}
