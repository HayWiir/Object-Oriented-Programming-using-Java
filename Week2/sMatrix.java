import java.util.Scanner;

class sMatrix{
	public static void main(String args[]){
		Scanner in= new Scanner(System.in);

		System.out.println("Input size of 2d square matrix");
		
		int n =in.nextInt();

		int a[][]=new int[n][n];
		
		System.out.println("Input elements");
		int i,j;

		for(i=0;i<n;i++) {
			for (j=0;j<n;j++) {
				a[i][j]=in.nextInt();

			}
		}
			
		System.out.println("The matrix is");

		for(i=0;i<n;i++) {
			for (j=0;j<n;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
		boolean flag=true;
		for(i=0;i<n;i++) {
			for (j=0;j<n;j++) {
				if(a[i][j]!=a[j][i]) {
					flag=false;
					System.out.println("Not symmetric");
				}
			}
		}

		if (flag) {
			System.out.println("Symmetric");
		}			
			
	}
}		