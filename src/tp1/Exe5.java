package tp1;
import java.util.Scanner;

public class Exe5 {
	// Affiche dans l'ordre croissant les valeurs de trois entiers saisis par l'utilisateur en utilisant des instructions conditionnelles if-else.

	public static void main(String[] args) {
		System.out.println("Entrez trois nombres entiers : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if ((a>=b) && (a>=c) && (b>=c)) {
			System.out.println(c+" <= "+b+" <= "+a);
		}
		else {
			if ((a>=c) && (a>=b) && (c>=b)) {
				System.out.println(b+" <= "+c+" <= "+a);
			}
			else {
				if ((b>=a) && (b>=c) && (a>=c)) {
					System.out.println(c+" <= "+a+" <= "+b);
				}
				else {
					if ((b>=c) && (b>=a) && (c>=a)) {
						System.out.println(a+" <= "+c+" <= "+b);
					}
					else {
						if ((c>=a) && (c>=b) && (a>=b)) {
							System.out.println(b+" <= "+a+" <= "+c);
						}
						else {
							if ((c>=b) && (c>=a) && (b>=a)) {
								System.out.println(a+" <= "+b+" <= "+c);
							}
						}
					}
				}
			}
		}
		sc.close();
	}
}