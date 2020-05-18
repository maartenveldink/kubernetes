package nl.ordina.app;

import io.micronaut.context.annotation.Value;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller("/actuator")
public class Actuators {
    private static Logger log = LoggerFactory.getLogger(Actuators.class);

    private static final String HEALTHY = "healthy";
    private static final String READY = "ready";

    @Value("${actuators.health.state}")
    private String healthState;

    @Value("${actuators.ready.state}")
    private String readyState;

    @Get(uri = "/health", produces = MediaType.TEXT_PLAIN)
    public String health() {
        if(HEALTHY.equalsIgnoreCase(healthState)){
            return "UP";
        }

        log.error("Oh my... looks like you forgot to set the env variable 'actuators.health.state' to value 'healty'...");
        log.error("Perhaps Kubernetes should restart the application to see if that helps.");

        throw new RuntimeException("Unable to boot application.");
    }

    @Get(uri = "/ready", produces = MediaType.TEXT_PLAIN)
    public String ready() {
        if(READY.equalsIgnoreCase(readyState)){
            return "READY";
        }

        log.error("Oh my... looks like you forgot to set the env variable 'actuators.ready.state' to value 'ready'...");
        log.error("This tells Kubernetes that your application is not ready to accept any traffic.");

        throw new RuntimeException("Not ready to serve any content");
    }

}
