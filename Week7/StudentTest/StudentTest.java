import java.util.*;

class StudentTest{
	public static void main(String[] args){
		
		try{	
			Student a = new Student();

			a.display();
			Student b = new Student();
			b.display();
			Student c = new Student();
			c.display();
			Student d = new Student();
			d.display();
		}
		catch(SeatsFilledException exc){
			System.out.print("Error\n");
		}
}
}