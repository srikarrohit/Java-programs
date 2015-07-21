import java.util.Scanner;


public class arrayMax {


	public static void main(String[] args) {
		System.out.println("Enter array size (Maximum size of 20) ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n<=20 && n>=2)
		{
			int[] array = new int[n];
			int i;
			System.out.println("Enter array elements");
			for (i=0;i<n;i++)
			{
				Scanner scr = new Scanner(System.in);
				array[i] = scr.nextInt();
			}
			int currentMax = array[0];
			for (i=1;i<n;i++)
			{
				if(array[i]>currentMax)
				{
					currentMax=array[i];
				}
			}
			System.out.println("The biggest number in the array is "+ max);
		}
		else
		{
			System.out.println("Invalid array size");
		}
	}

}
