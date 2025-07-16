class Fibonacci 
{
	public static void main(String[] args) 
	{

		int a =0;
		int b = 1;

		
		System.out.println(a+","+b);
		
		

		for(int i=1; i<=8; i++) {


			int sum =a+b;

			a = b;
			b=sum;

		System.out.print(","+sum);
		

		}
	}
}
