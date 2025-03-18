package DAY1;
	import java.util.Arrays;
	import java.util.Scanner;
	public class array_min_max {
		public static void main(String[]args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the numbers");
			int size=sc.nextInt();
			int num[]=new int[size];
			for(int i=0;i<size;i++) {
				num[i]=sc.nextInt();
			}
		
			System.out.println(Arrays.toString(num));
			Arrays.sort(num);
			System.out.println("minimum val "+ num[0]);
			System.out.println("maximum val "+ num[size-1]);
			
		}

	}


