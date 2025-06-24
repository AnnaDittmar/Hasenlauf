import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * Zugriff auf die Ereignisse einschließlich Taktgeber.
 * 
 * @author Albert Wiedemann
 * @version 1.0
 */
public class Ereignisbehandlung
{
    /**
     * Der Konstruktor meldet den Taktgeber
     * und die Eventlistener bei der Zeichenfläche an.
     */
    Ereignisbehandlung ()
    {
        Zeichenfenster.AktionsEmpfängerEintragen(new Zeichenfenster.AktionsEmpfaenger()
        {
            public void Ausführen ()
            {
                TaktImpulsAusführen();
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
        });
    }
    
    /**
     * Die eigentliche Aktionsmethode des Zeitgebers.
     * <br>Muss bei Bedarf von einer Unterklasse überschrieben werden. 
     */
    void TaktImpulsAusführen ()
    {
        System.out.println ("Tick");
    }

    /**
     * Zeitgeber starten.
     */
    void Starten ()
    {
        Zeichenfenster.TaktgeberStarten();
    }

    /**
     * Zeitgeber anhalten.
     */
    void Anhalten ()
    {
        Zeichenfenster.TaktgeberStoppen();
    }
    
    /**
     * Ablaufgeschwindigkeit des Zeitgebers einstellen.
     * 
     * @param dauer: Angabe in Millisekunden
     */
    void TaktdauerSetzen (int dauer)
    {
        Zeichenfenster.TaktdauerSetzen(dauer);
    }
    
    /**
     * Die eigentliche Aktionsmethode für gedrückte Tasten.
     * <br>Muss bei Bedarf von einer Unterklasse überschrieben werden. 
     * @param taste die gedrückte Taste
     */
    void TasteGedrückt (char taste)
    {
        System. out. println ("Taste: " + taste);
    }
    
    /**
     * Die eigentliche Aktionsmethode für gedrückte Sondertasten.
     * <br>Muss bei Bedarf von einer Unterklasse überschrieben werden. 
     * @param taste KeyCode der gedrückten Taste
     */
    void SonderTasteGedrückt (int taste)
    {
        System. out. println ("Sondertaste: " + taste);
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
}
