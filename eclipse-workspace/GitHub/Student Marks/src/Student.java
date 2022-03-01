import java.util.Scanner;

public class Student {
	String name; 
	int studentId;
	int mark;




  Student(String name, int studentId, int mark) {
	 this.name = name; 
	 this.studentId = studentId;
	 this.mark = mark;
	 

}

 
 
 
 public static void main(String ars[]) {
	 Scanner sc = new Scanner(System.in);
	 
	 try {
		 
	 
	 System.out.println("Eneter name: ");
	 String name = sc.next();
	 System.out.println("Enter student ID: ");
	 int studentID = sc.nextInt();
	 System.out.println("Eneter Mark: ");
	 int mark = sc.nextInt();
	 
	 if (mark < 0 || mark > 100) {
		 throw new MarkException();
	 }
	 
 } catch(MarkException e) {
	 System.out.println(e);
 }
}
}


	
