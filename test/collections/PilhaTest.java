package collections;

import org.junit.Assert;
import org.junit.Test;

public class PilhaTest {

	@Test
	public void testPush() {		
		Pilha<String> pilha = null;
		pilha.push("José");
		
		Assert.assertEquals( "José", pilha.peek() );
		Assert.assertEquals(1, pilha.size());		
	}
	
	@Test
	public void testPop() {
		Pilha<String> pilha = null;
		pilha.push("José");
		pilha.push("Maria");
		
		String maria = pilha.pop();
		
		Assert.assertEquals( "Maria", maria);
		Assert.assertEquals( "José", pilha.peek() );
		Assert.assertEquals( 1, pilha.size());		
	}
	
}