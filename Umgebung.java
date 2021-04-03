import GLOOP.GLLicht;
import GLOOP.GLEntwicklerkamera;
import GLOOP.GLHimmel;
import GLOOP.GLBoden;
/**
 * Beschreiben Sie hier die Klasse Umgebung.
 * 
 * @author Michael Kluth
 * @version 22.2.2021
 */
public class Umgebung {

  GLEntwicklerkamera fenster; 
  GLLicht licht; 
  GLBoden boden;
  GLHimmel himmel;
  
  public Umgebung() {
    fenster = new GLEntwicklerkamera();
    fenster.zeigeAchsen(true);
    fenster.setzePosition(500, 1000, 500);
    licht = new GLLicht();
    boden = new GLBoden("boden.jpg");
    himmel = new GLHimmel("himmel.jpg");
    new Bauer();
    new Turm();
    new Laeufer();
    new Dame();
    new Koenig();
    new Bauer(0, 200, false);
    new Turm(200, 200, false);
    new Laeufer(400, 200, false);
    new Dame(600, 200, false);
    new Koenig(800, 200, false);
  }
}
