package at.kvas.tutorial.sisu.bar.impl;

import javax.inject.Named;

import org.eclipse.sisu.EagerSingleton;

import at.kvas.tutorial.sisu.bar.BarService;

@Named
@EagerSingleton
public class BarServiceImpl implements BarService {

	@Override
	public void bar() {
		
	}

}
