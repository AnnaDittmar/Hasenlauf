public class Level {
  private int breite;
  private int hoehe;
  private block[] bloecke;

public Level (int breite, int hoehe, block[] bloecke) {
  this.breite = breite;
  this.hoehe = hoehe;
  this.bloecke = bloecke;
  Spielfigur Haeschen = new Spielfigur("robert",300,400);
}

public void darstellen() {
  for(int y = 0; y < hoehe; y++) {
    for(int x = 0; x < breite; x++) {
      boolean blockGefunden = false;
      for (block b:bloecke) {
        if(b.getX() == x && b.getY() == y) {
          b.darstellen();
          blockGefunden = true;
          break;
        }
      }
      if (!blockGefunden) {
        System.out.println(" ");
      }
    }
    System.out.println();
  }
}

public static void main(String[] args) {
  block[] bloecke = {
    new block(2,4,"braun"),
    new block(3,4,"gruen"),
    new block(4,4,"blau"),
    new block(5,4,"gelb"),
    new block(6,3,"rot"),
    new block(7,2,"orange") 
  };

  Level level = new Level(10, 6, bloecke);
  level.darstellen()
    }
}
