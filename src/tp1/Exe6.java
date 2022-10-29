package tp1;
import java.util.Scanner;

public class Exe6 {
	// Demande à l'utilisateur un nombre entier de secondes puis affiche le nombre correspondant de jours, heures, minutes et secondes.

	public static void main(String[] args) {
		System.out.print("Entrez un nombre entier de secondes : ");
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int jour = s/86400;
		int reste1 = s%86400;
		int heure = reste1/3600;
		int reste2 = reste1%3600;
		int min = reste2/60;
		int sec = reste2%60;
		System.out.println(s+" secondes correspond à "+jour+" jours, "+heure+" heures, "+min+" minutes et "+sec+" secondes.");
		sc.close();
	}
}