import java.util.Scanner;

class insDel{
	public static void main(String args[]){
		Scanner in= new Scanner(System.in);

		System.out.println("Input size of array");		
		int n=in.nextInt();	

		int a[]=new int[n+1];
		
		int i=0;
		while (i<n) {
			a[i]=in.nextInt();
			i++;
		}


		System.out.println("The array is :");

		i=0;
		while (i<n) {
			System.out.print(a[i]+" ");
			i++;
		}

		System.out.println("");

		System.out.println("Input new element and index:");	
		int x=in.nextInt();
		int y=in.nextInt();


		for(i=n-1;i>=y;i--) {
			a[i+1]=a[i];


		}

		a[y]=x;

		System.out.println("Input index:");
		
		y=in.nextInt();

		for (i=y;i<n;i++) {
			a[i]=a[i+1];
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
