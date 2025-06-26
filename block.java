class block extends Rechteck{

int x;
int y;
String Farbe;

block(int x, int y, String Farbe){
  this.x = x;
  this.y = y;
  this.Farbe = Farbe;
}

void darstellen() {
  PositionSetzen(x,y);
  SichtbarkeitSetzen(true);
}

public int getX() {
  return x;
}

public int getY() {
  return y;
}
  
}
