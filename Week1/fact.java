class fact {
	public static void main(String args[]){
		int x= Integer.parseInt(args[0]);

		System.out.println("The factorial of "+x+" is "+fact(x));

	}

	public static int fact(int x) {
		int f=1;
		while (x!=0) {
			f*=x;
			x--;
		}

		return f;
	}

}
