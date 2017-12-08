
class Counter{
	static int count=0;

	static void showCount(){
		System.out.println("The number of objects created is "+ count);
	}
}


class ClassCounter{
	public static void main(String[] args) {
		
		
		Counter a1 = new Counter();
		System.out.println("Counter a1 created");
		Counter.count++;

		Counter a2  = new Counter();
		System.out.println("Counter a2 created");
		Counter.count++;


		Counter.showCount();
		
	}

}