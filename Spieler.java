/**
 * sollte eine lenkbare Spielfigur erzeugen.
 * übernommen von Spacejunk (vom Raumschiff)
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
       if(isKeyDown(Key.ArrowLeft)) {
         vx = vx - beschleunigung;
      }
      if(isKeyDown(Key.ArrowRight)) {
         vx = vx + beschleunigung;
      }
      if(isKeyDown(Key.ArrowUp)) {
         vy = vy - beschleunigung;
      }
      if(isKeyDown(Key.ArrowDown)) {
         vy = vy + beschleunigung;
      }
    if(centerX < 30 || centerX > 770) {
         move(-vx, 0);
         vx = 0;
   }
}

