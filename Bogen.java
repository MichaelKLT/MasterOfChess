import GLOOP.*;
/**
 * Beschreiben Sie hier die Klasse Bogen.
 * 
 * @author Michael Kluth
 * @version 1.0
 */
public class Bogen {
  GLQuader[] stuecke = new GLQuader[100];
  GLVektor position;

  public Bogen(double pX, double pY, double pZ,
  double pWinkel, double pRadiusAussen, double pRadiusInnen, double pTiefe) {

    position = new GLVektor(pX, pY, pZ);
    GLVektor startpunkt = new GLVektor(pX  + (pRadiusAussen + pRadiusInnen) / 2, pY, pZ);
    double sinAlpha = Math.sin(Math.PI * pWinkel / 180.0);
    double bogenmassAussen = Math.asin(sinAlpha) * pRadiusAussen;
    double bogenmassInnen = Math.asin(sinAlpha) * pRadiusInnen;
    double test = Math.asin(0.5);
    //GLVektor naechsterPunkt = new GLVektor(pX - (pRadiusAussen - pRadiusInnen) / 2, pY, pZ);
    for (int i = 0; i < stuecke.length; i++) {
      stuecke[i] = new GLQuader(startpunkt/*naechsterPunkt*/, pRadiusAussen - pRadiusInnen, bogenmassAussen / 100, pTiefe);
      //naechsterPunkt.drehe(pWinkel / 100, 0, 0, 0);
      stuecke[i].drehe(0, 0, pWinkel / 100 * i, pX, pY, pZ);
    }
  }

  public void drehe(double pWinkelX, double pWinkelY, double pWinkelZ) {
    for (int i = 0; i < stuecke.length; i++) {
      stuecke[i].drehe(pWinkelX, pWinkelY, pWinkelZ, position);
    }
  }

  public void drehe(double pWinkelX, double pWinkelY, double pWinkelZ,
                    double pX, double pY, double pZ) {
    for (int i = 0; i < stuecke.length; i++) {
      stuecke[i].drehe(pWinkelX, pWinkelY, pWinkelZ, pX, pY, pZ);
    }
  }

  public void verschiebe(double pX, double pY, double pZ) {
    for (int i = 0; i < stuecke.length; i++) {
      stuecke[i].verschiebe(pX, pY, pZ);
    }
  }

  public void setzeFarbe(double pRot, double pGruen, double pBlau) {
    for (int i = 0; i < stuecke.length; i++) {
      stuecke[i].setzeFarbe(pRot, pGruen, pBlau);
    }
  }

  public static void test() {
    GLEntwicklerkamera kam = new GLEntwicklerkamera(800, 800);
    new GLLicht();
    kam.zeigeAchsen(true);
    Bogen b = new Bogen (0,0,0, 90, 300, 100, 400);
    Sys.warte(1000);
    b.verschiebe(100, 300, -500);
    Sys.warte(1000);
    b.drehe(45,0,0);
    Sys.warte(1000);
    b.verschiebe(100, 300, -500);
    Sys.warte(1000);
    b.drehe(0,30,30);
  }

}
