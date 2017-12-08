import java.util.Scanner;

class Acc{
	String name;
	int accNum;
	String type;
	int bal;
	static double rate = 0.07;

	Acc(){

	} 

	Acc(String a,int n, String t, int b){
		this.name=a;
		this.accNum=n;
		this.type=t;
		this.bal=b;
	}

	Acc(Acc k){
		this.name=k.name;
		this.accNum=k.accNum;
		this.type=k.type;
		this.bal=k.bal;

	}

	void deposit(int n){
		this.bal+=n;
		System.out.println("Balance is "+this.bal);
	}

	void withdraw(int n){
		if(n<=this.bal){
			this.bal-=n;
			System.out.println("Balance is "+this.bal);
		}else{
			System.out.println("Insufficient funds");
		}
	}


	void details(){
		System.out.println("Name: "+this.name+"\nAccount No.: "+this.accNum+"\nType: "+this.type+"\nBalance: "+this.bal);
	}

	void dispInt(){
		System.out.println("Interest rate is "+this.rate);
	}




}

class Bank{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n,bal;
		String na,ty;

		System.out.println("Enter name, type, AC number and balance");

		na=in.nextLine();
		ty=in.nextLine();
		n=in.nextInt();		
		bal=in.nextInt();

		Acc w = new Acc(na,n,ty,bal);

		int a,b;

		System.out.println("Deposit money");
		a=in.nextInt();
		w.deposit(a);

		System.out.println("Withdraw money");
		b=in.nextInt();
		w.withdraw(b);

		w.details();

		w.dispInt();
	}
}