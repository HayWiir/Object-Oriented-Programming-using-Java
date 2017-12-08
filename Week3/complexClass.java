import java.util.Scanner;

class Complex{

	int real;
	int img;

	void setNum(int a,int b) {

		this.real = a;
		this.img = b;
	}

	// Complex (int a, int b) {
	// 	this.real = a;
	// 	this.img = b;
	// }

	void displayNum() {
		if(this.img>=0){
			System.out.println(this.real+" + i"+this.img);
		}
		else {
			System.out.println(this.real+" - i"+(-(this.img)));

		}
	}

	Complex add(Complex b) {
		int c,d;
		c=this.real + b.real;
		d=this.img + b.img;

		Complex s= new Complex();

		s.setNum(c,d);

		return s;
	}

	Complex subtract(Complex b) {
		int c,d;
		c=this.real - b.real;
		d=this.img - b.img;

		Complex s = new Complex();

		s.setNum(c,d);

		return s;
	}
}


class complexClass {
	public static void main(String args[]){
		Scanner in= new Scanner(System.in);


		System.out.println("Input two complex numbers");
		int a,b,c,d;

		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
		d=in.nextInt();

		Complex x = new Complex();
		Complex y = new Complex();
		Complex u = new Complex();
		Complex v = new Complex();
		x.setNum(a,b);
		y.setNum(c,d);

		x.displayNum();
		y.displayNum();

		u = x.add(y);
		v = x.subtract(y);


		System.out.print("The sum is ");
		u.displayNum();

		System.out.print("The sum is ");
		v.displayNum();



	}

}		

