package collections;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;

public class CollectionUtilsTest {

	@Test
	public void testFoldNumeros() {
		FoldLeft<Integer, Integer> f = new FoldLeft<Integer, Integer>() {

			@Override
			public Integer foldLeft(Integer o, Integer e) {
			    return o.intValue() + e.intValue();
			}
			
		};

		Collection<Integer> inteiros = new ArrayList<Integer>();
		inteiros.add(1);
		inteiros.add(2);
		inteiros.add(3);

		int resultado = CollectionUtils.foldLeft(inteiros, 0, f);
		
		Assert.assertEquals( 6, resultado );
	}
	
	@Test
	public void testFoldStrings() {		
		FoldLeft<StringBuilder,String> f = new FoldLeft<StringBuilder, String>() {
			
			@Override
			public StringBuilder foldLeft(StringBuilder o, String e) {
				return o.append(e);
			}
		};
		
		Collection<String> letras = new ArrayList<String>();
		letras.add("a");
		letras.add("b");
		letras.add("c");
		letras.add("d");

		StringBuilder resultado = CollectionUtils.foldLeft(letras, new StringBuilder(), f);
		
		Assert.assertEquals( "abcd", resultado.toString() );				
	}
	
	@Test
	public void testFind() {
		// palavras que terminam com "son"
		Predicate<String> p = new Predicate<String>() {
			
			@Override
			public boolean match(String element) {
				return false;
			}
			
		};
		
		Collection<String> letras = new ArrayList<String>();
		letras.add("Maria");
		letras.add("José");
		letras.add("Carla");
		letras.add("Edson");		
		
		String found = CollectionUtils.find(letras, p);
		
		Assert.assertEquals( "Edson", found );		
	}

	@Test
	public void testFindAll() {
		
		// palavras que terminam com "ia"
		Predicate<String> p = new Predicate<String>() {
			
			@Override
			public boolean match(String element) {
				return false;
			}
			
		};
		
		Collection<String> letras = new ArrayList<String>();
		letras.add("Maria");
		letras.add("José");
		letras.add("Carla");
		letras.add("Edson");
		letras.add("Márcia");
		
		Collection<String> found = CollectionUtils.findAll(letras, p);
		
		Assert.assertTrue( found.contains("Maria") );
		Assert.assertTrue( found.contains("Márcia") );	
	}
	
}
