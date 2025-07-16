// Write a Java Program for PerfectNumber from 1 to 100

import java.util.Scanner;

class PerfectNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
	int num=sc.nextInt();


	int sum=0;
	for(int i=1;i<num;i++) {

		if(num%i==0) {
			 sum = sum+i;
		}
		
	}
	if(num==sum) {
		System.out.println("The given num is perfect number");
	}
	else {
		System.out.println("The given num is not perfect number");
	}
}

}


	

