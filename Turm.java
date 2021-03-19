import GLOOP.*;
/**
 * Basis-Ansicht für die Figur Turm.
 * 
 * @author Jean Dupont
 * @version 19.3.2021
 */
public class Turm {
  //GLKugel kopf;
  //GLTorus hals;
  Bogen zinne1, zinne2, zinne3, zinne4;
  
  GLZylinder dach;
  GLKegelstumpf stuetze; //unterm aufbau
  GLKegelstumpf mitte;//der langgezogene teil
  GLKegelstumpf sockel; //der unter teil
  GLZylinder fuss;
  
  public Turm() {
    stuetze = new GLKegelstumpf(200, 200, 0, 50, 55, 20);
    stuetze.drehe(90, 0, 0);
    mitte = new GLKegelstumpf(200, 10 + 70 + 55, 0, 70, 50, 110);
    mitte.drehe(90,0,0);
    sockel = new GLKegelstumpf(200, 10 + 35, 0, 89, 70, 70);
    sockel.drehe(90, 0, 0);
    //wie bauer
    fuss = new GLZylinder(200, 5, 0, 90, 10);
    fuss.drehe(90, 0, 0);
    dach = new GLZylinder(200, 210 + 20, 0, 60, 40);
    dach.drehe(90,0,0);
    
    zinne1 = new Bogen(200, 250 + 5, 0, 70, 60, 55, 10);
    zinne1.drehe(90, -10, 0);
    
    zinne2 = new Bogen(200, 250 + 5, 0, 70, 60, 55, 10);
    zinne2.drehe(-90, 10, 0);
    
    zinne3 = new Bogen(200, 250 + 5, 0, 70, 60, 55, 10);
    zinne3.drehe(-90, 190, 0);
    
    zinne4 = new Bogen(200, 250 + 5, 0, 70, 60, 55, 10);
    zinne4.drehe(90, 170, 0);
  }
  
  
  
}
