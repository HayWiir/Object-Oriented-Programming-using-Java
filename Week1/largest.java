

class largest {
	public static void main(String args[]){
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int z = Integer.parseInt(args[2]);

		int max=largest(x,y,z);

		System.out.println("The largest number is "+ max);
	}

	public static int largest(int a,int b,int c) {
		int max=a;
		if (b>a) {
			max=b;
		}

		if (c>max) {
			max=c;
		}

		return max;
	}
} 