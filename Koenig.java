import GLOOP.*;
/**
 * Hier wird die Ansicht der Figur 
 * Läufer im Schachspiel implementiert.
 * 
 * @author Jean Dupont
 * @version 3.4.2021
 */
public class Koenig {

    GLZylinder fuss;
    GLTorus beine;
    GLKegelstumpf unterkoerper;
    GLKegelstumpf mitte;
    GLTorus guertel1;
    GLTorus guertel2;
    GLZylinder hals;
    GLTorus guertel3;
    GLKegelstumpf kragen;
    GLKugel kopf;
    GLQuader kreuzSenkrecht;
    GLQuader kreuzWaagerecht;

  /**
   * Position: 800,0; Farbe: weiß
   */
  public Koenig() {
    this (800, 0, true);
  }

  /**
   * Farbe: weiß
   * @param pX x-Position
   * @param pZ z-Position
   */
  public Koenig(double pX, double pZ) {
    this(pX, pZ, true);
  }

  /**
   * Position: 800,0
   * @param pWeiss Ob der Läufer weiß (true) oder schwarz (false) sein soll
   */
  public Koenig(boolean pWeiss) {
    this(800, 0, pWeiss);
  }

  /**
   * @param pX x-Position
   * @param pZ z-Position
   * @param pWeiss Ob der Läufer weiß (true) oder schwarz (false) sein soll
   */
  public Koenig(double pX, double pZ, boolean pWeiss) {
    fuss = new GLZylinder(pX, 5.0, pZ, 85.0, 10.0);
    fuss.drehe(90, 0, 0);
    beine = new GLTorus(pX, 10 + 15 - 2, pZ, 55, 30);
    beine.drehe(90, 0, 0);
    unterkoerper = new GLKegelstumpf(pX, 10 + 28 + 25, pZ, 80, 50, 50);
    unterkoerper.drehe(90, 0, 0);
    mitte = new GLKegelstumpf(pX, 83 + 60, pZ, 45, 25, 120);
    mitte.drehe(90, 0, 0);
    guertel1 = new GLTorus(pX, 203 + 2.5, pZ, 40, 20);
    guertel1.skaliere(1, 1, 0.25);
    guertel1.drehe(90, 0, 0);
    guertel2 = new GLTorus(pX, 203 + 5 + 2.5, pZ, 30, 20);
    guertel2.skaliere(1, 1, 0.25);
    guertel2.drehe(90, 0, 0);
    hals = new GLZylinder(pX, 210.5 + 10, pZ, 30, 20);
    hals.drehe(90,0,0);
    guertel3 = new GLTorus(pX, 230.5 + 5, pZ, 20, 20);
    guertel3.skaliere(1, 1, 0.25);
    guertel3.drehe(90, 0, 0);
    kragen = new GLKegelstumpf(pX, 245.5 + 32.5, pZ, 30, 40, 65);
    kragen.drehe(90, 0, 0);
    kopf = new GLKugel(pX, 265.5 + 32.5 + 20 * 0.5, pZ, 20);
    kopf.skaliere(1, 0.5, 1);
    kreuzSenkrecht = new GLQuader(pX, 313 + 25, pZ, 10, 50, 20);
    kreuzWaagerecht = new GLQuader(pX, 313 + 25, pZ, 10, 20, 50);
    if (!pWeiss) {
      fuss.setzeFarbe(0.1, 0.1, 0.1);
      beine.setzeFarbe(0.1, 0.1, 0.1);
      unterkoerper.setzeFarbe(0.1, 0.1, 0.1);
      mitte.setzeFarbe(0.1, 0.1, 0.1);
      guertel1.setzeFarbe(0.1, 0.1, 0.1);
      guertel2.setzeFarbe(0.1, 0.1, 0.1);
      hals.setzeFarbe(0.1, 0.1, 0.1);
      guertel3.setzeFarbe(0.1, 0.1, 0.1);
      kopf.setzeFarbe(0.1, 0.1, 0.1);
      kragen.setzeFarbe(0.1, 0.1, 0.1);
      kreuzSenkrecht.setzeFarbe(0.1, 0.1, 0.1);
      kreuzWaagerecht.setzeFarbe(0.1, 0.1, 0.1);
    }
  }

}
