import java.util.Scanner;
class Prime1To100 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	System.out.println("Enter starting value : ");
	int Start = sc.nextInt();
	System.out.println("Enter ending value : ");
	int End = sc.nextInt();
	
	for(int i=Start;i<=End;i++) {
		int count=0;
		for(int j =1;j<=i;j++) {
			if(i%j==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println(i+" is prime number");
		}
	}

	}
}
