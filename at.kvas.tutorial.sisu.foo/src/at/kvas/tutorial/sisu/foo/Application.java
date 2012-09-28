package at.kvas.tutorial.sisu.foo;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.sisu.Sisu;

import at.kvas.tutorial.sisu.bar.BarService;

/**
 * This class controls all aspects of the application's execution
 */
public class Application implements IApplication {	
	
	public Object start(IApplicationContext context) throws Exception {
		System.out.println("Foo");
		BarService bar = Sisu.lookup(BarService.class);
		
		bar.bar();
		
		return IApplication.EXIT_OK;
	}

	public void stop() {
		// nothing to do
	}
}
