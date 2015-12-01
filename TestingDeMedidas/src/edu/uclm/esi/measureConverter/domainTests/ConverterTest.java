package edu.uclm.esi.measureConverter.domainTests;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.uclm.esi.measureConverter.domain.Converter;

public class ConverterTest {

	@Test
	public void testC2C() { //convertir de celsius a celsius 10ºC
		Converter c = new Converter();
		try {
			double result = c.convert("C", "C", 10);
			assertTrue(result==10);
		} catch (Exception e) {
			fail("No esperaba excepción"); //lo ponemos para decir que hemos encontrado un error en el caso de prueba
		}
	}
	
	@Test
	public void testKm2M() { 
		Converter c = new Converter();
		try {
			double result = c.convert("KM", "M", 10);
			assertTrue(result==10000);
		} catch (Exception e) {
			fail("No esperaba excepción"); 
		}
	}
	
	@Test
	public void testC2K() { 
		Converter c = new Converter();
		try {
			double result = c.convert("C", "K", 0);
			assertTrue(result==273); //Da failures aqui
		} catch (Exception e) {
			fail("No esperaba excepción"); 
		}
	}
	
	@Test
	public void testC2F() { 
		Converter c = new Converter();
		try {
			double result = c.convert("C", "F", -500);
			fail("Esperaba excepción"); //se esperaba excepcion y no se esta produciendo, por lo que estamos encontrando otro fallo (failures: 2)
		} catch (Exception e) {
			
		}
	}
	
	@Test
	public void testY2Y() { 
		Converter c = new Converter();
		try {
			double result = c.convert("Y", "Y", 1);
			assertTrue(result==1); 
		} catch (Exception e) {
			fail("No esperaba excepción"); 			
		}
	}
	
	@Test
	public void testK2Y() { 
		Converter c = new Converter();
		try {
			double result = c.convert("M", "Y", 100);
			assertTrue(result==109.361); 
		} catch (Exception e) {
			fail("No esperaba excepción"); 			
		}
	}
	 //Ver codigo que estamos o no recorriendo, bajar pluging 
	//AMARILLO: SE HA PASADO PARCIALMENTE 
	//ROJO: no se ha pasado  
	//VERDE: ha pasado
	
