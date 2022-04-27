package main.java.unit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import main.java.unit.Cadena;

class TestCadena {

	@ValueSource(strings= {"halah","anna"})
	@ParameterizedTest
	void esCapicuaCadenaTestconString(String valor) {
		Cadena cadena2=new Cadena(valor);
		assertEquals(cadena2.esAnagrama(), true);
	}
	
	@ValueSource(strings= {"halah","anna"})
	@ParameterizedTest
	void esCapicuaCadenaTestconStringboolean(String valor) {
		Cadena cadena2=new Cadena(valor);
		assertEquals(cadena2.esAnagrama(valor), true);
	}
	
	
	@ValueSource(ints = {121,2332})
	@ParameterizedTest
	void esCapicuaCadenaTestconInteger(int valor) {
		Cadena cadena2=new Cadena(valor);
		assertEquals(cadena2.esCapicua(), true);
	}
	
	@ValueSource(doubles = {12.21,23.32})
	@ParameterizedTest
	void esCapicuaCadenaTestconDouble(double valor) {
		Cadena cadena2=new Cadena(valor);
		assertEquals(cadena2.esCapicua(valor), true);
	}
	
	@ValueSource(longs = {1222221,322222223})
	@ParameterizedTest
	void esCapicuaCadenaTestconLong(Long valor) {
		Cadena cadena2=new Cadena(valor);
		assertEquals(cadena2.esCapicua(valor), true);
	}
	
	@ValueSource(strings= {""," "})
	@ParameterizedTest
	void esCapicuaCadenaTestconStringsVacio(String valor) {
		Cadena cadena2=new Cadena(valor);
		assertEquals(cadena2.esAnagrama(), false);
	}
	
	@ValueSource(strings= {"hola","pinpon"})
	@ParameterizedTest
	void esCapicuaCadenaTestconStringSeaFalso(String valor) {
		Cadena cadena2=new Cadena(valor);
		assertEquals(cadena2.esAnagrama(), false);
	}
	
	@ValueSource(strings= {" ana     "})
	@ParameterizedTest
	void esCapicuaCadenaTestconStringSeaNulo(String valor) {
		Cadena cadena2=new Cadena(valor);
		assertEquals(cadena2.esAnagrama(), false);
	}
	

}
