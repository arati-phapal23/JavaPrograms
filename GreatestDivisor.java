class GreatestDivisor 

//to find the greatest common divisor
{
	public static void main(String[] args) 
	{
		int num=6;
		int num1=8;
		int gcd =0;

		for(int i=1;(i<=num && i<=num1);i++)
			{

			if(num%i==0 && num1%i==0)
			{

			gcd=i;

			}
		}


		System.out.println("The Greatest common Divisor is" +gcd);
	}
}
