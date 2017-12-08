	import java.util.*;


	public class Student{
		int reg;
		String name;
		String date;
		SeatsFilledException exc;//= new SeatsFilledException(); 

		
		static int count=23;

		public Student()throws SeatsFilledException{
			reg=0;
			name="";
			date="";
			exc= new SeatsFilledException(); 
			this.count++;
			if(this.count>25)
				throw exc;
			input();
		}

		public void input(){
			// if(this.count>25)
			// 	throw new SeatsFilledException();
			Scanner in = new Scanner(System.in);
			System.out.println("Enter name: ");
			name = in.nextLine();
			System.out.println("Enter year of joining: ");
			date = in.nextLine();
			
			
			
			String temp=""; 
			temp += date.charAt(2);
			temp+=date.charAt(3);
			if(this.count<10){
				temp+=Integer.toString(0)+Integer.toString(count);
			}
			else
				temp+=Integer.toString(count);
			
			this.reg = Integer.parseInt(temp);


		}

		public void display(){
			System.out.println("Regno: "+this.reg+"\nName: "+this.name+"\nDate: "+this.date);	
		} 
	}	