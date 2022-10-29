package tp1;
import java.util.Scanner;

public class Exe3 {
	// Demande à l'utilisateur de saisir un entier, et affiche si oui ou non cet entier correspond à une année bissextile.

	public static void main(String[] args) {
		System.out.print("Entrez un nombre entier : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (((a%4 == 0) & (a%100 != 0)) | (a%400 == 0)) {
			System.out.println("L'entier "+a+" correspond à une année bissextile.");
		}
		else {
			System.out.println("L'entier "+a+" ne correspond pas à une année bissextile.");
		}
		sc.close();
	}
} 