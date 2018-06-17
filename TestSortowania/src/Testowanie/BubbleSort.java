package Testowanie;

import java.util.Scanner;

class BubbleSort {
// sortowanie w rosn¹cej kolejnoœci
	public static void sortowanieBabelkoweAsc(int[] daneWsadowe) {

		for(int i = 0; i < daneWsadowe.length -1; i++) {
			for (int j = 0; j < (daneWsadowe.length-i)-1; j++) {
				if (daneWsadowe[j] > daneWsadowe[j+1]) {
					int x = daneWsadowe[j];
					daneWsadowe[j] = daneWsadowe[j+1];
					daneWsadowe[j+1] = x;
				}
			}
		}
	}
// sortowanie w malej¹cej kolejnoœci	
	public static void sortowanieBabelkoweDesc(int[] daneWsadowe) {

		for(int i = 0; i < daneWsadowe.length; i++) {
			for (int j = 1; j < daneWsadowe.length-i; j++) {
				if (daneWsadowe[j-1] < daneWsadowe[j]) {
					int x = daneWsadowe[j-1];
					daneWsadowe[j-1] = daneWsadowe[j];
					daneWsadowe[j] = x;
				}
			}
		}
	}
	

	public static void pokazTablice(int[] daneWsadowe) {
		for (int x : daneWsadowe)
			System.out.print(x + " ");
		System.out.println();
	}

	public static void main(String[] args) {
// pobieranie danych od u¿ytkownika
		int daneWsadowe;
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		System.out.println("Ile liczb ma byæ posortowane?");
		daneWsadowe = in.nextInt();

		int tablica[] = new int[daneWsadowe];

		System.out.println("Wpisz " + daneWsadowe + " liczb");

		for (int i = 0; i < daneWsadowe; i++)
			tablica[i] = in.nextInt();

		pokazTablice(tablica); // wypisywanie tablicy w kolejnoœci wprowadzenia danych od u¿ytkownika
		sortowanieBabelkoweAsc(tablica); // sortowanie rosn¹ce
		pokazTablice(tablica); // wypisanie posortowanej rosn¹co tablicy
		sortowanieBabelkoweDesc(tablica); // sortowanie malej¹ce
		pokazTablice(tablica); // wypisanie posortowanej malej¹co tablicy

		}
}