	@Test
	public void test1() { 
		Converter c = new Converter();
		try {
			double result = c.convert("C", "C", -500);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test2() { 
		Converter c = new Converter();
		try {
			double result = c.convert("C", "F", -459.1);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test3() { 
		Converter c = new Converter();
		try {
			double result = c.convert("C", "K", -459);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test4() { 
		Converter c = new Converter();
		try {
			double result = c.convert("C", "KM", -273.1);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test5() { 
		Converter c = new Converter();
		try {
			double result = c.convert("C", "M", -273);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test6() { 
		Converter c = new Converter();
		try {
			double result = c.convert("C", "I", -0.01);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test7() { 
		Converter c = new Converter();
		try {
			double result = c.convert("C", "ML", -500);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test8() { 
		Converter c = new Converter();
		try {
			double result = c.convert("C", "Y", -459.1);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test9() { 
		Converter c = new Converter();
		try {
			double result = c.convert("C", "KG", -459);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test10() { 
		Converter c = new Converter();
		try {
			double result = c.convert("C", "P", -273.1);
		} catch (Exception e) {
							
		}
	}
	
	@Test
	public void test97() { 
		Converter c = new Converter();
		try {
			double result = c.convert("KG", "C", -459);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test98() { 
		Converter c = new Converter();
		try {
			double result = c.convert("KG", "F", -273.1);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test99() { 
		Converter c = new Converter();
		try {
			double result = c.convert("KG", "K", -273);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test100() { 
		Converter c = new Converter();
		try {
			double result = c.convert("KG", "KM", -0.01);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test101() { 
		Converter c = new Converter();
		try {
			double result = c.convert("KG", "M", -500);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test102() { 
		Converter c = new Converter();
		try {
			double result = c.convert("KG", "I", -459.1);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test103() { 
		Converter c = new Converter();
		try {
			double result = c.convert("KG", "ML", -459);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test104() { 
		Converter c = new Converter();
		try {
			double result = c.convert("KG", "Y", -273.1);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test105() { 
		Converter c = new Converter();
		try {
			double result = c.convert("KG", "KG", -500);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test106() { 
		Converter c = new Converter();
		try {
			double result = c.convert("KG", "P", -459.1);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test107() { 
		Converter c = new Converter();
		try {
			double result = c.convert("KG", "O", -500);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test108() { 
		Converter c = new Converter();
		try {
			double result = c.convert("KG", "GR", -459.1);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test11() { 
		Converter c = new Converter();
		try {
			double result = c.convert("C", "O", -273);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test12() { 
		Converter c = new Converter();
		try {
			double result = c.convert("C", "GR", -0.01);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test13() { 
		Converter c = new Converter();
		try {
			double result = c.convert("F", "C", -459.1);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test14() { 
		Converter c = new Converter();
		try {
			double result = c.convert("F", "F", -500);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test15() { 
		Converter c = new Converter();
		try {
			double result = c.convert("F", "K", -273.1);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test16() { 
		Converter c = new Converter();
		try {
			double result = c.convert("F", "KM", -459);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test17() { 
		Converter c = new Converter();
		try {
			double result = c.convert("F", "M", -0.01);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test18() { 
		Converter c = new Converter();
		try {
			double result = c.convert("F", "I", -273);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test19() { 
		Converter c = new Converter();
		try {
			double result = c.convert("F", "ML", -459.1);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test20() { 
		Converter c = new Converter();
		try {
			double result = c.convert("F", "Y", -500);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test21() { 
		Converter c = new Converter();
		try {
			double result = c.convert("F", "KG", -273.1);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test22() { 
		Converter c = new Converter();
		try {
			double result = c.convert("F", "P", -459);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test23() { 
		Converter c = new Converter();
		try {
			double result = c.convert("F", "O", -0.01);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test24() { 
		Converter c = new Converter();
		try {
			double result = c.convert("F", "GR", -273);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test25() { 
		Converter c = new Converter();
		try {
			double result = c.convert("K", "C", -459);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test26() { 
		Converter c = new Converter();
		try {
			double result = c.convert("K", "F", -273.1);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test27() { 
		Converter c = new Converter();
		try {
			double result = c.convert("K", "K", -500);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test28() { 
		Converter c = new Converter();
		try {
			double result = c.convert("K", "KM", -459.1);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test29() { 
		Converter c = new Converter();
		try {
			double result = c.convert("K", "M", -500);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test30() { 
		Converter c = new Converter();
		try {
			double result = c.convert("K", "I", -459.1);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test31() { 
		Converter c = new Converter();
		try {
			double result = c.convert("K", "ML", -273);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test32() { 
		Converter c = new Converter();
		try {
			double result = c.convert("K", "Y", -0.01);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test33() { 
		Converter c = new Converter();
		try {
			double result = c.convert("K", "KG", -273);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test34() { 
		Converter c = new Converter();
		try {
			double result = c.convert("K", "P", -0.01);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test35() { 
		Converter c = new Converter();
		try {
			double result = c.convert("K", "O", -459);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test36() { 
		Converter c = new Converter();
		try {
			double result = c.convert("K", "GR", -273.1);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test37() { 
		Converter c = new Converter();
		try {
			double result = c.convert("KM", "C", -273.1);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test38() { 
		Converter c = new Converter();
		try {
			double result = c.convert("KM", "F", -459);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test39() { 
		Converter c = new Converter();
		try {
			double result = c.convert("KM", "K", -459.1);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test40() { 
		Converter c = new Converter();
		try {
			double result = c.convert("KM", "KM", -500);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test41() { 
		Converter c = new Converter();
		try {
			double result = c.convert("KM", "M", -459.1);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test42() { 
		Converter c = new Converter();
		try {
			double result = c.convert("KM", "I", -500);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test43() { 
		Converter c = new Converter();
		try {
			double result = c.convert("KM", "ML", -0.01);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test44() { 
		Converter c = new Converter();
		try {
			double result = c.convert("KM", "Y", -273);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test45() { 
		Converter c = new Converter();
		try {
			double result = c.convert("KM", "KG", -0.01);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test46() { 
		Converter c = new Converter();
		try {
			double result = c.convert("KM", "P", -273);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test47() { 
		Converter c = new Converter();
		try {
			double result = c.convert("KM", "O", -273.1);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test48() { 
		Converter c = new Converter();
		try {
			double result = c.convert("KM", "GR", -459);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test49() { 
		Converter c = new Converter();
		try {
			double result = c.convert("M", "C", -273);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test50() { 
		Converter c = new Converter();
		try {
			double result = c.convert("M", "F", -0.01);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test51() { 
		Converter c = new Converter();
		try {
			double result = c.convert("M", "K", -500);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test52() { 
		Converter c = new Converter();
		try {
			double result = c.convert("M", "KM", -459.1);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test53() { 
		Converter c = new Converter();
		try {
			double result = c.convert("M", "M", -459);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test54() { 
		Converter c = new Converter();
		try {
			double result = c.convert("M", "I", -273.1);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test55() { 
		Converter c = new Converter();
		try {
			double result = c.convert("M", "ML", -459);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test56() { 
		Converter c = new Converter();
		try {
			double result = c.convert("M", "Y", -273.1);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test57() { 
		Converter c = new Converter();
		try {
			double result = c.convert("M", "KG", -500);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test58() { 
		Converter c = new Converter();
		try {
			double result = c.convert("M", "P", -459.1);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test59() { 
		Converter c = new Converter();
		try {
			double result = c.convert("M", "O", -500);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test60() { 
		Converter c = new Converter();
		try {
			double result = c.convert("M", "GR", -459.1);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test61() { 
		Converter c = new Converter();
		try {
			double result = c.convert("I", "C", -0.01);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test62() { 
		Converter c = new Converter();
		try {
			double result = c.convert("I", "F", -273);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test63() { 
		Converter c = new Converter();
		try {
			double result = c.convert("I", "K", -459.1);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test64() { 
		Converter c = new Converter();
		try {
			double result = c.convert("I", "KM", -500);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test65() { 
		Converter c = new Converter();
		try {
			double result = c.convert("I", "M", -273.1);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test66() { 
		Converter c = new Converter();
		try {
			double result = c.convert("I", "I", -459);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test67() { 
		Converter c = new Converter();
		try {
			double result = c.convert("I", "ML", -273.1);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test68() { 
		Converter c = new Converter();
		try {
			double result = c.convert("I", "Y", -459);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test69() { 
		Converter c = new Converter();
		try {
			double result = c.convert("I", "KG", -459.1);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test70() { 
		Converter c = new Converter();
		try {
			double result = c.convert("I", "P", -500);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test71() { 
		Converter c = new Converter();
		try {
			double result = c.convert("I", "O", -459.1);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test72() { 
		Converter c = new Converter();
		try {
			double result = c.convert("I", "GR", -500);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test73() { 
		Converter c = new Converter();
		try {
			double result = c.convert("ML", "C", -500);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test74() { 
		Converter c = new Converter();
		try {
			double result = c.convert("ML", "F", -459.1);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test75() { 
		Converter c = new Converter();
		try {
			double result = c.convert("ML", "K", -273);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test76() { 
		Converter c = new Converter();
		try {
			double result = c.convert("ML", "KM", -0.01);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test77() { 
		Converter c = new Converter();
		try {
			double result = c.convert("ML", "M", -459);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test78() { 
		Converter c = new Converter();
		try {
			double result = c.convert("ML", "I", -273.1);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test79() { 
		Converter c = new Converter();
		try {
			double result = c.convert("ML", "ML", -500);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test80() { 
		Converter c = new Converter();
		try {
			double result = c.convert("ML", "Y", -459.1);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test81() { 
		Converter c = new Converter();
		try {
			double result = c.convert("ML", "KG", -459);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test82() { 
		Converter c = new Converter();
		try {
			double result = c.convert("ML", "P", -273.1);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test83() { 
		Converter c = new Converter();
		try {
			double result = c.convert("ML", "O", -273);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test84() { 
		Converter c = new Converter();
		try {
			double result = c.convert("ML", "GR", -0.01);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test85() { 
		Converter c = new Converter();
		try {
			double result = c.convert("Y", "C", -459.1);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test86() { 
		Converter c = new Converter();
		try {
			double result = c.convert("Y", "F", -500);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test87() { 
		Converter c = new Converter();
		try {
			double result = c.convert("Y", "K", -0.01);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test88() { 
		Converter c = new Converter();
		try {
			double result = c.convert("Y", "KM", -273);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test89() { 
		Converter c = new Converter();
		try {
			double result = c.convert("Y", "M", -273.1);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test90() { 
		Converter c = new Converter();
		try {
			double result = c.convert("Y", "I", -459);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test91() { 
		Converter c = new Converter();
		try {
			double result = c.convert("Y", "ML", -459.1);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test92() { 
		Converter c = new Converter();
		try {
			double result = c.convert("Y", "Y", -500);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test93() { 
		Converter c = new Converter();
		try {
			double result = c.convert("Y", "KG", -273.1);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test94() { 
		Converter c = new Converter();
		try {
			double result = c.convert("Y", "P", -459);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test95() { 
		Converter c = new Converter();
		try {
			double result = c.convert("Y", "O", -0.01);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test96() { 
		Converter c = new Converter();
		try {
			double result = c.convert("Y", "GR", -273);
		} catch (Exception e) {
							
		}
	}


	


	@Test
	public void test109() { 
		Converter c = new Converter();
		try {
			double result = c.convert("P", "C", -273.1);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test110() { 
		Converter c = new Converter();
		try {
			double result = c.convert("P", "F", -459);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test111() { 
		Converter c = new Converter();
		try {
			double result = c.convert("P", "K", -0.01);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test112() { 
		Converter c = new Converter();
		try {
			double result = c.convert("P", "KM", -273);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test113() { 
		Converter c = new Converter();
		try {
			double result = c.convert("P", "M", -459.1);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test114() { 
		Converter c = new Converter();
		try {
			double result = c.convert("P", "I", -500);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test115() { 
		Converter c = new Converter();
		try {
			double result = c.convert("P", "ML", -273.1);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test116() { 
		Converter c = new Converter();
		try {
			double result = c.convert("P", "Y", -459);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test117() { 
		Converter c = new Converter();
		try {
			double result = c.convert("P", "KG", -459.1);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test118() { 
		Converter c = new Converter();
		try {
			double result = c.convert("P", "P", -500);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test119() { 
		Converter c = new Converter();
		try {
			double result = c.convert("P", "O", -459.1);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test120() { 
		Converter c = new Converter();
		try {
			double result = c.convert("P", "GR", -500);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test121() { 
		Converter c = new Converter();
		try {
			double result = c.convert("O", "C", -273);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test122() { 
		Converter c = new Converter();
		try {
			double result = c.convert("O", "F", -0.01);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test123() { 
		Converter c = new Converter();
		try {
			double result = c.convert("O", "K", -459);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test124() { 
		Converter c = new Converter();
		try {
			double result = c.convert("O", "KM", -273.1);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test125() { 
		Converter c = new Converter();
		try {
			double result = c.convert("O", "M", -500);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test126() { 
		Converter c = new Converter();
		try {
			double result = c.convert("O", "I", -459.1);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test127() { 
		Converter c = new Converter();
		try {
			double result = c.convert("O", "ML", -273);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test128() { 
		Converter c = new Converter();
		try {
			double result = c.convert("O", "Y", -0.01);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test129() { 
		Converter c = new Converter();
		try {
			double result = c.convert("O", "KG", -500);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test130() { 
		Converter c = new Converter();
		try {
			double result = c.convert("O", "P", -459.1);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test131() { 
		Converter c = new Converter();
		try {
			double result = c.convert("O", "O", -459);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test132() { 
		Converter c = new Converter();
		try {
			double result = c.convert("O", "GR", -273.1);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test133() { 
		Converter c = new Converter();
		try {
			double result = c.convert("GR", "C", -0.01);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test134() { 
		Converter c = new Converter();
		try {
			double result = c.convert("GR", "F", -273);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test135() { 
		Converter c = new Converter();
		try {
			double result = c.convert("GR", "K", -273.1);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test136() { 
		Converter c = new Converter();
		try {
			double result = c.convert("GR", "KM", -459);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test137() { 
		Converter c = new Converter();
		try {
			double result = c.convert("GR", "M", -459.1);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test138() { 
		Converter c = new Converter();
		try {
			double result = c.convert("GR", "I", -500);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test139() { 
		Converter c = new Converter();
		try {
			double result = c.convert("GR", "ML", -0.01);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test140() { 
		Converter c = new Converter();
		try {
			double result = c.convert("GR", "Y", -273);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test141() { 
		Converter c = new Converter();
		try {
			double result = c.convert("GR", "KG", -459.1);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test142() { 
		Converter c = new Converter();
		try {
			double result = c.convert("GR", "P", -500);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test143() { 
		Converter c = new Converter();
		try {
			double result = c.convert("GR", "O", -273.1);
		} catch (Exception e) {
							
		}
	}


	@Test
	public void test144() { 
		Converter c = new Converter();
		try {
			double result = c.convert("GR", "GR", -459);
		} catch (Exception e) {
							
		}
	}



}
