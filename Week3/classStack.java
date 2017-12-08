import java.util.Scanner;
import java.util.Arrays;	


class Stack{
	int arr[]=new int[5];
	int tos;

	Stack(){
		this.tos= 0;
	}

	void push(int n){
		if (this.tos<5) {
			arr[this.tos]=n;
			this.tos++;
		}else{
			System.out.println("\nOverflow\n");
		}
	}

	char pop() {
		if(this.tos>0){	

			this.tos--;
		}else{
			System.out.println("\nUnderflow\n");
		}	
			
	}

	void display(){
		System.out.print("[ ");
		for (int i=0;i<this.tos;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.print("]");
		System.out.println();
	}



}

class classStack{
	public static void main(String args[]){
		Scanner in= new Scanner(System.in);	


		Stack a = new Stack();
		System.out.println("Stack a is initialized");

		int i = 0;
		while(true){
			System.out.println("Enter:\n1 to push\n2 to pop\n3 to display\nOther to break");
			i = in.nextInt();

			if(i==1){
				int k;
				System.out.println("Enter number");
				k=in.nextInt();
				a.push(k);

			}

			else if(i==2){
				a.pop();
				System.out.println("Popped");
			}

			else if(i==3){
				a.display();
			}
			else{
				break;
			}

			

		}
	}	

}
