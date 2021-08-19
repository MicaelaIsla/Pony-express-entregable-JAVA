package estaciones;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class PonyTest {
	  Estacion estacion;

	  @Before
	  public void setUp() {
	    estacion = new Estacion();
	     }
	  

		@Test
		public void creacion() {
			Object caballos = 1;
			assertNotNull(caballos);		
		}



	  @Test
		public void Test1(){
			assertEquals(3, Estacion.caballos(new int[] {33, 8, 16, 47, 30, 30, 46}));
		}

	  @Test
			public void Test2(){
			
				assertEquals(3, Estacion.caballos(new int[] {51, 51, 51}));
			}

	  @Test
		public void Test3(){
		
			assertEquals(4, Estacion.caballos(new int[] { 6, 24, 6, 8, 28, 8, 23, 47, 17, 29, 37, 18, 40, 49 }));
		}
	  

	  @Test
		public void Test4(){
		
			assertEquals(2, Estacion.caballos(new int[] { 43, 23, 40, 13 }));
  }
	  @Test
		public void Test5()
		{
			Assert.assertEquals(2, Estacion.caballos(new int[] {99, 2}));
		}
	  @Test
			public void Test6()
			{
				Assert.assertEquals(1, Estacion.caballos(new int[] {100}));
			}
}