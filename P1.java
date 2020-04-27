import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner GradeScale = new Scanner(System.in);
		
		System.out.println("What grade did the student get?");
		
		int grade = GradeScale.nextInt();
			
		
		if (grade >=90){
		System.out.println("A");
		}
		
		else if (grade >= 80 && grade <90){
			System.out.println("B");
		}
		
		else if (grade >= 70 && grade <80){
			System.out.println("C");
		}
		
		else if (grade >=50 && grade<60) {
		
		System.out.println("D");
		}
	
		else{
			System.out.println("F");
		}

		
	}

}
