import java.util.Scanner;


class Card{
	int rank;
	char suit;

	Card(){

	}

	Card(int r, char s){
		this.rank=r;
		this.suit=s;
	}

	void set(int r, char s){
		this.rank=r;
		this.suit=s;
	}

	char getSuit(){
		return this.suit;
	}

	int getRank(){
		return this.rank;
	}


}

class CardTester{
	public static void main(String args[]){

		Scanner in = new Scanner(System.in);

		int c1=0,c2=0,f1=0,f2=0;
		int rArr[] = new int[5];
		char cArr[] = new char[5];
		Card temp1 = new Card();
		Card temp2 = new Card();
		Card arr[] = new Card[5];

		
		System.out.println("Enter cards:");
		for(int i=0;i<5;i++){
			rArr[i] = in.nextInt();
			cArr[i] = in.next().charAt(0);
			Card t = new Card(rArr[i],cArr[i]);
			arr[i]=t;
		}

		// Card arr[] = new Card[5];
		// for(int i=0;i<5;i++){
		// 	Card t = new Card(rArr[i],cArr[i]);
		// 	arr[i]=t;
		// }

		for(int i=0;i<5;i++){

			if(c1==0){
				temp1=arr[i];
				c1++;
			}
			else if(c2==0 & arr[i].getRank()!= temp1.getRank()){
				temp2=arr[i];
				c2++;
			}else {
				if(arr[i].getRank()==temp1.getRank()){
					c1++;
				}
				else if(arr[i].getRank()== temp2.getRank()){
					c2++;
				}else{
					System.out.println("Not full house");
					System.out.print("The cards are");
					for(i=0;i<5;i++){
			
						System.out.print(arr[i].getRank()+arr[i].getSuit()+" ");

					}

					return;
				}



			}


		}

		System.out.println("Full House");	 
		
		
		System.out.print("The cards are");
		for(int i=0;i<5;i++){
			
			System.out.print(arr[i].getRank()+arr[i].getSuit()+" ");

		}



	}
}