package at.kvas.tutorial.sisu.baz.tests;

import org.eclipse.sisu.Sisu;
import org.junit.Test;
import org.mockito.Mockito;

import at.kvas.tutorial.sisu.bar.BarService;
import at.kvas.tutorial.sisu.baz.BazService;
import at.kvas.tutorial.sisu.baz.impl.BazServiceImpl;

public class BazServiceTest {

	/**
	 * Mock dependencies with Mockito.
	 */
	@Test
	public void testWithoutSisuMocked() {	
		// Arrange
		BarService mock = Mockito.mock(BarService.class);		
		BazService sut = new BazServiceImpl(mock);
		
		// Act
		sut.baz();		
	}
	
	/**
	 * Provide dependencies by hand.
	 */
	@Test
	public void testWithoutSisuPlain() {
		// Arrange
		BarService testImpl = new BarService() {
			public void bar() {};		
		};
		BazService sut = new BazServiceImpl(testImpl);
		
		// Act
		sut.baz();		
	}
	
	/**
	 * Rely on Sisu to inject. However, no special test
	 * dependencies are possible.
	 */
	@Test
	public void testWithSisu() {
		// Arrange
		BazService sut = Sisu.lookup(BazService.class);
		
		// Act
		sut.baz();
	}
	
}
