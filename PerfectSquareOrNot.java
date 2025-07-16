//WAJP TO CHECK THE GIVEN NUMBER IS PERFECT SQUARE OR NOT

import java.util.Scanner;
class PerfectSquareOrNot 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

	System.out.println("Enter number : ");
	int num = sc.nextInt();
	int a=0;
	//condition can be i*i<=num


	for(int i=1;i<=num/2;i++) {
		 if(num==i*i) {
			 a=i*i;
			
			 break;
		 }
	}
	if(a==num) {
		System.out.println(num+ " is perfect square number");
	}
	else {
		System.out.println(num+ " is not perfect square number");
	}
}

		
}


2nd Way-
public static void main(String[] args) 
	{
		int num=120;
		int sqrt=0;
		int res=0;

		for(int i=1; i*i<=num; i++){

			if(i*i==num){

				sqrt=i;
				res=i*i;
				break;
			}
		}        
		        if(num==res){
				System.out.println(num+" Perfect Square"+ i);
            }
			else{
				System.out.println(num+" is Not A Perfect Square ");
			}
	}
	













