// You'd use a switch statment b/c it's more efficient than a set of nested ifs
// ifs can be used for ranges, but swtiches can only use single integers

import java.util.Scanner;

public class P2 {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);
System.out.print("How did the student do on his/her exam?");
 
String LetterGrade = input.next();
LetterGrade = LetterGrade.toUpperCase();

switch (LetterGrade) {
case "A":
System.out.println("Student test score range 90 - 100");
break;
case "B":
System.out.println("Student test score range 80 - 89");
break;
case "C":
System.out.println("Student test score range 70 - 79");
break;
case "D":
System.out.println("Student test score range 60 - 69");
break;
case "F":
System.out.println("Student test score range 0 - 59");
break;
}
}
}

		
		
		
		