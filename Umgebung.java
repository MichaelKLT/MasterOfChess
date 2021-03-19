import GLOOP.GLLicht;
import GLOOP.GLEntwicklerkamera;
import GLOOP.GLHimmel;
/**
 * Beschreiben Sie hier die Klasse Umgebung.
 * 
 * @author Michael Kluth
 * @version 22.2.2021
 */
public class Umgebung {

  GLEntwicklerkamera fenster; 
  GLLicht licht; 
  public Umgebung() {
    fenster = new GLEntwicklerkamera();
    fenster.zeigeAchsen(true);
    fenster.setzePosition(500, 1000, 500);
    licht = new GLLicht();
  }
}
