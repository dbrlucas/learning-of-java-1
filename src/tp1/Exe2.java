package tp1;
import java.util.Scanner;

public class Exe2 {
	/* 
	 Demande à l'utilisateur deux nombres entiers a et b puis :
	 - affiche les valeurs de a et b,
	 - échange les valeurs de a et b,
	 - affiche les nouvelles valeurs de a et b,
	 - affiche la valeur du double de a,
	 - affiche la valeur de la moitié de b,
	 - affiche le quotient et le reste de la division de a par b,
	 - affiche la plus grande valeur entre a et b.
	*/

	public static void main(String[] args) {
		System.out.println("Entrez deux nombres entiers : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("a = "+a+"    b = "+b);
		
		int c = a;
		a = b;
		b = c;
		
		System.out.println("a = "+a+"    b = "+b);
		
		System.out.println(a*2);
		
		System.out.println(b/2.0);
		
		System.out.println("Quotien : "+a/b+"    Reste : "+a%b);
		
		if (a>b) {
			System.out.println(a);
		}
		else {
			System.out.println(b);
		}
			
		sc.close();
	}
}