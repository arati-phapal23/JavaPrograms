class  Ex2
{

	static double a = 25.5;
	static char ch = 'A';

	public static void main(String[] args) 
	{
		int a = 10;
		System.out.println("Welcome");
		test(a);
		System.out.println(Ex2.a);

	}

	public static void test(double a)
	{
		System.out.println("I am From Test");
		demo();
		System.out.println(a);
	}

	public static void demo() {
		System.out.println("I am from Demo");
		System.out.println(a + ch);
}
}