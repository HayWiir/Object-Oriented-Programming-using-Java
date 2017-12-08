import java.util.*;

interface Stack{
	void push(int n);
	int pop();
}

class FixedStack{
	static int max = 20;
	int arr[];
	int top;

	FixedStack(){
		arr = new int[max];
		top=0;
	}

	public void push(int n){
		if(top==max-1)
			return;
		else
			arr[top++]=n;
	}

	public int pop(){
		if(top!=0)
			return arr[top--];
		else
			return -5;			
	}
	public void display(){
		
		for(int i=0;i<top;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
	

}

class DynamicStack{
	static int max=5;
	int arr[];
	int top;

	DynamicStack(){
		arr = new int[max];
		top=0;
	}

	void copy(){
		int m1=max;
		max=max*2;
		int[] arr1 = new int[max];
		for(int i=0;i<m1;i++)
			arr1[i]=arr[i];
		arr=arr1;
	}

	public void push(int n){
		if(top==max-1)
			copy();
				
		arr[top++]=n;
	}

	public int pop(){
		if(top!=0)
			return arr[top--];
		else
			return -5;			
	}

	public void display(){
		
		for(int i=0;i<top;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}


}

class IStack{
	public static void main(String[] args){
		DynamicStack A = new DynamicStack();
		FixedStack  B = new FixedStack();
		System.out.println("DynamicStack");
		A.push(9);
		A.push(10);
		A.push(90);
		A.push(76);
		A.push(28);
		A.push(23);
		A.push(34);
		A.display();
		A.pop();
		A.pop();
		A.pop();
		A.pop();
		A.pop();
		A.pop();
		A.pop();
		A.pop();
		A.pop();
		A.pop();
		A.pop();
		
		A.push(34);
		A.push(65);
		A.display();

		System.out.println("FixedStack");
		B.push(23);
		B.push(22);
		B.push(11);
		B.push(68);
		B.push(1);
		B.display();
		B.pop();
		B.pop();
		B.pop();
		B.display();

		
		


	}
}

