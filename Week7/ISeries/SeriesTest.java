import java.util.*;

class SeriesTest{
	public static void main(String[] args){

		ByTwos a = new ByTwos();
		a.setStart(3);
		for(int i=0;i<6;i++)
			System.out.print(a.getNext()+" ");
		
		System.out.println("\n");

		a.setStart(43);
		for(int i=0;i<8;i++)
			System.out.print(a.getNext()+" ");
	
		System.out.println("\n");		



	}	

}