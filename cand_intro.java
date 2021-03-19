import java.util.*;
public class cand_intro {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Candidate Name");
	    String name=sc.next();
	    System.out.println("Enter Candidate ID");
	    int id=sc.nextInt();
	    System.out.println("Enter Gender");
	    String gen=sc.next();
	    System.out.println("Enter Candidate Date Of birth");
	    String dob=sc.next();
	    System.out.println("The Candidate Name is "+ name+ "\nThe Candidate Id is "+id+ "\nThe Candidate's Gender is "+gen+ "\nThe candidate date of birth is "+dob);
		
	}

}
