import java.util.*;
class Sort 
{
	public static void main(String[] args) 
	{
		
		int[] arr ={12,10,13,18,59};
		System.out.println("Elements Before Sorting");

		for(int i=0; i<arr.length;i++) {

			System.out.println(arr[i]+" ");
		}
		System.out.println();

		System.out.println("Elements After Sorting");

		Arrays.sort(arr); //Inbuilt method of Arrays

		for(int i=0; i<arr.length;i++) {

			System.out.println(arr[i]+" ");
		}
		
	}
}


//Acceing the elemneths of array using the built in method of arrays class that is  toString()

<!-- import java.util.*;
class Sort 
{
	public static void main(String[] args) 
	{

        Sort s = new Sort();
		System.out.println("s");
		int[] arr ={12,10,13,18,59};
		System.out.println("Elements Before Sorting");
		System.out.println("Arrays.toString()");
		Arrays.Sort(); 


 -->