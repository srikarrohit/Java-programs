import java.util.Scanner;


public class insertionSort {

	public static void main(String[] args) {
		System.out.println("Enter array size (Maximum size of 20) ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n<=20 && n>=2)
		{
			int[] array = new int[n];
			int i,j,key,count=0;
			System.out.println("Enter array elements");
			for (i=0;i<n;i++)
			{
				Scanner scr = new Scanner(System.in);
				array[i] = scr.nextInt();
			}
			for(j=1;j<n;j++)
			{
				key = array[j];
				for(i=j-1;i>=0;i--)
				{
					if(array[i]>key)
					{
						array[i+1]=array[i];
						array[i] = key;
						count++;
					}
					else
						break;
				}
			}
			System.out.printf("The sorted sequence is: ");
			for (i=0;i<n;i++)
			{
				if(i==n-1)
					System.out.printf("%d",array[i]);
				else
					System.out.printf("%d,",array[i]);	
			}
			System.out.printf("\nThe total number of comparisions are %d",count);
		}
		else
		{
			System.out.println("Invalid array size");
		}
	}

}
