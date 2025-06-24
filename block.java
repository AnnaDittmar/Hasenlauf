class block extends Rechteck{

int x;
int y;
String Farbe;

Kiste(int x, int y, String Farbe){
  this.x = x;
  this.y = y;
  this.Farbe = Farbe
}

void darstellen() {
  PositionSetzen(x,y);
  SichtbarkeitStzen(true);
}
