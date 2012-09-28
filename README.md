tutorial.sisu
=============

A quick working example for Sisu in an RCP environment.

at.kvas.tutorial.sisu.foo.Application is the entry point.

Plug-ins at.kvas.tutorial.sisu.bar and at.kvas.tutorial.sisu.baz 
define services to be consumed in at.kvas.tutorial.sisu.foo.

The application was tested under the following conditions:

Eclipse 3.7.2 - target platform "Base-RCP"

Additional bundles:
org.aopalliance (Eclipse Orbit)
org.objectweb.asm (Eclipse Orbit)
javax.inject (Eclipse Orbit)
sisu-guice (github.com/sonatype)
guava (Contained in the sisu-guice repository)
sisu (Eclipse git repository)
