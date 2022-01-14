//finding power value for two input values

package hw;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		int ans=1;
		System.out.println("enter the 2 positive no");
		int n1=sn.nextInt();
		int n2=sn.nextInt();
		for(int cnt=1;cnt<=n2;cnt++)
		{
			ans=ans*n1;
			
		}
		System.out.println("the answer = "+ans);

	}

}
