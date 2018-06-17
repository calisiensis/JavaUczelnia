package Testowanie;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Before;
import org.junit.jupiter.api.Test;


class klasaTestujaca2 {
	
	
	public BubbleSort sortowanieBabelkowe;
	
	@Before
	public void inicjuj()  {
	
		this.sortowanieBabelkowe = new BubbleSort();
	}
	
	@Test
	public void nieRobNiczegoJakPusto() {
		int [] tablica = {};
		int [] spodziewanaKolejnosc = {};
		BubbleSort.sortowanieBabelkoweDesc(tablica);
		assertArrayEquals(spodziewanaKolejnosc, tablica);
	}

	@Test
	public void nieRobNiczegoJakJestJedenElement() {
		int [] tablica = {44};
		BubbleSort.sortowanieBabelkoweDesc(tablica);
		assertArrayEquals(new int[] {44}, tablica);
	}
	
	@Test
	public void sortowaniePoprawne() {
		int[] tablica = {0, -98, 13, 6, 46};
		int[] spodziewanaKolejnosc = {46, 13, 6, 0, -98};
		BubbleSort.sortowanieBabelkoweDesc(tablica);
		assertArrayEquals(spodziewanaKolejnosc, tablica);
	}
	
	@Test
	public void sortowaniePoprawneDuble() {
		int[] tablica = {8, 3, 8};
		int[] spodziewanaKolejnosc = {8, 8, 3};
		BubbleSort.sortowanieBabelkoweDesc(tablica);
		assertArrayEquals(spodziewanaKolejnosc, tablica);
	}
		
}
