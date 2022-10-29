package tp1;

import java.util.Scanner;

public class Exe5 {
	//Affichage dans l'ordre croissant

	public static void main(String[] args) {
		System.out.println("Entrez trois nombres entiers : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if ((a>b)&(a>b)&(b>c)) {
			System.out.println(c+" <= "+b+" <= "+a);
		}
		if ((a<b)&(a<b)&(b<c)) {
			System.out.println(a+" <= "+b+" <= "+c);
		}
		sc.close();
	}
}
