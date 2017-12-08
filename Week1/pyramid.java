class pyramid {
	public static void main(String args[]){
		int i=1;
		int j=0;

		while (i<=5) {
			while (j<i) {
				System.out.print("*");
				j++;
			}
			j=0;
			System.out.println("");
			i++;
		}
	}

}	