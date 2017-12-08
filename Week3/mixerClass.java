import java.util.Scanner;

class Mixer{

	int n;
	

	Mixer(int n){
		this.n=n;
		// for (int i=0;i<n;i++){
		// 	intarr[i]=0;
		// }
		
	}
	int intarr[]=new int[100];

	void accept() {
		Scanner in = new Scanner(System.in);
		int i=0;
		System.out.println("Enter "+n+" numbers in ascending order without repeating");
		int a;
		while(i<this.n) {
			a = in.nextInt();
			if(i>0){
				if(a<=this.intarr[i-1]) {
					System.out.println("Enter a larger number");

				}else{
					this.intarr[i]=a;
					i++;
				}
			}else {
				this.intarr[i]=a;
				i++;
			}

		 }

		// for(i=0;i<this.n;i++) {
		// 	this.intarr[i] = in.nextInt();
		// }
	}

	void display() {
		System.out.print("The array is ");
		for(int i=0;i<this.n;i++) {
			System.out.print(intarr[i]+" ");

		}

		System.out.println("");

	}

	Mixer mix(Mixer a) {
		Mixer r = new Mixer(this.n+a.n);

		int i=0,j=0,k=0;


		while (i<this.n & j<a.n) {
			// System.out.println(this.intarr[i]);
			// System.out.println(a.intarr[j]);
			if (this.intarr[i]< a.intarr[j]) {
				r.intarr[k]=this.intarr[i];
				i++;
				k++;

			}else{
				r.intarr[k]=a.intarr[j];
				j++;
				k++;
			}
		}

		while (i<this.n) {
			r.intarr[k]=this.intarr[i];
			i++;k++;
		}
		while (j<a.n) {
			r.intarr[k]=a.intarr[j];
			j++;k++;
		}

		return r;
		 
	}



}

class mixerClass {

	public static void main(String args[]){
		Scanner in= new Scanner(System.in);
		 int n,m;
		 System.out.println("Enter the lengths of two arrays");
		 n=in.nextInt();
		 m=in.nextInt();

		Mixer a= new Mixer(n);
		Mixer b = new Mixer(m);

		a.accept();
		a.display();
		b.accept();
		b.display();
		
		a.mix(b).display();
		// System.out.println(a.intarr[0]);

	}	
}