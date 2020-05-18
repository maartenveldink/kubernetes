package nl.ordina.kubernetes.game;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

@Controller("/hello")
public class HelloController {

  @Get(produces = MediaType.TEXT_PLAIN)
  public String hello() {
    return String.format("Hello from %s", System.getenv("HOSTNAME"));
  }
}
