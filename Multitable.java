//multiplication table for user defined value

package hw;

import java.util.Scanner;

public class Multitable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter the no u want multiplication table");
		int n=sn.nextInt();
		for(int cnt=1,m;cnt<=10;cnt++)
		{
		   	m=cnt*n;
		   	System.out.println(cnt +"*"+ n +"="+ m);
		}

	}

}
