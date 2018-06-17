package pl.org.schroeder;

import java.util.Scanner;

public class MenOrWomen {

	public static void main(String[] args) {
		String[] imiona = new String[5];
		Scanner licznikOsob = new Scanner(System.in);
		Scanner odczyt = new Scanner(System.in);
		int licznikKobiet = 0, licznikMezczyzn = 0;
		
		System.out.println("Ile osób chcesz sprawdziæ?");
		int liczbaImion = licznikOsob.nextInt();
		
		for (int i = 0; i < liczbaImion; i++) 
		{
			System.out.print("Podaj " + (i + 1) + " imiê: ");
			imiona[i] = odczyt.nextLine();
		}
		
		System.out.println();
		
		for (int i = 0; i < liczbaImion; i++) 
		{
			if ((imiona[i].lastIndexOf("a", (imiona[i].length() - 1)) == imiona[i].length() - 1)) 
			{
				licznikKobiet++;
			} 
			else 
			{
				licznikMezczyzn++;
			}
		}

		System.out.println(licznikKobiet + " kobiety, o imionach: ");

		for (int i = 0; i < liczbaImion; i++) 
		{
			if ((imiona[i].lastIndexOf("a", (imiona[i].length() - 1)) == imiona[i].length() - 1)) 
			{
				System.out.println(imiona[i]);
			}
		}
		
		System.out.println();
		
		System.out.println(licznikMezczyzn + " mê¿czyzn, o imionach: ");
		
		for (int i = 0; i < liczbaImion; i++) 
		{
			if ((imiona[i].lastIndexOf("a", (imiona[i].length() - 1)) != imiona[i].length() - 1)) 
			{
				System.out.println(imiona[i]);
			}
		}
	}
}
