import java.util.Scanner;

class search{
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


		System.out.println("The array is :");

		i=0;
		while (i<n) {
			System.out.print(a[i]+" ");
			i++;
		}

		System.out.println("\nInput element to search: ");
		int x = in.nextInt();

		int flag=0;
		for (i=0;i<n;i++) {
			if(a[i]==x) {
				flag=1;
				System.out.println("The element "+x+" is at index "+i);
				
			}

		}
		if (flag==0) {
			System.out.println("The element "+x+" is not in the array");
		}
		
		


	}
}		
