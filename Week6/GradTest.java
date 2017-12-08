import java.util.*;
import java.text.*;

class Person{
		private String name;
		GregorianCalendar birthDate;


		Person(){
			this.name="";
			this.birthDate=new GregorianCalendar();
		}

		Person(Person p){
			this.name = p.name;
			this.birthDate = p.birthDate;
		}

		public void input(){
			Scanner in = new Scanner(System.in);
			System.out.print("\nEnter Name: ");
			this.name=in.nextLine();	
			System.out.print("\nEnter Date of Birth (yyyy/mm/dd): ");
			this.birthDate = new GregorianCalendar(in.nextInt(),in.nextInt()-1,in.nextInt());
		}

		public void display(){
			SimpleDateFormat dateFormat = new SimpleDateFormat("MMM, dd, yyyy");
			System.out.println("\n           Name: "+ this.name +
			                   "\n  Date of Birth: "+ dateFormat.format(this.birthDate.getTime())) ;
			
		}



}

class CollegeGraduate extends Person{
	private float gpa;
	private GregorianCalendar gradDate;

	CollegeGraduate(){
		super();
		this.gpa=0;
		this.gradDate=new GregorianCalendar(); 
	}

	CollegeGraduate( CollegeGraduate c){
		super(c);
		gpa = c.gpa;
		gradDate = c.gradDate;
	}

	public void input(){
		Scanner in = new Scanner(System.in);
		super.input();
		System.out.println("\nEnter GPA:");
		this.gpa=in.nextFloat();
		System.out.println("\nEnter Graduation Date  (yyyy/mm/dd): ");
		this.gradDate = new GregorianCalendar(in.nextInt(),in.nextInt()-1,in.nextInt());
	}

	public void display(){
		SimpleDateFormat dateFormat = new SimpleDateFormat("MMM, dd, yyyy");
		super.display();
		System.out.println("            GPA: "+ this.gpa+
		                 "\nGraduation Date: "+ dateFormat.format(this.gradDate.getTime()));
		// System.out.println("Daysdiff : "+ daysBetween(super.birthDate.getTimeInMillis(),gradDate.getTimeInMillis()));
	
	}

	private int daysBetween(GregorianCalendar a, GregorianCalendar b) {
		long t1 = a.getTimeInMillis();
		long t2 = b.getTimeInMillis();
    	return (int) ((t2 - t1) / (1000 * 60 * 60 * 24));
}

			

       

}


public class GradTest{
	
	public static void main (String args[]) {
		Scanner in = new Scanner(System.in);
		CollegeGraduate jan = new CollegeGraduate();

		jan.input();
		jan.display();






	}
}