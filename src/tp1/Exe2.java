package tp1;
import java.util.Scanner;

public class Exe2 {
	//Sasie et opérations de base

	public static void main(String[] args) {
		System.out.println("Entrez deux nombres entiers : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("a = "+a+"   b = "+b);
		
		int c = a;
		a = b;
		b = c;
		System.out.println("a = "+a+"   b = "+b);
		
		System.out.println(a*2);
		
		System.out.println(b/2.0);
		
		System.out.println("quotien : "+a/b+"   reste : "+a%b);
		
		if (a>b) {
			System.out.println(a);
		}
		else {
			System.out.println(b);
		}
			
		sc.close();
	}
}
