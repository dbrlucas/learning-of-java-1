package tp1;

public class Exe6 {
	//Conversion secondes

	public static void main(String[] args) {
		
		int s = 654321;
		int jour = s/86400;
		int reste1 = s%86400;
		int heure = reste1/3600;
		int reste2 = reste1%3600;
		int min = reste2/60;
		int sec = reste2%60;
	}
}
