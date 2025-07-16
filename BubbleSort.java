import java.util.*;
class BubbleSort 
{
	public static void main(String[] args) 
	{
		int[] arr ={12,10,13,18,59,55,9};

		for(int i =0; i<arr.length;i++){
			boolean flag=false;

			for(int j=1;j<arr.length-1-i;j++){

				if(arr[j-1]>arr[j]{
					int temp=0;
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
					flag=true;
				}
			}
			if(flag==false){
				break;
            }

}

		System.out.println(Arrays.toString(arr));
		

	}

