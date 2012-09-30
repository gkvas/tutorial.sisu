#Motivation

A quick working example for Sisu in an RCP environment.

at.kvas.tutorial.sisu.foo.Application is the entry point.

Plug-ins at.kvas.tutorial.sisu.bar and at.kvas.tutorial.sisu.baz 
define services to be consumed in at.kvas.tutorial.sisu.foo.

Each of the service plug-ins has a test plug-in attached to allow
playing with possible test setups.

#Setup

Eclipse 3.7.2 (or higher) - target platform "Base-RCP"

Additional bundles required (From Eclipse Orbit)

- com.google.guava_10.0.1.v201203051515.jar
- com.google.inject_3.0.0.v201203062045.jar
- javax.inject_1.0.0.v20091030.jar
- org.aopalliance_1.0.0.v201105210816.jar
- org.hamcrest_1.1.0.v20090501071000.jar
- org.hamcrest.core_1.1.0.v20090501071000.jar
- org.hamcrest.integration_1.1.0.v20090501071000.jar
- org.hamcrest.library_1.1.0.v20090501071000.jar
- org.hamcrest.text_1.1.0.v20090501071000.jar
- org.junit_4.10.0.v4_10_0_v20120426-0900.jar
- org.mockito_1.8.4.v201102171835.jar
- org.objectweb.asm_3.3.1.v201105211655.jar
- org.objenesis_1.0.0.v201105211943.jar


In addition to the abovementioned out-of-the-box bundles,
you need to build org.eclipse.sisu.inject and add the result
to your target platform.


    git clone git://git.eclipse.org/gitroot/sisu/org.eclipse.sisu.inject.git



   cd org.eclipse.sisu.inject
   mvn clean install



The bundle resides in 

   org.eclipse.sisu.inject/org.eclipse.sisu.inject/target

TODO
====

Stay tuned for a tycho-based build of this example.


