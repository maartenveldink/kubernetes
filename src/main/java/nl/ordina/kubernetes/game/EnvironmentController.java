package nl.ordina.kubernetes.game;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

@Controller("/env")
public class EnvironmentController {

  @Get(produces = MediaType.APPLICATION_JSON)
  public Environment environment() {
    Environment env = new Environment();
    env.environment = System.getenv().entrySet()
                            .stream()
                            .sorted(Map.Entry.comparingByKey())
                            .collect(Collectors.toMap(
                                Map.Entry::getKey,
                                Map.Entry::getValue,
                                (oldValue, newValue) -> oldValue,
                                LinkedHashMap::new));
    return env;
  }

  public static class Environment {
    public Map<String, String> environment;
  }

}
