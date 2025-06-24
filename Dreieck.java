
/**
 * Wrapperklasse für ein Dreieck auf der Zeichenfläche.
 * 
 * @author Albert Wiedemann 
 * @version 1.0
 */
public class Dreieck
{
    /** x-Position der Spitze. */
    protected int x;
    /** y-Position der Spitze. */
    protected int y;
    /** Breite des umgebenden Rechtecks. */
    protected int breite;
    /** Höhe des umgebenden Rechtecks. */
    protected int höhe;
    /** Farbe des Dreiecks. */
    protected String farbe;
    /** Sichtbarkeit des Dreiecks. */
    protected boolean sichtbar;
    /** Drehwinkel (mathematisch positiver Drehsinn) des Dreiecks in Grad. */
    protected int winkel;
    /** Referenz auf das Delegate-Objekt. */
    Zeichenfenster.GrafikSymbol symbol;

    /**
     * Der Konstruktor erzeugt das Delegate-Objekt
     */
    Dreieck ()
    {
        x = 60;
        y = 10;
        breite = 100;
        höhe = 100;
        farbe = "rot";
        sichtbar = true;
        winkel = 0;
        symbol = Zeichenfenster.SymbolErzeugen(Zeichenfenster.SymbolArt.dreieck);
        symbol.PositionSetzen(x - breite / 2, y);
        symbol.GrößeSetzen(breite, höhe);
        symbol.FarbeSetzen(farbe);
        symbol.SichtbarkeitSetzen(sichtbar);
        symbol.WinkelSetzen(winkel);
    }
    
    /**
     * Setzt die Position (der Spitze) des Dreiecks.
     * @param x x-Position der Spitze
     * @param y y-Position der Spitze
     */
    void PositionSetzen(int x, int y)
    {
        this.x = x;
        this.y = y;
        symbol.PositionSetzen(x - breite / 2, y);
    }
    
    /**
     * Verschiebt das Dreieck um die angegebenen Werte.
     * @param deltaX Verschiebung in x-Richtung
     * @param deltaY Verschiebung in y-Richtung
     */
    void Verschieben(int deltaX, int deltaY)
    {
        x += deltaX;
        y += deltaY;
        symbol.PositionSetzen(x - breite / 2, y);
    }
    
    /**
     * Dreht das Dreieck
     * @param grad Drehwinkel (mathematisch positiver Drehsinn) im Gradmass
     */
    void Drehen(int grad)
    {
        winkel += grad;
        symbol.WinkelSetzen(winkel);
    }
        
    /**
     * Setzt die Größe des Dreiecks.
     * @param breite (neue) Breite
     * @param höhe (neue) Höhe
     */
    void GrößeSetzen (int breite, int höhe)
    {
        this.breite = breite;
        this.höhe = höhe;
        symbol.GrößeSetzen(breite, höhe);
        symbol.PositionSetzen(x - breite / 2, y);
    }
    
    /**
     * Setzt die Farbe des Dreiecks.
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
     * Setzt den Drehwinkel des Dreiecks.
     * Die Winkelangabe ist in Grad,positive Werte drehen gegen den Uhrzeigersinn,
     * negative Werte drehen im Uhrzeigersinn (mathematisch positiver Drehsinn).
     * @param winkel der (neue) Drehwinkel des Dreiecks
     */
    void WinkelSetzen (int winkel)
    {
        this.winkel = winkel;
        symbol.WinkelSetzen(winkel);
    }
    
    /**
     * Schaltet die Sichtbarkeit des Dreiecks ein oder aus.
     * Erlaubte Parameterwerte: true, false
     * @param sichtbar (neue) Sichtbarkeit des Dreiecks
     */
    void SichtbarkeitSetzen (boolean sichtbar)
    {
        this.sichtbar = sichtbar;
        symbol.SichtbarkeitSetzen(sichtbar);
    }
        
    /**
     * Entfernt das Dreieck aus dem Zeichenfenster.
     */
    void Entfernen ()
    {
        symbol.Entfernen();
    }
    
    /**
     * Bringt das Dreieck eine Ebene nach vorn.
     */
    void NachVornBringen ()
    {
        symbol.NachVornBringen();
    }
    
    /**
     * Bringt das Dreieck in die vorderste Ebene.
     */
    void GanzNachVornBringen ()
    {
        symbol.GanzNachVornBringen();
    }
    
    /**
     * Bringt das Dreieck eine Ebene nach hinten.
     */
    void NachHintenBringen ()
    {
        symbol.NachHintenBringen();
    }
    
    /**
     * Bringt das Dreieck in die hinterste Ebene.
     */
    void GanzNachHintenBringen ()
    {
        symbol.GanzNachHintenBringen();
    }
}
