import GLOOP.*;
/**
 * Beschreiben Sie hier die Klasse Bauer.
 * 
 * @author Michael Kluth
 * @version 23.2.2021
 */
public class Bauer {
  GLKugel kopf;
  GLTorus hals;
  GLKegelstumpf oberkoerper;
  GLTorus guertel;
  GLKegelstumpf unterkoerper;
  GLTorus beine;
  GLZylinder fuss;
  
  public Bauer() {
    this(0, 0, true);
  }
  
  public Bauer(boolean pWeiss) {
    this (0, 0, pWeiss);
  }
  
  public Bauer(double pX, double pZ) {
    this(pX, pZ, true);
  }
  
  public Bauer(double pX, double pZ, boolean pWeiss) {
    kopf = new GLKugel(pX, 90 + 80 + 18, pZ, 40);
    hals = new GLTorus(pX, 90 + 70, pZ, 30, 5);
    hals.drehe(90, 0, 0);
    oberkoerper = new GLKegelstumpf(pX, 90 + 35, pZ, 40, 15, 80);
    oberkoerper.drehe(90, 0, 0);
    guertel = new GLTorus(pX, 92, pZ, 46, 2);
    guertel.drehe(90, 0, 0);
    unterkoerper = new GLKegelstumpf(pX, 30 + 30, pZ, 70, 50, 60);
    unterkoerper.drehe(90,0,0);
    beine = new GLTorus(pX, 10 + 10, pZ, 60, 20);
    beine.drehe(90, 0, 0);
    fuss = new GLZylinder(pX, 5.0, pZ, 80.0, 10.0);
    fuss.drehe(90, 0, 0);
    if (!pWeiss) {
      kopf.setzeFarbe(0.1, 0.1, 0.1);
      hals.setzeFarbe(0.1, 0.1, 0.1);
      oberkoerper.setzeFarbe(0.1, 0.1, 0.1);
      guertel.setzeFarbe(0.1, 0.1, 0.1);
      unterkoerper.setzeFarbe(0.1, 0.1, 0.1);
      beine.setzeFarbe(0.1, 0.1, 0.1);
      fuss.setzeFarbe(0.1, 0.1, 0.1);
    }
  }
  
}
