package at.kvas.tutorial.sisu.baz.impl;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.sisu.EagerSingleton;

import at.kvas.tutorial.sisu.bar.BarService;
import at.kvas.tutorial.sisu.baz.BazService;

@Named
@EagerSingleton
public class BazServiceImpl implements BazService{

	@Inject BarService bar;
	
//	@Inject
//	public BazServiceImpl(BarService bar) {
//		super();
//		this.bar = bar;
//	}



	@Override
	public void baz() {
		bar.bar();
		System.out.println("baz?");
	}

}
