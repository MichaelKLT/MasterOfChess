import GLOOP.*;
/**
 * Beschreiben Sie hier die Klasse Krone.
 * 
 * @author Jean Dupont
 * @version 3.4.2021
 */
public class Krone {
  
  GLPrismoid[] spitzen;
  GLTorus ring;
  public Krone(double pX, double pY, double pZ, double pRadius) {
    ring = new GLTorus(pX, pY - 2, pZ, pRadius, 2);
    ring.drehe(90, 0, 0);
    spitzen = new GLPrismoid[12];
    for (int i = 0; i < 12; i++) {
      spitzen[i] = new GLPrismoid(pX + pRadius, pY + 2, pZ, 5, 5, 3, 2);
      spitzen[i].drehe(0, 90, 0);
      spitzen[i].drehe(0, i * (360 / 12), 0, pX, pY, pZ);
    }
  }
  
  public void setzeFarbe(double pX, double pY, double pZ) {
    ring.setzeFarbe(pX, pY, pZ);
    for (int i = 0; i < 12; i++) {
      spitzen[i].setzeFarbe(pX, pY, pZ);
    }
  }

  
}
