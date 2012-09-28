package at.kvas.tutorial.sisu.foo;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.sisu.containers.SisuGuice;

import at.kvas.tutorial.sisu.bar.BarService;

import com.google.inject.Key;

/**
 * This class controls all aspects of the application's execution
 */
public class Application implements IApplication {	
	
	public Object start(IApplicationContext context) throws Exception {
		System.out.println("Sisu");
		BarService bar = SisuGuice.lookup(Key.get(BarService.class));
		
		bar.bar();
		
		return IApplication.EXIT_OK;
	}

	public void stop() {
		// nothing to do
	}
}
