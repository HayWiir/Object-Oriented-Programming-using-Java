import java.util.Scanner;

class findSum{
	public static void main(String args[]){
		Scanner in= new Scanner(System.in);
		
		int x = Integer.parseInt(in.nextLine());
		
		System.out.println(findSum(x));

	}

	public static int findSum(int x){
		int sum=0;
		int temp=x;

		while (temp!=0) {
			sum+=temp%10;
			temp=temp/10;
		}

		return sum;

	}

}		