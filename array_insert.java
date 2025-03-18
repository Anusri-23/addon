package DAY1;
	import java.util.Arrays;
	import java.util.Scanner;

	public class array_insert {
		public static void main(String[] args) {
			int num[]=new int[20];
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the array");
			int size=sc.nextInt();
			for(int i=0;i<size;i++) {
				num[i]=sc.nextInt();
				
			}
			 System.out.println(Arrays.toString(num));
			 System.out.println("enter value");
			 int newval=sc.nextInt();
			 System.out.println("enter position");
			 int pos=sc.nextInt();
			 for(int n=size;n>=pos-1;n--) {
				 num[n]=num[n-1];
			 }
			 num[pos-1]=newval;
			 size++;
			 System.out.println(Arrays.toString(num));
		}
			 
			 
			 

	}


