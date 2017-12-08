

import java.util.*;
import java.text.*;

class Student {
    
    int regNo;
    String fullName;
    GregorianCalendar dateJoined;
    short semester;
    float gpa;
    float cgpa;
    public static int count=0;
    
    Student () {

        regNo = 0;
        fullName = "";
        dateJoined = new GregorianCalendar();
        semester = 0;
        gpa = 0.f;
        cgpa = 0.f;
    }
    
    Student (Student s) {
        this.regNo = s.regNo;
        this.fullName = s.fullName;
        this.dateJoined = s.dateJoined;
        this.semester = s.semester;
        this.gpa = s.gpa;
        this.cgpa = s.cgpa;
    }
    
    public void display () {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd, yyyy"); 
        System.out.println("\nName: " + fullName + 
                           "\nReg No: " + regNo + 
                           "\nDate Joined: " + dateFormat.format(dateJoined.getTime()) +
                           "\nSemester: " + semester + 
                           "\nGPA: " + gpa + 
                           "\nCGPA: " + cgpa + 
                           "\n");
    }
    
    public void input () {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Name: ");
        fullName = sc.nextLine();
        System.out.print("Enter Date Joined (yyyy/mm/dd): ");
        dateJoined = new GregorianCalendar(sc.nextInt(), sc.nextInt() - 1, sc.nextInt());
        System.out.print("Enter Semester: ");
        semester = sc.nextShort();
        System.out.print("Enter GPA: ");
        gpa = sc.nextFloat();
        System.out.print("Enter CGPA: ");
        cgpa = sc.nextFloat();
        System.out.println();
    }
}

class Students {
    
    Student students[];
    int size;
    
    public Students (int size) {
        this.size = size;
        this.students = new Student[size];
    }
    
    public void inputAll () {
        for (int i = 0; i < size; ++i) {
            System.out.println("Student " + (i+1) + " :");
            students[i] = new Student();
            students[i].input();
            Student.count++;
            SimpleDateFormat dateFormat = new SimpleDateFormat("yy");
            String regNo = dateFormat.format(students[i].dateJoined.getTime());
            regNo += Integer.toString(Student.count);
            students[i].regNo = Integer.parseInt(regNo);
        }
    }
    
    public void displayAll () {
        for (Student stud: students)
            stud.display();
    }
    
    public void list (String str) {
        for (Student stud: students) {
            if (stud.fullName.contains(str))
                stud.display();
        }
    }
    
    public void list (char ch) {
        for (Student stud: students) {
            if (stud.fullName.indexOf(ch) == 0)
                stud.display();
        }
    }
    
    public void shortenName () {
        for (Student i: students) {
            String[] temp = i.fullName.split(" ");
            String temp2 = "";
            for(int j=0;j<temp.length-1;j++)
            	temp2+= temp[j].charAt(0)+". ";
            temp2+= temp[temp.length-1];
            i.fullName = temp2;
        }
    }
    
    public void sort (String wrt) {
        for (int i = 0; i < size - 1; ++i) {
            int min = i;
            for (int j = i + 1; j < size; ++j) {
                if (wrt.equals("semester") && (students[j].semester > students[min].semester))
                    min = j;
                if (wrt.equals("cgpa") && (students[j].cgpa > students[min].cgpa))
                    min = j;
                if (wrt.equals("fullName") && (students[j].fullName.compareTo(students[min].fullName)) < 0)
                    min = j;
            }
            if (min != i) {
                Student temp = students[i];
                students[i] = students[min];
                students[min] = temp;
            }
        }
    }
}

public class StudentTest {
    
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the number of Students: ");
        int size = sc.nextInt();
        
        Students students = new Students (size);
        students.inputAll();
		sc.nextLine();
        
        char choice;
        do {
            System.out.print("\n1. Display Students " + 
							"\n2. Sort wrt Name" +
							"\n3. Sort wrt Semester " +
							"\n4. Sort wrt CGPA " +
							"\n5. List all Students whose name begins with a character" +
							"\n6. List all Students whose name contains a string" +
							"\n7. Change the names of all students to shortened form" +
							"\nOther for exit" +
							"\n");
            choice = sc.next().charAt(0);
			sc.nextLine();
            
            switch (choice) {
                case '1': students.displayAll();
                    break;
                case '2': students.sort("fullName");
                        System.out.println("\tSorted wrt Name.\n");
                        students.displayAll();
                    break;
                case '3': students.sort("semester");
                        System.out.println("\nSorted wrt Semester.\n");
                        students.displayAll();
                    break;
                case '4': students.sort("cgpa");
                        System.out.println("\nSorted wrt CGPA.\n");
                        students.displayAll();
                    break;
                case '5': System.out.print("\nEnter the character: ");
                        char ch = sc.next().charAt(0);
                        
						System.out.println("\nAll the student names starting with " + ch + " : \n");
						students.list(ch);
                    break;
                case '6': System.out.print("\nEnter the string: ");
                        String subs = sc.nextLine();
                        
						System.out.println("\nAll the student names containing \' " + subs + "\' : \n");
						students.list(subs);
                    break;
                case '7': students.shortenName();
                        System.out.println("\nShortened Name.\n");
                        students.displayAll();
                    break;
                default: break;
            }
            
        } while ("1234567".indexOf(choice) != -1);
    }
}