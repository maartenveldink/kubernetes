package nl.ordina.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Usage {

  private static Logger log = LoggerFactory.getLogger(Usage.class);

  public static void toLog() {
    log.info("  -| ");
    log.info("  -| Starting up a web-server to serve a game of tetris.");
    log.info("  -| ");
    log.info("  -| You can differentiate between css-styles.");
    log.info("  -| The following options are availabe: monochrome (default), vim, retro and custom.");
    log.info("  -| To select any of these options, you can set the environment variable: 'game.style' on your container.");
    log.info("  -| ");
  }
}
