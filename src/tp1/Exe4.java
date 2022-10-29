package tp1;

import java.util.Scanner;

public class Exe4 {
	//Parité d'une somme

	public static void main(String[] args) {
		System.out.println("Entrez trois nombres entiers : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
	    int s = a+b+c;
	    if  (s%2==0){
	    	System.out.println("La somme des trois entiers est paire.");
	    }
	    else {
	    	System.out.println("La somme des trois entiers est impaire.");
	    }
		sc.close();
	}
}
