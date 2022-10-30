package tp1;
import java.util.Scanner;

public class Exe4 {

	public static void main(String[] args) {
		// Demande à l'utilisateur de saisir 3 entiers, et affiche si leur somme est paire ou impaire.
		System.out.println("Entrez trois nombres entiers : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
	    int somme = a+b+c;
	    if  (somme%2 == 0) {
	    	System.out.println("La somme des trois entiers est paire.");
	    }
	    else {
	    	System.out.println("La somme des trois entiers est impaire.");
	    }
		sc.close();
	}
}