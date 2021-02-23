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
    kopf = new GLKugel(0, 90 + 80 + 18, 0, 40);
    hals = new GLTorus(0, 90 + 70, 0, 30, 5);
    hals.drehe(90, 0, 0);
    oberkoerper = new GLKegelstumpf(0, 90 + 35, 0, 40, 15, 80);
    oberkoerper.drehe(90, 0, 0);
    guertel = new GLTorus(0,92,0,46,2);
    guertel.drehe(90, 0, 0);
    unterkoerper = new GLKegelstumpf(0, 30 + 30, 0, 70, 50, 60);
    unterkoerper.drehe(90,0,0);
    beine = new GLTorus(0, 10 + 10, 0, 60, 20);
    beine.drehe(90, 0, 0);
    fuss = new GLZylinder(0.0, 5.0, 0.0, 80.0, 10.0);
    fuss.drehe(90, 0, 0);
  }
  
}
