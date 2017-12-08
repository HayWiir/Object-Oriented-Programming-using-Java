import java.util.*;
import java.text.*;

class Patient{
		private String name;
		private int age;
		private int hospNum;


		Patient(){
			this.name="";
			this.age=0;
			this.hospNum=0;
		}

		Patient(Patient p){
			this.name = p.name;
			this.age = p.age;
			this.hospNum = p.hospNum;
		}

		public void input(){
			Scanner in = new Scanner(System.in);
			System.out.print("\nEnter Name: ");
			this.name=in.nextLine();	
			System.out.print("\nEnter age: ");
			this.age = in.nextInt();
			System.out.print("\nEnter Hospital Number: ");
			this.hospNum = in.nextInt();
		}

		public void display(){
			
			System.out.println("\n           Name: "+ this.name +
			                   "\n            Age: "+ this.age+
			                   "\nHospital Number: "+ this.hospNum) ;
		}

}

class Inpatient extends Patient{
	private String dept;
	GregorianCalendar admitDate;
    String roomType;

	Inpatient(){
		super();
		this.dept="";
		this.admitDate = new GregorianCalendar();
		this.roomType = "";
	}

	Inpatient(Inpatient i){
		super(i);
		this.dept=i.dept;
		this.admitDate = i.admitDate;
		this.roomType = i.roomType;
	}
	public void input(){
	
		Scanner in = new Scanner(System.in);
		super.input();
		System.out.print("\nEnter Department: ");
		this.dept=in.nextLine();
		System.out.print("\nEnter Room Type: ");
		this.roomType=in.nextLine();
		System.out.print("\nEnter Admit Date (yyyy/mm/dd): ");
		this.admitDate = new GregorianCalendar(in.nextInt(),in.nextInt()-1,in.nextInt());
	}
	public void display(){
		super.display();
		SimpleDateFormat sdf = new SimpleDateFormat("MMM, dd, yyyy");
		
		System.out.println("     Department: "+ this.dept+
		                "\n Admission Date: "+ sdf.format(this.admitDate.getTime())+
		                "\n      Room Type: "+this.roomType);

	}


}

class Billing extends Inpatient{
	private GregorianCalendar disChargeDate;
	private int charges;
	private int days;

	private int daysBetween(GregorianCalendar a, GregorianCalendar b) {
		long t1 = a.getTimeInMillis();
		long t2 = b.getTimeInMillis();
    	return (int) ((t2 - t1) / (1000 * 60 * 60 * 24));

	}
	Billing(){
		super();
		this.disChargeDate = new GregorianCalendar();
		this.charges=0;
		this.days=0;
	}

	Billing( Billing b){
		super(b);
		this.disChargeDate=b.disChargeDate;
		this.charges = b.charges;
		this.days = b.days;
	}

	public void input(){
	
		Scanner in = new Scanner(System.in);
		super.input();
		System.out.print("\nEnter Discharge Date (yyyy/mm/dd): ");
		this.disChargeDate = new GregorianCalendar(in.nextInt(),in.nextInt()-1,in.nextInt());

		this.days = daysBetween(super.admitDate,this.disChargeDate);

		if(super.roomType.equals("Special")){
			this.charges = this.days*1000+this.days*200;
		}
		else if(super.roomType.equals("SemiSpecial")){
			this.charges = this.days*500+this.days*100;
		}
		else {
			this.charges = this.days*100+this.days*50;
		}
	}	

	public void display(){
		super.display();
		SimpleDateFormat sdf = new SimpleDateFormat("MMM, dd, yyyy");
		
		System.out.println(" Discharge Date: "+ sdf.format(this.admitDate.getTime())+
		                "\n        Charges: "+this.charges);

	

	}	

}



public class PatientTest{
	public static void main (String args[]) {
		Scanner in = new Scanner(System.in);
		Billing jan = new Billing();

		jan.input();
		jan.display();




	}
}