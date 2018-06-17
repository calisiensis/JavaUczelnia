package pl.org.schroeder;

import java.util.Scanner;

public class PESELcheck {

	public static void main(String[] args) {
		
		String pesel;
		// zmienne tester maj¹ sprawdziæ, czy pierwsza cyfra miesi¹ca w PESEL nale¿y do
		// osób urodzonych przed rokiem 2000.
		// osoby urodzone po 2000 roku maj¹ w tym miejscu wartoœæ "2" lub "3".
		// jest to utworzone po to, by wyœwieliæ odpowiedni format roku urodzenia
		String tester1 = "0";
		String tester2 = "1";
		String tester3 = "2";
		String tester4 = "3";

		Scanner odczyt = new Scanner(System.in);

		System.out.print("Podaj PESEL: ");
		pesel = odczyt.nextLine();

		String miesiacPeselowy = pesel.substring(2, 3); // ta zmienna to trzecia cyfra numeru PESEL

		if (pesel.length() != 11) {
			System.out.println("Nieodpowiednia d³ugoœæ numeru PESEL!");
		}
// system drukuje daty urodzenia w formatach:
// DD.MM.YYYY oraz
// MM/DD/YYYY
		else {
			if ((miesiacPeselowy.equals(tester1)) || (miesiacPeselowy.equals(tester2))) {
				System.out.println((((pesel.substring(4, 6)).concat(".")).concat((pesel.substring(2, 4))).concat(".19")).concat(pesel.substring(0, 2)));
				System.out.println((((pesel.substring(2, 4)).concat("/")).concat((pesel.substring(4, 6))).concat("/19")).concat(pesel.substring(0, 2)));
			}

			else if (miesiacPeselowy.equals(tester3)) {
				pesel = pesel.replace(miesiacPeselowy, "0"); // zamieniamy "2" w trzeciej cyfrze PESELu na "0"
				System.out.println((((pesel.substring(4, 6)).concat(".")).concat((pesel.substring(2, 4))).concat(".20")).concat(pesel.substring(0, 2)));
				System.out.println((((pesel.substring(2, 4)).concat("/")).concat((pesel.substring(4, 6))).concat("/20")).concat(pesel.substring(0, 2)));
			}

			else if (miesiacPeselowy.equals(tester4)) {
				pesel = pesel.replace(miesiacPeselowy, "1"); // zamieniamy "3" w trzeciej cyfrze PESELu na "1"
				System.out.println((((pesel.substring(4, 6)).concat(".")).concat((pesel.substring(2, 4))).concat(".20")).concat(pesel.substring(0, 2)));
				System.out.println((((pesel.substring(2, 4)).concat("/")).concat((pesel.substring(4, 6))).concat("/20")).concat(pesel.substring(0, 2)));
			}

			else {
				System.out.println((((pesel.substring(4, 6)).concat(".")).concat((pesel.substring(2, 4))).concat(".20")).concat(pesel.substring(0, 2)));
				System.out.println((((pesel.substring(2, 4)).concat("/")).concat((pesel.substring(4, 6))).concat("/20")).concat(pesel.substring(0, 2)));
			}
		}
	}
}
