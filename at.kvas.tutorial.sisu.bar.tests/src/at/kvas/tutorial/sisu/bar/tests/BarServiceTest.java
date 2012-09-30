package at.kvas.tutorial.sisu.bar.tests;

import org.eclipse.sisu.Sisu;
import org.junit.Test;

import at.kvas.tutorial.sisu.bar.BarService;
import at.kvas.tutorial.sisu.bar.impl.BarServiceImpl;

public class BarServiceTest {

	@Test
	public void testWithoutSisu() {	
		BarService sut = new BarServiceImpl();
		sut.bar();		
	}
	
	@Test
	public void testWithSisu() {		
		BarService sut = Sisu.lookup(BarService.class);
		sut.bar();
	}
	
}
