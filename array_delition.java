package DAY1;
	import java.util.Arrays;
	import java.util.Scanner;
	public class array_delition {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int arr[]=new int[20];
			System.out.println("enter array size");
			int size=sc.nextInt();
			for(int i=0;i<size;i++) {
				arr[i]=sc.nextInt();
			}
			for(int i=0;i<size;i++)
			{
				System.out.println(arr[i]);
			}
			System.out.println("enter position to delete");
			int delpos=sc.nextInt();
			for(int pos=delpos-1;pos<size;pos++) {
				arr[pos]=arr[pos+1];
			}
			System.out.println(Arrays.toString(arr));
			
		
			
		}
		

	}


