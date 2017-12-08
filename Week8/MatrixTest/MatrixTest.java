import java.util.Scanner;

class Matrix{
	int arr[][];

	Matrix(int m, int n){
		Scanner in = new Scanner(System.in);
		arr = new int[m][n];

		System.out.println("Enter Matrix");
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				arr[i][j]=in.nextInt();

	}

	public int[] getRow(int i){

		return arr[i];
	}

}

class RowSum implements Runnable{
	int arr[];
	int sum;

	RowSum(int a[]){
		arr=a;
		sum=0;
	}

	public void run(){
		for(int i:arr)
			sum+=i;
	}

	public int getSum(){
		return sum;
	}

}

public class MatrixTest{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m,n;
		System.out.println("Enter rows and columns");
		m=in.nextInt();
		n=in.nextInt();

		Matrix mat = new Matrix(m,n);

		Thread[] thr = new Thread[m];
		RowSum[] rows = new RowSum[m];

		for(int k=0;k<m;k++){
			rows[k] = new RowSum(mat.getRow(k));
			thr[k] = new Thread(rows[k]);

			thr[k].start();
		}

		int sum=0;
		for(int k=0;k<m;k++){
			try{
				thr[k].join();
				sum+=rows[k].getSum();
			}
			catch (InterruptedException e){
				System.out.print("Interrupted\n");
			}

		}

		System.out.println("Sum is "+ sum);
	}
}