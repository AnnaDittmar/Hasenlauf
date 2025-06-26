/**
*@author (Lukas)
*/

/**
 * Wrapperklasse für die Turtle auf der Zeichenfläche.
 * 
 * @author Albert Wiedemann 
 * @version 1.0
 */
public class Turtle
{
    /** x-Position der Turtle. */
    private int x;
    /** y-Position der Turtle. */
    private int y;
    /** Größe der Turtle. */
    private int größe;
    /** Farbe der Turtle. */
    private String farbe;
    /** Sichtbarkeit der Turtles. */
    private boolean sichtbar;
    /** Drehwinkel (mathemtisch positiver Drehsinn) der Turtle in Grad. */
    private int winkel;
    /**Stiftposition*/
    private boolean stiftUnten;
    /** Referenz auf das echte Turtlesybol. */
    Zeichenfenster.TurtleIntern symbol;
    /** Referenz auf das Aktionsempfängerobjekt. */
    Zeichenfenster.AktionsEmpfaenger aktionsEmpfänger;
    
    /**
     * Konstruktor der Turtle
     * Erzeugt eine Turtle und versetzt sie in einen gültigen Startzustand.
     */
    Turtle ()
    {
        symbol = (Zeichenfenster.TurtleIntern) Zeichenfenster.SymbolErzeugen(Zeichenfenster.SymbolArt.turtle);
        symbol.SichtbarkeitSetzen(true);
        x = symbol.x;
        y = symbol.y;
        winkel = symbol.winkel;
        größe = symbol.b;
        stiftUnten = symbol.stiftUnten;
        sichtbar = symbol.sichtbar;
        aktionsEmpfänger = new Zeichenfenster.AktionsEmpfaenger()
        {
            public void Ausführen ()
            {
                AktionAusführen();
            }
            
            public void Taste (char taste)
            {
                TasteGedrückt(taste);
            }
            
            public void SonderTaste (int taste)
            {
                SonderTasteGedrückt(taste);
            }
            
            public void Geklickt (int x, int y, int anzahl)
            {
                MausGeklickt(x, y, anzahl);
            }
        };
        Zeichenfenster.AktionsEmpfängerEintragen(aktionsEmpfänger);
    }
    
    /**
     * Methode wird aufgerufen, wenn die Turtle handeln soll.
     * Die vordefinierte Methode tut nichts.
     */
    void AktionAusführen()
    {
    }
    
    /**
     * Die eigentliche Aktionsmethode für gedrückte Tasten.
     * <br>Muss bei Bedarf von einer Unterklasse überschrieben werden. 
     * @param taste die gedrückte Taste
     */
    void TasteGedrückt (char taste)
    {
        //System. out. println ("Taste: " + taste);
    }
    
    /**
     * Die eigentliche Aktionsmethode für gedrückte Sondertasten.
     * <br>Muss bei Bedarf von einer Unterklasse überschrieben werden. 
     * @param taste KeyCode der gedrückten Taste
     */
    void SonderTasteGedrückt (int taste)
    {
        //System. out. println ("Sondertaste: " + taste);
    }
    
    /**
     * Die eigentliche Aktionsmethode für einen Mausklick.
     * <br>Muss bei Bedarf von einer Unterklasse überschrieben werden. 
     * @param x x-Position des Mausklicks
     * @param y y-Position des Mausklicks
     * @param anzahl Anzahl der aufeinanderfolgenden Mausklicks
     */
    void MausGeklickt (int x, int y, int anzahl)
    {
        System. out. println ("Maus: (" + x + "|" + y + "), " + anzahl + " mal");
    }
    
    /**
     * Setzt die Position der Turtle.
     * @param x x-Position der Turtle
     * @param y y-Position der Turtle
     */
    void PositionSetzen(int x, int y)
    {
        this.x = x;
        this.y = y;
        symbol.PositionSetzen(x, y);
    }
        
    /**
     * Setzt die Größe des Turtlesymbols.
     * @param größe (neue) Größe
     */
    void GrößeSetzen (int größe)
    {
        this.größe = größe;
        symbol.GrößeSetzen(größe, größe);
    }
    
    /**
     * Setzt die Farbe der Linie.
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
     * Setzt den Drehwinkel der Turtle.
     * Die Winkelangabe ist in Grad, positive Werte drehen gegen den Uhrzeigersinn,
     * negative Werte drehen im Uhrzeigersinn (mathematisch positiver Drehsinn), d. h.
     * 0˚: Turtle schaut nach rechts,
     * 90˚: Turtle schaut nach oben,
     * 180˚: Turtle schaut nach links,
     * 270˚bzw. -90˚: Turtle schaut nach unten
     * @param winkel der (neue) Drehwinkel der Turtle
     */
    void WinkelSetzen (int winkel)
    {
        this.winkel = winkel;
        symbol.WinkelSetzen(winkel);
    }
    
