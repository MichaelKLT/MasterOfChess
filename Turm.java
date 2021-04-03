import GLOOP.*;
/**
 * Basis-Ansicht für die Figur Turm.
 * 
 * @author Jean Dupont
 * @version 3.4.2021
 */
public class Turm {
  
  Bogen zinne1, zinne2, zinne3, zinne4;
  
  GLZylinder dach;
  GLKegelstumpf stuetze; //unterm aufbau
  GLKegelstumpf mitte;//der langgezogene teil
  GLKegelstumpf sockel; //der unter teil
  GLZylinder fuss;
  
  
  public Turm() {
    this(200, 0);
  }
  
  public Turm(boolean pWeiss) {
    this (200, 0, pWeiss);
  }
  
  public Turm(double pX, double pZ) {
    this (pX, pZ, true);
  }
  
  public Turm(double pX, double pZ, boolean pWeiss) {
    stuetze = new GLKegelstumpf(pX, 200, pZ, 50, 55, 20);
    stuetze.drehe(90, 0, 0);
    mitte = new GLKegelstumpf(pX, 10 + 70 + 55, pZ, 70, 50, 110);
    mitte.drehe(90,0,0);
    sockel = new GLKegelstumpf(pX, 10 + 35, pZ, 89, 70, 70);
    sockel.drehe(90, 0, 0);
    //wie bauer
    fuss = new GLZylinder(pX, 5, pZ, 90, 10);
    fuss.drehe(90, 0, 0);
    dach = new GLZylinder(pX, 210 + 20, pZ, 60, 40);
    dach.drehe(90,0,0);
    
    zinne1 = new Bogen(pX, 250 + 5, pZ, 70, 60, 55, 10);
    zinne1.drehe(90, -10, 0);
    
    zinne2 = new Bogen(pX, 250 + 5, pZ, 70, 60, 55, 10);
    zinne2.drehe(-90, 10, 0);
    
    zinne3 = new Bogen(pX, 250 + 5, pZ, 70, 60, 55, 10);
    zinne3.drehe(-90, 190, 0);
    
    zinne4 = new Bogen(pX, 250 + 5, pZ, 70, 60, 55, 10);
    zinne4.drehe(90, 170, 0);
    
    if (!pWeiss) {
      dach.setzeFarbe(0.1, 0.1, 0.1);
      stuetze.setzeFarbe(0.1, 0.1, 0.1);
      mitte.setzeFarbe(0.1, 0.1, 0.1);
      sockel.setzeFarbe(0.1, 0.1, 0.1);
      fuss.setzeFarbe(0.1, 0.1, 0.1);
      zinne1.setzeFarbe(0.1, 0.1, 0.1);
      zinne2.setzeFarbe(0.1, 0.1, 0.1);
      zinne3.setzeFarbe(0.1, 0.1, 0.1);
      zinne4.setzeFarbe(0.1, 0.1, 0.1);
    }
  }
  
  
  
}
