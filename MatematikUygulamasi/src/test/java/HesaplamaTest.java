import static org.junit.Assert.*;

import org.junit.Test;

public class HesaplamaTest {

	@Test
	public void testToplaHepsi() {
		
		for (int sayi1=-10000; sayi1<10001; sayi1++) {
			for (int sayi2=-10000;sayi2<10001; sayi2++) {
				int gercekSonuc = Hesaplama.topla(sayi1, sayi2);
				assertEquals(sayi1+sayi2, gercekSonuc);
			}
		}
		
	}
	
	
	@Test
	public void testTopla25ve14() {
		int gercekSonuc = Hesaplama.topla(25, 14);
		assertEquals(39, gercekSonuc);
	}
	@Test
	public void testTopla10ve20() {
		int gercekSonuc1 = Hesaplama.topla(10, 20);
		assertEquals(30, gercekSonuc1);
	}
	@Test
	public void testCarpma1ve2() {
		int gercekSonuc2 = Hesaplama.carpma(1, 2);
		assertEquals(30, gercekSonuc2);
	}
	@Test
	public void testToplaNegatif() {
		int gercekSonuc = Hesaplama.topla(-25, -14);
		assertEquals(-39, gercekSonuc);
	}

}
