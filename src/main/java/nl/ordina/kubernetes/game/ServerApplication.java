package nl.ordina.kubernetes.game;

import io.micronaut.runtime.Micronaut;

public class ServerApplication {

  public static void main(String[] args) {
    Usage.toLog();
    Micronaut.run(ServerApplication.class);
  }
}
