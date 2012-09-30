tutorial.sisu
=============

A quick working example for Sisu in an RCP environment.

at.kvas.tutorial.sisu.foo.Application is the entry point.

Plug-ins at.kvas.tutorial.sisu.bar and at.kvas.tutorial.sisu.baz 
define services to be consumed in at.kvas.tutorial.sisu.foo.

Requirements
============

Eclipse 3.7.2 - target platform "Base-RCP"

Additional bundles required (From Eclipse Orbit)

javax.inject 1.0.0
org.aopalliance 1.0.0
com.google.guava 10.0.1
com.google.inject 3.0.0
org.objectweb.asm 3.3.1

In addition to the abovementioned out-of-the-box bundles,
you need to build org.eclipse.sisu.inject and add the result
to your target platform.

1.)

git clone git://git.eclipse.org/gitroot/sisu/org.eclipse.sisu.inject.git

2.) 

cd org.eclipse.sisu.inject
mvn clean install

3.)

The bundle resides in 

org.eclipse.sisu.inject/org.eclipse.sisu.inject/target

TODO
====

Stay tuned for a tycho-based build of this example.


