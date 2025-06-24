/**
 * sollte eine lenkbare Spielfigur erzeugen.
 * 
 * @author Anna
 * @version 1.0
 */
public class Spielfigur extends Figur
 String name;
   double vx;
   double vy;
   double beschleunigung;

   // Konstruktor
   Spielfigur(String name, int x, int y) {
      // Konstruktor der Klasse Sprite
      super();
      this.name = name;
      beschleunigung = 0.2;
      vx = 0.3;
      vy = 0.7;
   }
   /* überschriebene Methode der Klasse Sprite, 
      wird 30 Mal / Sekunde aufgerufen */
   void act() {
      move(2, 1);
   }
}
// Deklaration einer Variablen der Klasse Raumschiff
Raumschiff raumschiff1;
// Erzeugen eines Raumschiff-Objekts
raumschiff1 = new Raumschiff("Captain Körk", 100, 50);
