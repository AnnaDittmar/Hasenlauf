
/**
 * Wrapperklasse für einen Kreis auf der Zeichenfläche.
 * 
 * @author Albert Wiedemann 
 * @version 1.0
 */
public class Kreis
{
    /** x-Position des Kreismittelpunktes. */
    protected int x;
    /** y-Position des Kreismittelpunktes. */
    protected int y;
    /** Radius des Kreises. */
    protected int radius;
    /** Farbe des Kreises. */
    protected String farbe;
    /** Sichtbarkeit des Kreises. */
    protected boolean sichtbar;
    /** Drehwinkel (mathematisch positiver Drehsinn) des Kreises in Grad. */
    protected int winkel;
    /** Referenz auf das Delegate-Objekt. */
    Zeichenfenster.GrafikSymbol symbol;

    /**
     * Der Konstruktor erzeugt das Delegate-Objekt
     */
    Kreis ()
    {
        x = 60;
        y = 60;
        radius = 50;
        farbe = "rot";
        sichtbar = true;
        winkel = 0;
        symbol = Zeichenfenster.SymbolErzeugen(Zeichenfenster.SymbolArt.kreis);
        symbol.PositionSetzen(x - radius, y - radius);
        symbol.GrößeSetzen(radius * 2, radius * 2);
        symbol.FarbeSetzen(farbe);
        symbol.SichtbarkeitSetzen(sichtbar);
        symbol.WinkelSetzen(winkel);
    }
    
    /**
     * Setzt die Position (des Mittelpunkts) des Kreises.
     * @param x x-Position des Mittelpunkts
     * @param y y-Position des Mittelpunkts
     */
    void PositionSetzen(int x, int y)
    {
        this.x = x;
        this.y = y;
        symbol.PositionSetzen(x - radius, y - radius);
    }
    
    /**
     * Verschiebt den Kreis um die angegebenen Werte.
     * @param deltaX Verschiebung in x-Richtung
     * @param deltaY Verschiebung in y-Richtung
     */
    void Verschieben(int deltaX, int deltaY)
    {
        x += deltaX;
        y += deltaY;
        symbol.PositionSetzen(x - radius, y - radius);
    }
    
    /**
     * Dreht den Kreis
     * @param grad Drehwinkel (mathematisch positiver Drehsinn) im Gradmass
     */
    void Drehen(int grad)
    {
        winkel += grad;
        symbol.WinkelSetzen(winkel);
    }
        
    /**
     * Setzt den Radius des Kreises.
     * @param radius (neuer) Radius
     */
    void RadiusSetzen (int radius)
    {
        this.radius = radius;
        symbol.GrößeSetzen(radius * 2, radius * 2);
        symbol.PositionSetzen(x - radius, y - radius);
    }
    
    /**
     * Setzt die Farbe des Kreises.
     * Erlaubte Farben sind:
     * "weiß", "weiss", "rot", "grün", "gruen", "blau", "gelb",
     * "magenta", "cyan", "hellgelb", "hellgrün", "hellgruen",
     * "orange", "braun", "grau", "schwarz"
     * Alle anderen Eingaben werden auf die Farbe schwarz abgebildet.
     * @param farbe (neue) Farbe
     */
    void FarbeSetzen (String farbe)
    {
        this.farbe = farbe;
        symbol.FarbeSetzen(farbe);
    }
        
    /**
     * Setzt den Drehwinkel des Kreises.
     * Die Winkelangabe ist in Grad,positive Werte drehen gegen den Uhrzeigersinn,
     * negative Werte drehen im Uhrzeigersinn (mathematisch positiver Drehsinn).
     * @param winkel der (neue) Drehwinkel des Kreises
     */
    void WinkelSetzen (int winkel)
    {
        this.winkel = winkel;
        symbol.WinkelSetzen(winkel);
    }
    
    /**
     * Schaltet die Sichtbarkeit des Kreises ein oder aus.
     * Erlaubte Parameterwerte: true, false
     * @param sichtbar (neue) Sichtbarkeit des Kreises
     */
    void SichtbarkeitSetzen (boolean sichtbar)
    {
        this.sichtbar = sichtbar;
        symbol.SichtbarkeitSetzen(sichtbar);
    }
        
    /**
     * Entfernt den Kreis aus dem Zeichenfenster.
     */
    void Entfernen ()
    {
        symbol.Entfernen();
    }
    
    /**
     * Bringt den Kreis eine Ebene nach vorn.
     */
    void NachVornBringen ()
    {
        symbol.NachVornBringen();
    }
    
    /**
     * Bringt den Kreis in die vorderste Ebene.
     */
    void GanzNachVornBringen ()
    {
        symbol.GanzNachVornBringen();
    }
    
    /**
     * Bringt den Kreis eine Ebene nach hinten.
     */
    void NachHintenBringen ()
    {
        symbol.NachHintenBringen();
    }
    
    /**
     * Bringt den Kreis in die hinterste Ebene.
     */
    void GanzNachHintenBringen ()
    {
        symbol.GanzNachHintenBringen();
    }
}
