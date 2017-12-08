import java.util.Scanner;

class Time{

	int h=0,m=0,s=0;

	Time(){}

	Time(int s){
		this.s=s;
	}

	Time(int m, int s){
		this.m=m;
		this.s=s;
	}

	Time(int h,int m, int s) {
		
		this.h=h;
		this.m=m;
		this.s=s;

	}

	void display() {

		System.out.println(h+":"+m+":"+s);
	}

	Time add(Time a){
		Time r = new Time(0,0,0);

		r.s+=this.s + a.s;
		if(r.s>=60) {
			r.s -=60;
			r.m += 1;
		}

		r.m += this.m + a.m;
		if(r.m >= 60) {
			r.m-=60;
			r.h+= 1;
		}

		r.h += this.h + a.h;

		return r;



	}


	Time subtract(Time a){
		Time r = new Time(0,0,0);

		if (this.compare(a)==0) {
			r.s+=a.s - this.s;
			if(r.s<0) {
				r.s +=60;
				r.m -= 1;
			}

			r.m += a.m - this.m;
			if(r.m <0) {
				r.m+=60;
				r.h-= 1;
			}

			r.h += a.h - this.h;
			return r;


		}

		

		r.s+=this.s - a.s;
		if(r.s<0) {
			r.s +=60;
			r.m -= 1;
		}

		r.m += this.m - a.m;
		if(r.m <0) {
			r.m+=60;
			r.h-= 1;
		}

		r.h += this.h - a.h;
		return r;


	}

	int compare(Time a) {
		if (this.h>a.h){
			//System.out.println("Greater");
			return 2;
		}
		else if (this.h<a.h) {
			//System.out.println("Smaller");
			return 0;
		}

		else
		{
			if (this.m>a.m){
			//System.out.println("Greater");
			return 2;
			}
			else if (this.m<a.m) {
			//System.out.println("Smaller");
			return 0;

			}
			else 
			{
				if (this.s>a.s){
				//System.out.println("Greater");
				return 2;
				}
				else if (this.s<a.s) {
				//System.out.println("Smaller");
				return 0;
				}
				else{
					//System.out.println("Equal");
					return 1;
				}
			}
		}
	}


}

class TimeClass{

	public static void main(String args[]){
		Scanner in= new Scanner(System.in);

		int a,b,c;
		System.out.println("Enter time: ");

		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
		

		Time one = new Time(a,b,c);
		Time two = new Time();
		Time three = new Time(a);
		Time four = new Time(a,b);
		
		System.out.print("The time is ");
		one.display();
		two.display();
		three.display();
		four.display();
		System.out.println();


		
		// two.display();

		// System.out.print("The sum is ");
		// one.add(two).display();

		// System.out.print("The difference is ");
		// one.subtract(two).display();

		// if(one.compare(two)==0) {
		// 	System.out.println("Smaller");

		// }else if (one.compare(two)==2) {
		// 	System.out.println("Greater");
		// }else{
		// 	System.out.println("Equal");
		// }
			


	
	}	
}