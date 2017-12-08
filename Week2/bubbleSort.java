import java.util.Scanner;

class bubbleSort{
	public static void main(String args[]){
		Scanner in= new Scanner(System.in);

		System.out.println("Input size of array");		
		int n=in.nextInt();	

		int a[]=new int[n];
		
		int i=0;
		while (i<n) {
			a[i]=in.nextInt();
			i++;
		}

		int j=0;

		for (i=0;i<n-1;i++) {
			for (j=0;j<n-i-1;j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}

		System.out.println("The sorted array is :");

		i=0;
		while (i<n) {
			System.out.print(a[i]+" ");
			i++;
		}

		System.out.println("");


	}
}		