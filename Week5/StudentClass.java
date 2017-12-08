	import java.util.Scanner;
	import java.util.Calendar;

	//IMPLEMENT GREGORIAN CALENDAR
	//IMPLEMAT SORT


	class Student{
		int reg;
		String name;
		String date;
		int sem;
		double gpa;
		double cgpa;
		static int count=0;

		Student(){
			reg=0;
			name="";
			date="";
			sem=0;
			gpa=0;
			cgpa=0;
		}

		Student(String n,String date, int sem,double gpa, double cgpa){
			this.count++;
			String temp=""; 
			temp += date.charAt(2);
			temp+=date.charAt(3);
			if(this.count<10){
				temp+=Integer.toString(0)+Integer.toString(count);
			}
			else
				temp+=Integer.toString(count);
			
			this.reg = Integer.parseInt(temp);

			this.name=n;
			this.sem=sem;
			this.date=date;
			this.gpa=gpa;
			this.cgpa=cgpa;
		}

		void display(){
			System.out.println("Regno: "+this.reg+"\nName: "+this.name+"\nDate: "+this.date+"\nSemester: "+ this.sem+"\nGPA: "+this.gpa+"\nCGPA: "+this.cgpa);	
		}  	

		static void listS(Student arr[], String a){

			for (Student i: arr){
				if (i.name.contains(a)){
					System.out.println(i.name);
				}
			}

		}

		void shorten(){

			String[] sLis = this.name.split(" ");
			String temp = "";
			int i =0;
			for(i=0;i<sLis.length-1;i++){
				temp+=sLis[i].charAt(0) +". ";

			}
			temp+=sLis[i];
			System.out.println(temp);

		}

		

	}


	class StudentClass{
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
		//	Student a = new Student("Helen George Kerr","2012",2,5.6,7.6);
			
			Student arr[] = new Student[3];
			
			for(int i=0;i<3;i++){
				String n,d;
				int s;
				double gp,cgp;

				System.out.println("Input Name");
				n=in.nextLine();
				
				System.out.println("Year");
				d=in.next();
				System.out.println("Semester");
				s=in.nextInt();
				System.out.println("GPA");
				gp = in.nextDouble();
				System.out.println("CGPA");
				cgp =in.nextDouble();
				in.nextLine();
				
				Student temp = new Student(n,d,s,gp,cgp);
				arr[i]=temp;	
				arr[i].display();

			}

			Student.listS(arr,"ir");	
			arr[1].shorten();

			// for(Student j: arr){
			// 	j.display();	
				


			}
			

		}
