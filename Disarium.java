class Disarium 
{
	public static void main(String[] args) 
	{
		int num =27;
		int num1 = num;
		int num2 = num;
		int count = 0;
		int sum = 0;
		while(num!=0){

			count++;
			num = num/10;
		}
		
		while(num1! = 0)
		{
			int rem= num1%10;
			int power = 1;
			for(int i =0; i<=count;i++)
			{
				power= power*rem;
			}
			sum= sum+power;
			num1= num1/10;
		}





		System.out.println("Hello World!");
	}
}
