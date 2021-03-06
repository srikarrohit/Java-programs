import java.util.Scanner;


public class insertionSort {

	public static void main(String[] args) {
		System.out.println("Enter array size (Maximum size of 20) ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n<=20 && n>=2)
		{
			int[] array = new int[n];
			int i,j,key,count=0,count1=0;
			System.out.println("Enter array elements");
			for (i=0;i<n;i++)
			{
				Scanner scr = new Scanner(System.in);
				array[i] = scr.nextInt();
			}
			for(j=1;j<n;j++)
			{
				key = array[j];
				/*for(i=j-1;i>=0;i--)//Fails for single comparisons specifically at the first number ex:1,0,9,3,2 gives 1,1,2,3,9. Fails to assign the key
				{
					if(array[i]>key)
					{
						array[i+1]=array[i];
						count++;
					}
					else
					{
						count1++;
						array[i+1]=key;
						break;
					}
				}*/
				for(i=j-1;i>=0;i--)
				{
					if(array[i]>key)
					{
						array[i+1]=array[i];
						array[i] = key;
						count++;
					}
					else
					{
						count1++;
						break;
					}
				}
				/*i = j-1;
				while(i>=0 && array[i]>key)//Error using i>0 . There started from 1 so sly.
				{
					array[i+1]=array[i];
					i--;
				}
				array[i+1]=key;
				*/
			}
			System.out.printf("The sorted sequence is: ");
			for (i=0;i<n;i++)
			{
				if(i==n-1)
					System.out.printf("%d",array[i]);
				else
					System.out.printf("%d,",array[i]);	
			}
			System.out.printf("\nThe total number of comparisions are %d",count+count1);
		}
		else
		{
			System.out.println("Invalid array size");
		}
	}

}
