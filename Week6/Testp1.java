

import Packages.p1.Max;

public class Testp1{
	public static void main (String args[]) {
		Max M = new Max();
		int a=3,b=6,c=7;
		double i=7.6444,g=8.5444,h=9.4444;
		int arr1[] = {3,5,6,2,7,89,12};
		int arr2[][] = {{3,4},{5,6},{32,1}} ;
		// arr1 = [3,5,6,2,7,89,12]; //7
		// arr2 = [[3,4],[5,6],[32,1]];//3x2

		System.out.println(M.max(a,b,c)+"\n"+M.max(i,g,h)+"\n"+Max.max(arr1,7)+"\n"+Max.max(arr2,3,2));
	}
}	
