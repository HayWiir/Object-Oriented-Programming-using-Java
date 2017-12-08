package Packages.p1;
public class Max{

	public int max(int a, int b, int c){
		int max=a;
		if(b>max) {max=b;}
		if(c>max) {max=c;}  

		return max;
	}

	public double max(double a, double b, double c){
		double max=a;
		if(b>max) {max=b;}
		if(c>max) {max=c;}

		return max;
	}

	public static int max(int arr[],int n){
		int max=arr[0];
		for(int i=0;i<n;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}

		return max;
	}

	public static int max(int arr[][],int m,int n){
		int max=arr[0][0];
		for(int i=0;i<m;i++){
			for (int j=0;j<n;j++){
				if(arr[i][j]>max){
					max=arr[i][j];
				}
			}
		}
		return max;

	}	

}

// public class p1{
// 	public static void main (String args[]) {
// 		Max M = new Max();
// 		int a=3,b=6,c=7;
// 		double i=7.6444,g=8.5444,h=9.4444;
// 		// int arr1[] = new int[7];
// 		// int arr2[] = new int[3][2];
// 		// arr1 = [3,5,6,2,7,89,12]; //7
// 		// arr2 = [[3,4],[5,6],[32,1]];//3x2

// 		System.out.println(M.max(a,b,c)+"\n"+M.max(i,g,h));//"\n"+Max.max(arr1)+"\n"+Max.max(arr2));
// 	}
// }	