    /**
     * Schaltet die Sichtbarkeit der Turtle ein oder aus.
     * Erlaubte Parameterwerte: true, false
     * @param sichtbar (neue) Sichtbarkeit der Turtle
     */
    void SichtbarkeitSetzen (boolean sichtbar)
    {
        this.sichtbar = sichtbar;
        symbol.SichtbarkeitSetzen(sichtbar);
    }
        
    /**
     * Entfernt die Turtle aus dem Zeichenfenster.
     */
    void Entfernen ()
    {
        Zeichenfenster.AktionsEmpfängerEntfernen(aktionsEmpfänger);
        symbol.Entfernen();
    }
    
    /**
     * Bringt die Turtle eine Ebene nach vorn.
     */
    void NachVornBringen ()
    {
        symbol.NachVornBringen();
    }
    
    /**
     * Bringt die Turtle in die vorderste Ebene.
     */
    void GanzNachVornBringen ()
    {
        symbol.GanzNachVornBringen();
    }
    
    /**
     * Bringt die Turtle eine Ebene nach hinten.
     */
    void NachHintenBringen ()
    {
        symbol.NachHintenBringen();
    }
    
    /**
     * Bringt die Turtle in die hinterste Ebene.
     */
    void GanzNachHintenBringen ()
    {
        symbol.GanzNachHintenBringen();
    }

    /**
     * Setzt die Turtle wieder an ihre Ausgangsposition.
     */
    void ZumStartpunktGehen()
    {
        symbol.ZumStartpunktGehen();
        x = symbol.x;
        y = symbol.y;
        winkel = symbol.winkel;
    }

    /**
     * Bewegt die Turtle nach vorne.
     * @param länge Anzahl der Längeneinheiten
     */
    void Gehen(double länge)
    {
        symbol.Gehen(länge);
        x = symbol.x;
        y = symbol.y;
    }
    
    /**
     * Dreht die Turtle
     * @param grad Drehwinkel (mathematisch positiver Drehsinn) im Gradmaß
     */
    void Drehen(int grad)
    {
        symbol.Drehen(grad);
        winkel = symbol.winkel;
    }

    /**
     * Versetzt Zeichenfläche und Turtle in den Ausgangszustand
     */
    void Löschen()
    {
        symbol.Löschen();
    }

    /**
     * Turtle wechselt in den Modus "nicht zeichnen"
     */
    void StiftHeben()
    {
        symbol.StiftHeben();
        stiftUnten = false;
    }

    /**
     * Turtle wechselt in den Modus "zeichnen"
     */
    void StiftSenken()
    {
        symbol.StiftSenken();
        stiftUnten = true;
    }

    /**
     * Gibt den aktuellen Winkel der Turtle zurück.
     * Die Winkelangabe ist in Grad, positive Werte drehen gegen den Uhrzeigersinn,
     * negative Werte drehen im Uhrzeigersinn (mathematisch positiver Drehsinn), d. h.
     * 0˚: Turtle schaut nach rechts,
     * 90˚: Turtle schaut nach oben,
     * 180˚: Turtle schaut nach links,
     * 270˚bzw. -90˚: Turtle schaut nach unten
     * @return Winkel im Gradmass
     */
    int WinkelGeben()
    {
        return winkel;
    }

    /**
     * Gibt die x-Koordinate der Turtle zurück
     * @return x-Koordinate
     */
    int XPositionGeben()
    {
        return x;
    }
    
    /**
     * Gibt die y-Koordinate der Turtle zurück
     * @return y-Koordinate
     */ 
    int YPositionGeben()
    {
        return y;
    }
    
    /**
     * Schaltet die Sichtbarkeit des Turtlesymbols ein oder aus.
     * Erlaubte Parameterwerte: true, false
     * @param sichtbar (neue) Sichtbarkeit des Turtlesymbols
     */
    void SichtbarkeitFürSymbolSetzen (boolean sichtbar)
    {
        symbol.SichtbarkeitFürSymbolSetzen(sichtbar);
    }
    
    /**
     * Testet, ob die Turtle eine Figur  berührt.
     * @return true, wenn die Turtlekoordinaten innerhalb einer Grafikfigur sind
     */
    boolean Berührt ()
    {
        return symbol.Berührt();
    }
    
    /**
     * Testet, ob die Turtle eine Figur in der angegebenen Farbe berührt.
     * @param farbe die Farbe, die die berührte Figur haben muss.
     * @return true, wenn die Turtlekoordinaten innerhalb einer Grafikfigur in der angegebenen Farbe sind
     */
    boolean Berührt (String farbe)
    {
        return symbol.Berührt(farbe);
    }

    /**
     * Testet, ob die Turtle die angegebene Figur berührt.
     * @param objekt das Objekt, das getestet werden soll.
     * @return true, wenn die Turtlekoordinaten innerhalb der angegebenen Grafikfigur sind
     */
    boolean Berührt (Object objekt)
    {
        return symbol.Berührt(objekt);
    }
}
