class isPrime{
	public static void main(String args[]){
		int x=Integer.parseInt(args[0]);

		System.out.println("The first "+x+" prime numbers are ");
		int count=0;
		int i=0;
		while (count <x) {
			if (isPrime(i)) {
				System.out.println(i);
				count++;
			}
			i++;
		}

	}

	public static boolean isPrime(int x) {
		if (x==1 || x==0) {
			return false;
		}
		if (x==2) {
			return true;
		}
		
		int i=2;
		while (i<=x/2) {
			if (x%i==0){
				return false;
			}
			i++;
		}

		return true;


	} 

}		