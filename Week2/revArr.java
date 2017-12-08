import java.util.Scanner;

class revArr{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);

		System.out.println("Input size of array");

		
		int n=in.nextInt();	

		int a[]=new int[n];
		int i=0;
		while (i<n) {
			a[i]=in.nextInt();
			i++;
		}

		i=0;

		while (i<n/2) {
			int temp = a[i];
			a[i]=a[n-i-1];
			a[n-i-1]=temp;
			i++;
		}

		System.out.println("The new array is :");

		i=0;
		while (i<n) {
			System.out.print(a[i]+" ");
			i++;
		}

		System.out.println("");
		
		




}
}