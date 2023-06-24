import java.util.Scanner;

public class main {

 public static void main(String[] args) {
	
//Find the hypotenuse of a right triangle
	 
Scanner scanner = new Scanner(System.in);

System.out.println("First edge:");
int a = scanner.nextInt();

System.out.println("Second edge:");
int b = scanner.nextInt();

double h = Math.sqrt(a*a + b*b);
System.out.println("Hypotenuse: " + h);






	
 }
}
