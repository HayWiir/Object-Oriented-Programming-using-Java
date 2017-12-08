import java.util.Scanner;

class addMatrix{
	public static void main(String args[]){
		Scanner in= new Scanner(System.in);

		System.out.println("Input size of 2d square matrices");
		
		int m =in.nextInt();
		int n =in.nextInt();

		int a[][]=new int[m][n];
		int b[][]=new int[m][n];
		int s[][]=new int[m][n]; 
		
		System.out.println("Input elements of Matrix1");
		int i,j;

		for(i=0;i<m;i++) {
			for (j=0;j<n;j++) {
				a[i][j]=in.nextInt();

			}
		}
			
		System.out.println("The Matrix1 is");

		for(i=0;i<m;i++) {
			for (j=0;j<n;j++) {
				System.out.print(a[i][j]+" ");	
			}
			System.out.println("");
		}

		System.out.println("Input elements of Matrix2");
		

		for(i=0;i<m;i++) {
			for (j=0;j<n;j++) {
				b[i][j]=in.nextInt();

			}
		}
			
		System.out.println("The Matrix2 is");

		for(i=0;i<m;i++) {
			for (j=0;j<n;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println("");
		}

		for(i=0;i<m;i++) {
			for (j=0;j<n;j++) {

				s[i][j] = a[i][j] + b[i][j];

			}
		}

		System.out.println("The sum Matrix is");

		for(i=0;i<m;i++) {
			for (j=0;j<n;j++) {
				System.out.print(s[i][j]+" ");
			}
			System.out.println("");
		}



	}
}		