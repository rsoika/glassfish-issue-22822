# glassfish-issue-22822


See Issue [Glassfish Issue #22822](https://github.com/eclipse-ee4j/glassfish/issues/22822)

This Example App creates two JAX-RS classes. One of them is packaged in a jar file and deployed into the war file under /WEB-INF/lib/

The JAX-RS class of the lib will not be scanned by the Glassfish Microprofile OpenAPI module. The JAX-RS class located directyl in 
the web module located under /WEB-INF/classes is detected correctly.

Tested on Wildfly, both classes are scanned. 
