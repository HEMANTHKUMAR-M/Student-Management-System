package Students;

import java.util.ArrayList;
import java.util.Scanner;


class Studentmanagement{
	int id;
	String name;
	int age;
	String course;
	
	public Studentmanagement(int id,String name,int age,String course)
	{
		this.id = id;
		this.name = name;
		this.age = age;
		this.course = course;
	}
	
	public void display() {
		System.out.println("ID :" +id+ ", Name:" +name+ ", Age:" +age+ ", Course:" +course);
		System.out.println();
	}
}

public class Student {
	
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Studentmanagement> students = new ArrayList<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int choice;
		
	do {
		
		System.out.println("Student Management System");
		
		System.out.println("1.Add student");
		System.out.println("2.View Student");
		System.out.println("3.Search student");
		System.out.println("4.Update student");
		System.out.println("5.delete student");
		System.out.println("6.Exit..");
		
		
		System.out.println("Enter the choice");
		choice = sc.nextInt();		
		
		switch(choice) {
		case 1: addStudent();
				break;
				
		case 2 : viewStudents();
				break;
				
		case 3:searchStudent();
				break;
		
		case 4 :updateStudent();
				break;
				
		case 5:deleteStudent();
				break;
				
		case 6: System.out.println("Thank you");
		        break;
				
		default:System.out.println("Invalid choice");
				break;
		}
		
	}while(choice != 6);
	
	}
	
	static void addStudent() {
		
		System.out.println("Enter the id: ");
		int id = sc.nextInt();
		
		System.out.println("Enter the name: ");
		String name = sc.next();
		
		
		System.out.println("Enter the age: ");
		int age = sc.nextInt();
	
		
		System.out.println("Enter the course: ");
		String course = sc.next();
		
		students.add(new Studentmanagement(id, name, age, course));
	    System.out.println("Student added successfully!");
		
	}

	static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        System.out.println("\n--- Student List ---");
        for (Studentmanagement s : students) {
            s.display();
        }
    }

    static void searchStudent() {
        System.out.print("Enter Student ID to search: ");
        int id = sc.nextInt();

        for (Studentmanagement s : students) {
            if (s.id == id) {
                System.out.println("Student Found:");
                s.display();
                return;
            }
        }

        System.out.println("Student not found.");
    }

    static void updateStudent() {
        System.out.print("Enter Student ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Studentmanagement s : students) {
            if (s.id == id) {
                System.out.print("Enter New Name: ");
                s.name = sc.nextLine();

                System.out.print("Enter New Age: ");
                s.age = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter New Course: ");
                s.course = sc.nextLine();

                System.out.println("Student updated successfully!");
                return;
            }
        }

        System.out.println("Student not found.");
    }

    static void deleteStudent() {
        System.out.print("Enter Student ID to delete: ");
        int id = sc.nextInt();

        for (Studentmanagement s : students) {
            if (s.id == id) {
                students.remove(s);
                System.out.println("Student deleted successfully!");
                return;
            }
        }

        System.out.println("Student not found.");
    }
}