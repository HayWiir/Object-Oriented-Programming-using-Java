
class Table {
	int x;
	Table(int a){
		x=a;
	}



	public void display(){
		for(int i =1;i<11;i++)
			System.out.println(i+"*"+x+"="+i*x);
	}
}

class DisplayTable extends Thread{
	Table t;

	DisplayTable(int k){
		t = new Table(k);
	}

	public void run(){
		t.display();	
	}

}

class TableDemo{
	public static void main(String[] args) {
		DisplayTable a1 = new DisplayTable(5);
		DisplayTable a2 = new DisplayTable(7);

		Thread t1 = a1;
		Thread t2 = a2;

		t1.start();
		try
			{t1.join();}
		catch (InterruptedException e){
				System.out.print("Interrupted\n");
			}
				
		t2.start();
		try
			{t2.join();}
		catch (InterruptedException e){
				System.out.print("Interrupted\n");
			}
		
		

	}
}