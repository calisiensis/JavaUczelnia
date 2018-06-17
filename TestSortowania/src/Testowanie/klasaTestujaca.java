package Testowanie;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Before;
import org.junit.jupiter.api.Test;


class klasaTestujaca {
	
	
	public BubbleSort sortowanieBabelkowe;
	
	@Before
	public void inicjuj()  {
	
		this.sortowanieBabelkowe = new BubbleSort();
	}
	
	@Test
	public void nieRobNiczegoJakPusto() {
		int [] tablica = {};
		int [] spodziewanaKolejnosc = {};
		BubbleSort.sortowanieBabelkoweAsc(tablica);
		assertArrayEquals(spodziewanaKolejnosc, tablica);
	}

	@Test
	public void nieRobNiczegoJakJestJedenElement() {
		int [] tablica = {66};
		BubbleSort.sortowanieBabelkoweAsc(tablica);
		assertArrayEquals(new int[] {66}, tablica);
	}
	
	@Test
	public void sortowaniePoprawne() {
		int[] tablica = {0, 95, -2, 41, 7};
		int[] spodziewanaKolejnosc = {-2, 0, 7, 41, 95};
		BubbleSort.sortowanieBabelkoweAsc(tablica);
		assertArrayEquals(spodziewanaKolejnosc, tablica);
	}
	
	@Test
	public void sortowaniePoprawneDuble() {
		int[] tablica = {2, 2, 1};
		int[] spodziewanaKolejnosc = {1, 2, 2};
		BubbleSort.sortowanieBabelkoweAsc(tablica);
		assertArrayEquals(spodziewanaKolejnosc, tablica);
	}

		
}
