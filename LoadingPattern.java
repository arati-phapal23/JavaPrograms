class LoadingPattern
{

	public static void main(String[] args) 
	{
		int n = 3;
		
		for(int i=1; i<=n*2-1; i++){
			for(int j=1; j<=n*2-1; j++){
				if((j>=i && i+j<=n*2) || (j<=i && j>=n*2)){
					System.out.println("* ");
				} else {

					System.out.println("  ");
                }

		}

		System.out.println();
	}
}
}